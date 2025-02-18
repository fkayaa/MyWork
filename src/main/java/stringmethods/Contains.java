package stringmethods;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi giriniz");

        String mailAdresses = input.nextLine();

        if (!mailAdresses.contains("@")) {
            System.out.println("Geçerli bir email giriniz");
        } else if (mailAdresses.endsWith("gmail.com")) {

            System.out.println("Mail onaylandı");

        }else System.out.println("Lütfen gmail hesabınızı girin");
    }
}
