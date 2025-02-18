package orneksorular;

import java.util.Scanner;

public class task_03 {
    public static void main(String[] args) {
        /*
        TASK :
         Kullanicidan bir character girmesini isteyiniz
         Character harf ise kucuk harf olup olmadigini kontrol ediniz
         Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
         Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
         Harf degilse ekrana "Harf degil" yazdiriniz
        97:a  122:z ascii değeri
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz.");

        char harf = input.next().charAt(0);

        if (harf>='a' && harf<='z'){

            System.out.println("Küçük harf");

        } else if (harf>='A' && harf<='Z') {

            System.out.println("Büyük harf");

        }else {
            System.out.println("Harf değil");
        }


    }



}
