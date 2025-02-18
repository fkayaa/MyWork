package stringmethods;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Ad-Soyad ve 16 hanelik kart numaranızı giriniz. ");

        String cardBilgisi = input.nextLine();
        String cardNo = cardBilgisi.trim().split(" ")[2];

        if (cardNo.length() < 16 ) {

            System.out.println("Geçersiz kredi kartı numarası");

        } else if (cardNo.length() == 16) {

            String ad = cardBilgisi.trim().split(" ")[0];
            String soyad = cardBilgisi.trim().split(" ")[1];
            String no = cardBilgisi.trim().split(" ")[2];

            String adFormat = ad.charAt(0) + "*".repeat(ad.length()-1);
            String soyadFormat = soyad.charAt(0) + "*".repeat(ad.length()-1);
            String cardFormat = "*".repeat(11)+ no.substring(12);

            System.out.println("Ad :" +adFormat+" "+"Soyad : " +soyadFormat+" "+ "Kart No : "+ cardFormat);


        }else System.out.println("Eksik ya da geçersiz bilgi");
    }
}
