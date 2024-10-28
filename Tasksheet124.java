import java.util.*;
import java.util.function.*;


public class Tasksheet124 {

    static List<Integer> filteredNum(List<Integer> numbers,Predicate<Integer> condition){
        List<Integer> result= new ArrayList<>();
            for(int num:numbers){
                if(condition.test(num))
                result.add(num);
            }
            return result; 
        }


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, -2, 10, 15, -7, 8, 0, 21, -3, 5);

        Predicate<Integer> isPositive= num -> num > 0;
        Predicate<Integer> isEven= num -> num %2==0;
        Predicate<Integer> isGreaterThanTen= num -> num > 10;
        
        System.out.println("Original List: "+ numbers);
        System.out.println("Positive Numbers: " + filteredNum(numbers, isPositive));
        System.out.println("Even Numbers: " + filteredNum(numbers, isEven));
        System.out.println("Numbers Greater Than 10: " + filteredNum(numbers, isGreaterThanTen));

    }
}
