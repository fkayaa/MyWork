package projectexample;

import java.util.Scanner;

public class Almanya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nereye yolculuk etmek istiyorsunuz? \n Frankfurt : 60 KM \n Köln : 80 KM \n " +
                "(20 KM başına 5 euro bilet parası alınmaktadir..)");
        String rota = input.nextLine().trim().toUpperCase();

        int kmFrankfurt = 60;
        int kmKoln = 80;
        double kmBirimFiyat = 5.0 / 20;
        double biletFiyat = 0;
        int toplamTutar = 0;

        switch (rota) {
            case "FRANKFURT":
                biletFiyat = 60 * kmBirimFiyat;
                System.out.println("Frankfurt " + biletFiyat + " Euro");

            case "KOLN":
                biletFiyat = 80 * kmBirimFiyat;
                System.out.println("Koln " + biletFiyat + " Euro");
                break;

            default:
                System.out.println("Gecersiz rota! Lütfen Frankfurt veya Koln giriniz.");
        }

        System.out.println("Kac kisilik blet istiyorsunuz \n Maksimimum 2 kisilik olabilir");
        int kisiSyisi = input.nextInt();

        switch (kisiSyisi) {
            case 1 :
                System.out.println("1 kisilik");
                break;
            case 2 :
                toplamTutar = (int) (2*biletFiyat);
                System.out.println("2 kisilik toplam tutar "  + toplamTutar);
                break;
            default:
                System.out.println("Gecersiz kisi sayisi! Lütfen 1 veya 2 giriniz.");
        }

        System.out.println(rota +" " + kisiSyisi + " kisilik");

        System.out.println("Bakiyenizi giriniz");
        double bakiye = input.nextDouble();
        System.out.println(toplamTutar);
        double paraUstu = bakiye - toplamTutar;

        System.out.printf("Toplam tutar :%,.2f Euro\n ",paraUstu);

        if(paraUstu>=0){
            System.out.printf("Para ustu: %,.2f Euro\n",paraUstu);
        } else {
            System.out.printf("Yetersiz bakiye! %.2f Euro eksik.\n", -paraUstu);
        }
    }
}
