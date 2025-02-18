package forLoop;

import java.util.Scanner;

public class task_06 {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.
         */
      //ey edip adanada pide ye :)

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz...");

        String kelime = input.nextLine().toLowerCase();

        String reverse = "";

        for (int i = kelime.length()-1; i >=0 ; i--) {

            reverse += kelime.charAt(i);
        }

        if (kelime.equals(reverse)){
            System.out.println(kelime+" : Polindrome dur ");

        }else System.out.println(kelime+" : Polindrome değildir.");


    }
}
