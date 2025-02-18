package whileDo;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız

        Scanner input = new Scanner(System.in);

        String pin = "123pwd";

        int hak = 3;
        do {
            System.out.println("Lütfen pin kodunuzu giriniz...");
            String girilen = input.next();
            if (girilen.equalsIgnoreCase(pin)) {
                System.out.println("Hesabınıza hoşgeldiniz ..");
                hak = 0;
            }else {

                hak--;
                System.out.println("Giriş için kalan hakkınız : " + hak);
            }

        }while (hak>0);
    }
}
