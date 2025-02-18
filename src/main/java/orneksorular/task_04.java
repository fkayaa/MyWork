package orneksorular;

import java.util.Scanner;

public class task_04 {
    public static void main(String[] args) {

        /*
        TASK :
         Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
         Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz");

        int sayi = input.nextInt();

        if (sayi<0){
            System.out.println("Lütfen pozitif bir sayı giriniz.");
        } else if (sayi >=100 && sayi<1000) {

            System.out.println("Sayı 3 basamaklı bir sayıdır.");

        } else if (sayi%2==0) {
            System.out.println("3 basamaklı olmayan çift sayı");

        }else {
            System.out.println("3 basamaklı olmayan tek sayı");
        }

    }
}
