package stringmethods;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        /* TASK :
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");

        String kelime = input.nextLine();

        if (kelime.length() >= 3) {

            String sonHali = kelime.substring(kelime.length()-2);
            System.out.println(sonHali+sonHali+sonHali);
        }else {
            System.out.println("kelime = " + kelime);
        }


    }
}
