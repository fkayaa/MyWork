package whileDo;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
         /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz...");

        int sayi = input.nextInt();
        int toplam = sayi;
        int sum = 0;
        while (sayi > 0) {

            int digit = sayi % 10;
            sum += Math.pow(digit,3);
            sayi = sayi/10;

        }
        if (toplam == sum) {
            System.out.println(toplam+" Sayı Armstrong bir sayıdır");

        }else {
            System.out.println(toplam+" Sayı Armstrong bir sayı değildir");
        }


        /* TASK :
        1 ile 1000 arasındaki Armstrong numberları yazdırınız.
        */




        int counter = 0;

        for (int i = 1; i < 1000; i++) {
            int sayi1=i;
            int sum1 = 0;
            while (sayi1 > 0) {
                int digit1 = sayi1 % 10;
                sum1 += Math.pow(digit1, 3);
                sayi1 = sayi1 / 10;

            }
            if (i == sum1) {
                System.out.println(i);
                counter += 1;
            }

        }
        System.out.println(counter + " tane Armstrong sayı vardır..");





    }
}
