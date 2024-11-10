import java.util.*;


class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}


class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class Tasksheet130 {
    
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the first number: ");
            a = getInput(scanner);
            
            System.out.print("Enter the second number: ");
            b = getInput(scanner);
            
            if (b == 0) {
                throw new DivisionByZeroException("Cannot divide by zero!");
            }
            
            int result = a / b;
            System.out.println("Result: " + result);
            
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
            
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
            
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
            
        } finally {
            scanner.close();
        }
    }
   
    private static int getInput(Scanner scanner) throws InvalidInputException {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine(); 
            throw new InvalidInputException("Please enter a valid integer.");
        }
    }
}
