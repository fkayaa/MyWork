package orneksorular;

import java.util.Scanner;

public class task_07 {
    public static void main(String[] args) {
        /*
		  TASK :
		  Kullanici tarafindan girilen bir sayinin
		  mutlak degerini yazdiran code create ediniz.
		 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz.");

        int sayi = input.nextInt();
        int cevap = Math.abs(sayi);

        System.out.println("cevap = " + cevap);
    }
}
