public class Tasksheet120 {

    public static int cumulatedSum(int... numbers){
        int totalSum = 0;

        for (int number: numbers) {
            int cumulatedSum= 0;

            for (int i = 1; i <= number; i++) {
                cumulatedSum+=i;
            }

            System.out.println("Cumulative sum for " + number + "is: " + cumulatedSum);

            totalSum += cumulatedSum;
            
        }


        return totalSum;
    }

    public static void main(String[] args) {
        int total = cumulatedSum(4, 5 ,10);

        System.out.println("Total sum of cumulative sums is: " + total );
    }

}