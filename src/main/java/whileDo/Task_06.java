package whileDo;

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Alacagınız ürün adedini giriniz");
        int urun = input.nextInt();
        System.out.println("Liste fiyatını giriniz ");

        int fiyat = input.nextInt();

        System.out.println("Kredi kartınız var mı ? \n Evet : 'true' \n Hayır : 'false' ");
        boolean control = input.nextBoolean();

      double result =   (control == true) ? (urun>10 ? (urun*fiyat*0.8) : (urun*fiyat*0.85)) : (urun>10 ? (urun*fiyat*0.85) : (urun*fiyat*0.9));
        System.out.println(urun +"  tane ürünüzün ücreti : " + result);

    }
}
