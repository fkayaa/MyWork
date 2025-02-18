package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)
         */

        Scanner input = new Scanner(System.in);
        int[] arr = new int[8];
        int count =0;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Lütfen "+ (i + 1) + ". sayıyı giriniz...");
            arr[i] = input.nextInt();

            if (arr[i]%3==0) {
                count++;

            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Girdiğiniz sayıların "+count + " tanesi 3'e tam bölünüyor");




    }
}
