package stringmethods;

import java.util.Scanner;

public class CharAt {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 3 harfli bir isim giriniz");

        String isim = input.nextLine().toLowerCase();

        String kontrol = (isim.length()==3) ? ((isim.charAt(0) != isim.charAt(1)) && (isim.charAt(1) != isim.charAt(2))&& (isim.charAt(0) != isim.charAt(2)) ? ("İsim Unique"):("İsimde tekrarlanan harfler var")) : ("Kontrol için 3 harfli bir isim giriniz");
        System.out.println("İsim Kontrolü = " + kontrol);
    }

}
