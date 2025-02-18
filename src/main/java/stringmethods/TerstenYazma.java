package stringmethods;

import java.util.Scanner;

public class TerstenYazma {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 4 harfli bir kelime yazınız");

        String s = input.nextLine().trim();


        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
