package arrays;

import java.util.Arrays;

public class Task_02 {
    public static void main(String[] args) {
        /* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
         */

        int[][] arr = {{10,20,30},{4},{6,7,20}};

        int[] newArr = new int[arr.length];

        int sum = 0;
        int idx = 0;

        for (int[] w : arr) {

            for (int k : w) {

                sum += k;


            }
            newArr[idx] = sum;

            sum = 0;

            idx++;

        }

        System.out.println(Arrays.toString(newArr));


    }
}
