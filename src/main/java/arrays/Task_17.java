package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
         /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz ...");
        String[] str = input.nextLine().split("");

        int sayac = 0;

        for (int i = 0; i < str.length ; i++) {

            if (str[i].equals("")){
                continue;
            }
            for (int j = i+1; j < str.length ; j++) {

                if (str[i].equals(str[j])) {
                    sayac++;
                 str[j] = "";
                }


            }
            System.out.print(str[i] + " = " + (sayac+1)  +"     " ); 
            //j = 1     a = 4     v = 1     c = 2     i = 3     l = 3     r = 1       = 2     o = 2     k = 1     f = 1
            sayac = 0;
        }



    }
}
