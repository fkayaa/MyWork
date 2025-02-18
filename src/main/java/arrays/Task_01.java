package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        /* TASK :
     kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
     ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
     java code create ediniz.
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen eleman sayısını giriniz ...");

        int elemanSayisi = input.nextInt();

        int[] array = new int[elemanSayisi];

        for (int i = 0; i < elemanSayisi ; i++) {

            System.out.println(i + 1 + ". Elemanı giriniz...");
            array[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(array));

       Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int siralama = array[array.length-1] - array[0];
        System.out.println("en büyük sayı ile en küçük sayı farkı  = " + siralama);





    }
}
