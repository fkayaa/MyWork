package forLoop;

import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        /*
         *  Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
         * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
         * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 2 tane tamsayı giriniz");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        /*
        4 ve 6
         */
        // EBOB hesaplama
        int ebob = 1;
        int min = (num1 < num2) ? num1 : num2; // Küçük olanı alıyoruz
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i; // Her iki sayıyı bölen en büyük sayı
            }
        }
        /*
        A*B = Ekok(A,B) * Ebob(A,B)
         */
        // EKOK hesaplama
        int ekok = (num1 * num2) / ebob; // EKOK formülü
        // Sonuçları yazdırma
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}


