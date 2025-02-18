package orneksorular;

import java.util.Scanner;

public class task_08 {
    public static void main(String[] args) {
        /*  TASK :
    Kullanıcıdan üç adet sayı alarak bu sayıların
    bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
    (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
    bağlantısından yararlanabilirsiniz)

    Örnek Ekran Çıktısı
    birinci kenarı giriniz: 2
    ikinci kenarı giriniz 15
    üçüncü kenarı giriniz: 7
    Bu bir dik üçgen değildir.

    Bu bir dik üçgendir
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kenar uzunlugunu giriniz.");
        double sayi1 = input.nextDouble();
        System.out.println("Lütfen kenar uzunlugunu giriniz.");
        double sayi2 = input.nextDouble();
        System.out.println("Lütfen kenar uzunlugunu giriniz.");
        double sayi3 = input.nextDouble();

        boolean dikücgen =(sayi1*sayi1 == sayi2*sayi2+sayi3*sayi3)||(sayi2*sayi2==sayi1*sayi1+sayi3*sayi3)||(sayi3*sayi3==sayi1*sayi1+sayi2*sayi2);

        if (dikücgen){
            System.out.println("Dik üçgendir");
        }else {
            System.out.println("Dik üçgen değildir");
        }



    }
}
