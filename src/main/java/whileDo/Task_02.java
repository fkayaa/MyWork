package whileDo;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {

         /*   Kullanicidan 2 sayi alaliniz.
         1. sayi taban
         2. sayi Us
         1 sayinin ussunu hesaplatan code create ediniz.
          3, 3  sonuc = 27
         2  3 = 2*2*2=8
        */
        Scanner scanner = new Scanner(System.in);
        int taban, us;
        double sonuc;

        do {
            System.out.print("Tabanı giriniz (pozitif bir sayı): ");
            taban = scanner.nextInt();
        } while (taban < 0);

        do {
            System.out.print("Üssü giriniz (pozitif bir sayı): ");
            us = scanner.nextInt();
        } while (us < 0);

        sonuc = 1;

        int i = 0;
        do {
            sonuc *= taban;
            i++;
        } while (i < us);

        System.out.println("Sonuç: " + sonuc);
    }
}


