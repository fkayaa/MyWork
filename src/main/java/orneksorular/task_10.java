package orneksorular;

import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        //Kullanıcıdan 100 üzerinden notunu isteyin
        //Notu harf sistemine çevirip yazdırın
        //50'den küçükse D
        //=50 <60 arası C
        //=60 <80 arası B
        //=80 nin üzeri A

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 100 üzerinden notunuzu giriniz.");

        int not = input.nextInt();

        if (not >= 80){
            System.out.println("A");
        } else if (not >= 60) {
            System.out.println("B");
        }else if (not >= 50) {
            System.out.println("C");
        }else if (not < 50) {
            System.out.println("D");
        }else {
            System.out.println("Lütfen notunuzu 100 üzerinden giriniz.");
        }

        //deneme-java question bank:
        System.out.println('a' + 'b'); //195 yazdırır.ascii degerlerini

        char harf = 'b';
        System.out.println(harf); //b yazar

       /* byte b1 = 10;
        byte b2 = 20;
        byte b3 = b1 * b2;
        System.out.println(b3);
        compile time error veriyor,çarpma ile byte aşıldı,int oldu
        */
    }
}
