package forLoop;

import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Topun atıldığı yüksekliği giriniz");
        double yukseklik = input.nextDouble();
        double alinanYol = 0;
        int sekmeSayisi = 0;

        do {
            alinanYol += yukseklik;
            sekmeSayisi++;
            yukseklik = yukseklik * 3 / 4;
            System.out.println("Yükseklik : "+yukseklik);
            if (yukseklik >= 1) {
                alinanYol += yukseklik;

            }

        } while (yukseklik >= 1);
        System.out.println("Topun sekme sayısı : " + sekmeSayisi + "\nTopun Aldığı Toplam yol(metre) : " + alinanYol);
    }
}
