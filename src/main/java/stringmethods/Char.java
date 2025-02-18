package stringmethods;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
         /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */

        Scanner input = new Scanner(System.in);

        System.out.println("3 Kelimeden oluşan isminizi yazınız");

        String adSoyad = input.nextLine().trim();

        System.out.println(adSoyad.split(" ")[0].charAt(0) + "." + adSoyad.split(" ")[1].charAt(0) + "." + adSoyad.split(" ")[2].charAt(0));


    }
}
