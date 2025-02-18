package orneksorular;

import java.util.Scanner;

public class Gün {
    public static void main(String[] args) {
        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        //pazartesi hafta başlangıcı

        System.out.println("Yaşadığınız günü giriniz\n0.Pazartesi\n1.Salı\n2.Çarşamba\n3.Perşembe\n4.Cuma\n5.Cumartesi\n6.Pazar");

        Scanner input = new Scanner(System.in);


        int gun = input.nextInt();
        if ((gun + 100) % 7 == 0) {
            System.out.println("100 gün sonra pazartesi.");
        }
        if ((gun + 100) % 7 == 1) {
            System.out.println("100 gün sonra salı.");
        }
        if ((gun + 100) % 7 == 2) {
            System.out.println("100 gün sonra çarşamba.");
        }
        if ((gun + 100) % 7 == 3) {
            System.out.println("100 gün sonra perşembe.");
        }
        if ((gun + 100) % 7 == 4) {
            System.out.println("100 gün sonra cuma.");
        }
        if ((gun + 100) % 7 == 5) {
            System.out.println("100 gün sonra cumartesi.");
        }
        if ((gun + 100) % 7 == 6) {
            System.out.println("100 gün sonra pazar.");
        }


    }
}