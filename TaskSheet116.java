import java.util.*;
public class Tasksheet116 {
    public static void main(String[] args) {

        String input= "Kamusta";
        StringBuilder sb= new StringBuilder(input);

        String reverseString=sb.reverse().toString();
        
        if (input.equals(reverseString)) {
            System.out.println("The input string is a palindrome");
            
        }else{
            System.out.println("The input string is not a palindrome");
        }
        
    }
    
}
