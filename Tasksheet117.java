import java.util.*;

public class Tasksheet117 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Type your 1st Number:");
        int num1=scan.nextInt();
        
        System.out.print("Type your 2nd Number:");
        int num2=scan.nextInt();

        System.out.print("Type your 3rd Number:");
        int num3=scan.nextInt();

        if (num1==num2 && num2==num3) {
            System.out.println("All numbers are equal");
            
        } else {
            int largest=num1;

            if (num2 > largest) {
                largest =num2;   
            }

            if (num3 > largest) {
                largest= num3;
                
            }

            System.out.println("The largest number is: " + largest);
        }
    }  
}
