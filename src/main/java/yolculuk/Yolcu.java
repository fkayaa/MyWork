package yolculuk;

import java.util.Scanner;

public class Yolcu extends Bilet {

    private int yas;


    public Yolcu(int mesafe, boolean gidis_donus, int yas) {
        super(mesafe, gidis_donus);
        this.yas = yas;
    }

    public void bilet_bilgisi(){
        System.out.println("Toplam Bilet Fiyatınız : " + fiyat_hesaplama(yas) + " $" );
    }
    public static Yolcu bilgileri() {
        int mesafe = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz.");
        int yas = input.nextInt();

        System.out.println("Gitmek istediğiniz şehri giriniz. B - C - D ?" );

        char sehir = input.next().toUpperCase().charAt(0);

        System.out.println("Bilet tipinin numarasını seçiniz. 1.Tek Yön //  2. Gidiş - Dönüş ");
        boolean tip = input.nextInt() == 2;

        //mesafe
        switch (sehir) {
            case 'B' : mesafe =500;
            break;
            case 'C' : mesafe =700;
                break;
            case 'D' : mesafe =900;
                break;
            default:
                System.out.println("Hatalı sehir secimi yaptınız");
                System.exit(0);

        }
        return new Yolcu(mesafe , tip ,yas);
    }
}
