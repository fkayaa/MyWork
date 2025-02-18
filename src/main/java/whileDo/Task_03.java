package whileDo;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
         /* TASK :
          Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
           ve x girildiğinde ise "Program bitti" yazan programı yazınız.
          */

        Scanner input = new Scanner(System.in);


        do {

            System.out.println("Lütfen bir karakter giriniz...");
            String s = input.next();

            if (!s.equalsIgnoreCase("x")) {
                System.out.println("program çalısıyor...");
            }else {
                System.out.println("Program bitti");
                break;
            }
        }while(true);

    }
}
