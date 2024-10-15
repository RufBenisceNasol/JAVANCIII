import java.util.*;
public class Tasksheet116 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("Input Any words: ");
        String input= scan.nextLine();
        StringBuilder sb= new StringBuilder(input);

        String reverseString=sb.reverse().toString();
        
        if (input.equals(reverseString)) {
            System.out.println("The input string is a palindrome");
            
        }else{
            System.out.println("The input string is not a palindrome");
        }
        
    }
    
}
