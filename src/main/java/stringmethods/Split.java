package stringmethods;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
               /* TASK :
           Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
           ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adınızı soyadınızı giriniz.");

        String s = input.nextLine();

        String ad = s.trim().split("\\s")[0];
        String soyad =s.trim().split("\\s")[1];

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);



    }


}
