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
        return a/b;
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter your first number: ");
        float x=scan.nextFloat();

        System.out.print("Enter your 2nd number: ");
        float y=scan.nextFloat();

        float sum= calSum(x, y);
        float diff= calDiff(x, y);
        float product= calPro(x, y);
        float quotient= calQuo(x, y);

        System.out.println("The Sum is: " + formatOutput(sum));
        System.out.println("The Difference is: " + formatOutput(diff));
        System.out.println("The Product is: " + formatOutput(product));
        System.out.println("The Quotient is: " + formatOutput(quotient));
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



