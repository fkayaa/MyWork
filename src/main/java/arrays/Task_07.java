package arrays;

public class Task_07 {
    public static void main(String[] args) {
        /* TASK :
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 80
         */

        int[][] arr = {{1,2,-3},{41,55},{-61,-17,80}};

        int max = arr[0][0];

        for (int[] w : arr) {

            for (int k : w) {

               max = Math.max(max , k);

            }


        }
        System.out.println(max);







    }
}
