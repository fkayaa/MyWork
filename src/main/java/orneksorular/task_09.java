package orneksorular;

import java.util.Scanner;

public class task_09 {
    public static void main(String[] args) {
        /* TASK :
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.

        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen gunu giriniz : ");
        int gun = input.nextInt();
        System.out.print("Lutfen ayi giriniz : ");
        int ay = input.nextInt();
        System.out.print("Lutfen yili giriniz : ");
        int yil = input.nextInt();

        System.out.println(" Gun ay yil : " + gun + "." + ay + "." + yil);
        System.out.println(" Ay gun yil : " + ay + "." + gun + "." + yil);
        System.out.println(" Yil ay gun : " + yil + "." + ay + "." + gun);

    }
}
