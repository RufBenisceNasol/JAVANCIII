import java.util.*;

public class Tasksheet119 {
    
    //return for Quotient
    private static float calSum(float a, float b){
        return a+b;
    }

    //return for Quotient
    private static float calDiff(float a, float b){
        return a-b;
    }

    //return for Quotient
    private static float calPro(float a, float b){
        return a*b;
    }

    //return for Quotient
    private static float calQuo(float a, float b){
        if (b == 0) {
            System.out.println("The zero Value is not allowed");
            return Float.NaN;
        }
        return a/b;
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter your first number: ");
        float x=scan.nextFloat();

        System.out.print("Enter your 2nd number: ");
        float y=scan.nextFloat();
        System.out.println("The Sum is: " + formatOutput(calSum(x, y)));
        System.out.println("The Difference is: " + formatOutput(calDiff(x, y)));
        System.out.println("The Product is: " + formatOutput(calPro(x, y)));
        if (Float.isNaN(calQuo(x, y))) {
            System.out.println("The quotient is: Undefined because it devided by zero");   
        }else{
            System.out.println("The Quotient is: " + formatOutput(calQuo(x, y)));
        }
        scan.close();
    }

    //method formatter
    private static String formatOutput(float val){
        if (val==(int)val) {
            return String.valueOf((int) val);
        }else{
            return String.valueOf(val);
        }
    }
}



