package atm_project;

import java.util.Scanner;
     /* ATM
        Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
                Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

                Bakiye sorgula,
                 para yatirma,
                  para çekme,
                  para gönderme,
                   sifre değiştirme ve
                   cikis.

                Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
                Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
     */


public class Atm {

    public void login(User user) {
        Scanner input = new Scanner(System.in);
        boolean control = false;

        do {
            System.out.println("Lütfen kart numaranızı giriniz");
            String girilen_iban = input.nextLine().replaceAll(" ", "");
            System.out.println("Lütfen şifrenizi giriniz");
            String girilen_password = input.nextLine();

            if (girilen_iban.equals(user.getCardNo()) && girilen_password.equals(user.getPassword())) {
                System.out.println("Hesabınıza hoşgeldiniz ...");
                control = true;
            } else {
                System.out.println("Lütfen bilgilerinizi doğru giriniz.");
            }
        } while (!control);

        // Menü döngüsü
        while (control) {
            control = showMenu(input, user);
        }
    } // login sonu

    private boolean showMenu(Scanner input, User user) { //Atm show
        System.out.println("Lütfen yapmak istediğiniz işlem numarasını seçiniz...");
        System.out.println("1. Bakiye sorgula");
        System.out.println("2. Para yatirma");
        System.out.println("3. Para çekme");
        System.out.println("4. Para gönderme");
        System.out.println("5. Şifre değiştirme");
        System.out.println("0. Çıkış");

        int secim = input.nextInt();
        input.nextLine(); //bunu yazınca ,terminalde hızla geçiş engellendi

        if (secim == 1) {
            bakiye_kontrol(user);
        } else if (secim == 2) {
            para_yatirma(input, user);
        } else if (secim == 3) {
            para_cekme(input, user);
        } else if (secim == 4) {
            havale_edilen_para(input, user);
        } else if (secim == 5) {
            changePassword(input, user);
        } else if (secim == 0) {
            System.out.println("Çıkış yapılıyor ... İyi günler");
            return false; // Çıkış yapılıyor, döngüyü sonlandır
        } else {
            System.out.println("Lütfen uygun bir seçim yapınız.");
        }

        return true; // Menü tekrar gösterilecek
    } //Atm show menü sonu

    private void bakiye_kontrol(User user) {//User classından getirecek
        System.out.println("Bakiyeniz: " + user.getBakiye() + "TL");
    }

    private void para_yatirma(Scanner input, User user) { //input.nextDouble(); Burada, input adlı Scanner nesnesi kullanılarak kullanıcıdan bilgi alınır.
                                                          //user.setBakiye(yatirilan_para); bu yatırılan para miktarı kullanıcının bakiyesine eklenir.
        System.out.println("Yatırmak istediğiniz parayı giriniz..");
        double yatirilan_para = input.nextDouble();
        user.setBakiye(yatirilan_para);
        System.out.println("Güncel hesabınız: " + user.getBakiye() + "TL");
    }

    private void para_cekme(Scanner input, User user) {
        System.out.println("Çekmek istediğiniz tutarı giriniz.");
        double cekilen_para = input.nextDouble();
        user.setBakiye1(cekilen_para);
        System.out.println("Güncel hesabınız: " + user.getBakiye() + "TL");
    }

    private void havale_edilen_para(Scanner input, User user) {
        System.out.println("Para Gönderme");
        System.out.println("Bakiyeniz: " + user.getBakiye() + " TL");
        System.out.println("Havale yapmak istediğiniz IBAN numarasını giriniz.");
        String havale_iban = input.nextLine().replaceAll(" ", "").toUpperCase();
        if (!havale_iban.startsWith("TR")) {
            System.out.println("İban numaranız TR ile başlamalıdır.");
            havale_edilen_para(input,user); //iBAN YANLIŞ OLDUGUNDA TEKRAR METHOD ÇALIŞSIN
        } else if (havale_iban.length() != 26) {
            System.out.println("Iban numaranız 26 haneli olmalı.");
            havale_edilen_para(input,user);//iBAN YANLIŞ OLDUGUNDA TEKRAR METHOD ÇALIŞSIN
        } else {
            System.out.println("Havale etmek istediğiniz tutarı giriniz...");
            double havale = input.nextDouble();
            user.setBakiye1(havale);
            System.out.println("Havale işleminiz başarıyla gerçekleşmiştir.");
            System.out.println("Güncel hesabınız: " + user.getBakiye() + "TL");
        }
    }

    private void changePassword(Scanner input, User user) {
        System.out.println("Güncel şifrenizi giriniz");
        String currentPassword = input.nextLine();
        System.out.println("Yeni şifrenizi giriniz");
        String newPassword = input.nextLine();
        System.out.println("Yeni şifrenizi tekrar giriniz");
        String confirmPassword = input.nextLine();
        if (user.getPassword().equals(currentPassword)) {
            if (newPassword.equals(confirmPassword)) {
                user.setPassword(newPassword);
                System.out.println("Şifreniz güncellenmiştir. Yeni şifreniz: " + user.getPassword());
            } else {
                System.out.println("Yeni şifreler uyuşmuyor.");
            }
        } else {
            System.out.println("Geçersiz şifre.");
        }
    }
}