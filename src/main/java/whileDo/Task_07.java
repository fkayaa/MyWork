package whileDo;

import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        /*   TASK :
             Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
             tamkare ise true  değilse false yazdırınız.
              Not: sqrt gibi fonksiyonları  kullanmayın.
              Example 1:
              Input: 16
              Output: true
              Not: bu sayı tamkare çünkü 4*4 = 16
              Example 2:
              Input: 25
              Output: true
              Note: bu sayı tamkare çünkü 5*5=25
              Example 3:
              Input: 14
              Output: false
           */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz");
        int sayi = input.nextInt();

        int i = 1;
        boolean tamKare = false;
        do {
            if (sayi == i*i) {
                tamKare = true;
            }

            i++;

        }while (!tamKare && i<=sayi/2);

        if (tamKare) {
            System.out.println(" Sayısı tam karedir");
        }else {
            System.out.println("Sayısı tam kare değildir");
        }


    }
}
