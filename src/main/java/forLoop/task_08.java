package forLoop;

import java.util.Scanner;

public class task_08 {
    public static void main(String[] args) {
         /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın
        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz.");

        String s = input.next().toLowerCase();
        String c = s.split("c")[0];

        int a = 0;
        for (int i = 0; i <c.length() ; i++) {

            char ch = c.charAt(i);
            if (ch == 'a') {

                a++;
            }
        }


        System.out.println("Cümledeki c harfine kadar a sayısı : " + a);

    }
}
