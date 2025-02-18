package orneksorular;

import java.util.Scanner;

public class task_01 {
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

        if (sayi<0) {
            System.out.println("Sayı negatiftir.");
        } else if (sayi >= 0) {

            if (sayi<10){
                System.out.println("Rakam");
            }else {
                System.out.println("Pozitif Sayı");
            }


        }
    }
}
