package orneksorular;

import java.util.Scanner;

public class task_06 {
    public static void main(String[] args) {
        /* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve
    en kucuk olanlarini konsola yazdiriniz
    int num1
    int num2
    int num3
*/
        Scanner input = new Scanner(System.in);
        System.out.println("1.numara giriniz.");
        int num1 = input.nextInt();

        System.out.println("2.numara giriniz.");
        int num2 = input.nextInt();

        System.out.println("3.numara giriniz.");
        int num3 = input.nextInt();


       if (num1>num2 && num1>num3){
           System.out.println("En büyük sayı " + num1);
       } else if (num2>num3) {
           System.out.println("En büyük sayı " +num2);
       } else  {
           System.out.println("En büyük sayı " +num3);
       }

        if (num1<num2 && num1<num3){
            System.out.println("En küçük sayı " + num1);
        } else if (num2<num3) {
            System.out.println("En küçük sayı " +num2);
        } else  {
            System.out.println("En küçük sayı " +num3);
        }


    }
}
