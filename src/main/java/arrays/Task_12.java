package arrays;

import java.util.Arrays;

public class Task_12 {
    public static void main(String[] args) {
        /* Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların
        toplamını birer birer bulan ve herbir sonucu yeni bir array’in elemanı yapan
         ve yeni array’i ekrana yazdıran bir program yazınız
         Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}
        */

        int[][] arr = { {1,2,3}, {4,5}, {6,7} };
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
        System.out.println(Arrays.toString(newArr)); //[6, 9, 13]



    }
}
