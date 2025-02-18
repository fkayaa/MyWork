package orneksorular;

import java.util.Scanner;


public class task_11 {

    public static void main(String[] args) {
        System.out.println("Hangi kahveyi istersiniz?\n1.Türk Kahvesi\n2.Filtre Kahve\n3.Espresso");
        System.out.println("Bir seçim giriniz (1,2,3)");

        Scanner sc = new Scanner(System.in);
        int secim = sc.nextInt();
        System.out.println(hangiKahve(secim));


        System.out.println("Süt eklememizi ister misiniz?\nEvet\nHayır");




        String sut = sc.next();

        if (sut.equalsIgnoreCase("Evet"))
            System.out.println("Süt ekleniyor.");
        else if (sut.equalsIgnoreCase("Hayır"))
            System.out.println("Süt eklenmiyor.");




        System.out.println("Şeker ister misiniz?\nEvet\nHayır");

        String cevap=sc.next();

        if (cevap.equalsIgnoreCase("Evet"))

        {
            System.out.println("Kaç şeker olsun?");
            int seker = sc.nextInt();
            System.out.println(seker +" seker" + " ekleniyor.");
        }
        else if (cevap.equalsIgnoreCase("Hayır")) {
            System.out.println("Şeker eklenmiyor.");
        }


        System.out.println("Hangi boyutta olsun?\nBüyükboy\nOrtaboy\nKüçükboy");

        String cvp = sc.next();

        if (cvp.equalsIgnoreCase("Büyükboy"))
            System.out.println("Kahveniz "+ cvp + " hazırlanıyor.");
        else if (cvp.equalsIgnoreCase("Ortaboy"))
            System.out.println("Kahveniz "+ cvp + " hazırlanıyor.");
        else if(cvp.equalsIgnoreCase("Küçükboy"))
            System.out.println("Kahveniz "+ cvp + " hazırlanıyor..");

        System.out.println(hangiKahve(secim,cvp));

    }

    static String hangiKahve(int i) {

        if (i == 1)
            return "Türk Kahvesi hazırlanıyor...";
        else if (i == 2)
            return "Filtre Kahve hazırlanıyor...";
        else if (i == 3)
            return "Espresso hazırlanıyor...";
        else
            return "Hatalı tuşlama yaptınız";

    }

    static String hangiKahve(int i,String boyut) {

        if (i == 1)
            return "Türk Kahvesi "+ boyut + " hazırdır.";
        else if (i == 2)
            return "Filtre Kahve " + boyut + " hazırdır.";
        else if (i == 3)
            return "Espresso "+ boyut + " hazırdır.";
        else
            return "Hatalı tuşlama yaptınız";

    }


}