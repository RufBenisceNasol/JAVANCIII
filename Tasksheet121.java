import static java.lang.Math.*;


public class Tasksheet121 {
    
    public static int add(int a, int b) {
        // Your code here
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        // Your code here
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        // Your code here
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        // Your code here
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        int a= 20;
        int b= 15;

        System.out.println("Addition of "+ a + " and "+ b + " is equals to "+ add(a, b));
        System.out.println("Subtraction of "+ a + " and "+ b + " is equals to "+ subtract(a, b));
        System.out.println("Multiplication of "+ a + " and "+ b + " is equals to "+ multiply(a, b)); 
        System.out.println("Division of "+ a + " and "+ b + " is equals to "+ divide(a, b));

    }
}

