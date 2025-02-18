package whileDo;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
          /* TASK :
          Verilen bir sayının faktöriyelini özyineli (recursive) olarak
          hespalayan fonksiyonu yazınız.
          Örnek Ekran Çıktıları
          Bir sayi giriniz: 6*5*4*3*2*1=720
          Faktöriyeli: 720
          Bir sayı giriniz: 3*2*1
          Faktöriyeli 6
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz ...");
        int sayi = input.nextInt();

        int sayi2 = sayi;
        int result = 1;


        while (sayi>1) {

            result *= sayi;

            System.out.print(sayi+" * ");
            sayi--;



        }


        System.out.println("1 = "+result);



    }
}
