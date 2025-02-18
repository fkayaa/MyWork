package projectexample;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        //Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz


        Scanner input = new Scanner(System.in);
        double bakiye = 1000.0;
        System.out.println("Hangi işlemi yapmak istiyorsunuz ?");
        System.out.println("1.Bakiye Öğrenme \n2.Para Yatırma \n3.Para Çekme \n4.Çıkış İşlemleri");

        int secim = input.nextInt();

        if (secim == 1){

            System.out.println("mevcut bakiyeniz  = " + bakiye);

        } else if (secim == 2) {

            System.out.println("Yatıracagınız miktarı giriniz");
            double yatirilanpara = input.nextDouble();
            bakiye += yatirilanpara;
            System.out.println("yeni bakiye = " + bakiye);


        } else if (secim == 3) {

            System.out.println("Çekmek istediğiniz tutarı giriniz");
            double cekilenpara = input.nextDouble();
            bakiye -= cekilenpara;
            System.out.println("kalan bakiyeniz = " + bakiye);


        } else if (secim == 4) {

            System.out.println("Çıkış işleminiz başarı ile tamamlanmıştır.İyi Günler");

        }else {

            System.out.println("Lütfen 1 den 4 e kadar bir sayı giriniz.");
        }



    }



}
