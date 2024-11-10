import java.util.Scanner;

class User {
    private int id;
    private int pin;
    private String name;
    private double balance;

    public User(int id, int pin, String name, double balance) {
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
    }

    public int getId() { return id; }
    public int getPin() { return pin; }
    public String getName() { return name; }
    public double getBalance() { return balance; }

    public void cashIn(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("========= Success! =========\nYour total balance is: " + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public boolean transferCash(User receiver, double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            receiver.balance += amount;
            System.out.println("Transfer successful! New balance: " + balance);
            return true;
        } else {
            System.out.println("Transfer failed. Check balance or enter a valid amount.");
            return false;
        }
    }
}

public class bankingApp {
    private static User[] users = {
        new User(1111, 1111, "Ruf Nasol", 10000),
        new User(2222, 2222, "John Wick", 34567),
        new User(3333, 3333, "Johny English", 234242),
    };

    private static User loggedInUser = null;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("======= Login to Your Account =======");
        if (login()) {
            displayMenu();
        }
    }

    private static boolean login() {
        clearScreen();  // Clear the screen before login
        System.out.println("=========Log In your Account=========");

        while (true) {
            System.out.print("Enter user ID: ");
            if (!scanner.hasNextInt()) {
                System.out.println("ID must be a numeric value. Please try again.");
                scanner.next();  // Clear the invalid input
                continue;
            }
            int id = scanner.nextInt();

            System.out.print("Enter PIN: ");
            if (!scanner.hasNextInt()) {
                System.out.println("PIN must be a numeric value. Please try again.");
                scanner.next();  // Clear the invalid input
                continue;
            }
            int pin = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (id <= 0 || pin <= 0) {
                System.out.println("ID and PIN must be positive numbers. Please try again.");
                continue;
            }

            for (User user : users) {
                if (user.getId() == id && user.getPin() == pin) {
                    loggedInUser = user;
                    return true;
                }
            }

            System.out.println("Invalid credentials. Please try again.");
        }
    }

    private static void displayMenu() {
        while (true) {
            clearScreen();  // Clear the screen before showing the menu
            System.out.println("===Welcome, " + loggedInUser.getName() + "!===");
            System.out.println("========== MENU ==========");
            System.out.println("1. Check Balance\n2. Cash-In\n3. Money Transfer\n4. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1 -> checkBalance();
                case 2 -> cashIn();
                case 3 -> moneyTransfer();
                case 4 -> logout();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void checkBalance() {
        clearScreen();  // Clear screen before checking balance
        System.out.println("=========BALANCE=========");
        
        if (loggedInUser.getBalance() < 0) {
            System.out.println("Error: Negative balance is not allowed. Please contact support.");
        } else if (loggedInUser.getBalance() == 0) {
            System.out.println("Your balance is 0. You need to cash in to perform transactions.");
        } else {
            System.out.println(loggedInUser.getBalance());
        }
        
        waitForEnter("Press Enter to return to the menu...");
    }

    private static void cashIn() {
        clearScreen();  // Clear screen before cash-in
        System.out.println("=========CASH IN=========");
        while (true) {
            System.out.print("Enter amount to cash-in: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();  // Clear invalid input
                continue;
            }

            double amount = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            if (amount <= 0) {
                System.out.println("Invalid amount. Please enter a positive value.");
            } else {
                loggedInUser.cashIn(amount);
                break;  // Exit loop after a successful cash-in
            }
        }

        waitForEnter("Press Enter to return to the menu...");
    }

    private static void moneyTransfer() {
        int receiverId;
        double amount;
        clearScreen();

        System.out.println("=========CASH TRANSFER=========");
        // Prompt for recipient user ID with validation
        while (true) {
            System.out.print("Enter recipient user ID: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Recipient ID must be a numeric value.");
                scanner.next();  // Clear invalid input
                continue;  // Re-prompt for recipient user ID
            }
            receiverId = scanner.nextInt();
            if (receiverId <= 0) {
                System.out.println("Invalid input. Recipient ID must be a positive number.");
                continue;
            }
            break;
        }

        // Prompt for transfer amount with validation
        while (true) {
            System.out.print("Enter amount to transfer: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Amount must be a numeric value.");
                scanner.next();  // Clear invalid input
                continue;  // Re-prompt for transfer amount
            }
            amount = scanner.nextDouble();
            scanner.nextLine();  // Consume newline
            if (amount <= 0) {
                System.out.println("Invalid amount. Please enter a positive value.");
                continue;
            }
            break;
        }

        // Find receiver and perform transfer
        User receiver = findUserById(receiverId);
        if (receiver == null) {
            System.out.println("Invalid recipient ID. Please try again.");
        } else if (receiver == loggedInUser) {
            System.out.println("You cannot transfer money to yourself.");
        } else {
            loggedInUser.transferCash(receiver, amount);
        }

        waitForEnter("Press Enter to return to the menu...");
    }

    private static User findUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    private static void logout() {
        clearScreen();  // Clear screen before logging out
        System.out.println("Logged out successfully.");
        System.out.println("\n======= Login to Your Account =======");
        loggedInUser = null;
        if (login()) {
            displayMenu();
        }
    }

    private static void clearScreen() {
        // Clear the terminal screen (works in most terminals)
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void waitForEnter(String message) {
        System.out.println(message);
        System.out.println("========================");
        scanner.nextLine();
    }
}