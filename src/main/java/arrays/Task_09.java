package arrays;

import java.util.Arrays;

public class Task_09 {
    public static void main(String[] args) {
        /* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */


        int[] sayi = {2,6,4,5,8,9};
        int[] kareselSayi = new int[sayi.length];

        for (int i = 0; i < sayi.length; i++) {

            kareselSayi[i] = sayi[i] * sayi[i]; //[4, 36, 16, 25, 64, 81]
        }
        System.out.println(Arrays.toString(kareselSayi));
    }
}
