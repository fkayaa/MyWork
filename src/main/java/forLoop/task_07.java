package forLoop;

import java.util.Scanner;

public class task_07 {
    public static void main(String[] args) {
        /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 5 tane sayı giriniz..");

        int sum = 0;

        for (int i = 0; i <5 ; i++) {



            int num = input.nextInt();

            if (num<5 || num >10) {

                sum += num ;

            }

        }
        System.out.println("Girdiğiniz sayıların 5 ile 10 arasındakiler hariç toplamı  = " + sum);
    }
}
