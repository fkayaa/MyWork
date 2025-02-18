package orneksorular;

import java.util.Scanner;

public class task_02 {

    public static void main(String[] args) {
        /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");

        int sayi = input.nextInt();

        String result = (sayi >= 0) ? ((sayi<10)? ("Rakamdır"):("Pozitif Sayıdır")) : ("Negatif sayıdır");
        System.out.println("Sayı = " + result);
    }
}
