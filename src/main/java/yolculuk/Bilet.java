package yolculuk;

public class Bilet {
    private static final double km_birim_fiyat = 0.10;
    private int mesafe;
    private boolean gidis_donus = false;

    public Bilet(int mesafe, boolean gidis_donus) { //constructor
        this.mesafe = mesafe;
        this.gidis_donus = gidis_donus;
    }

    public double fiyat_hesaplama(int yas) {
        double toplam_fiyat = mesafe * km_birim_fiyat;
        double toplam = toplam_fiyat;


        //yas indirimi :

        if (yas < 12) {
           toplam =   0.5 * toplam_fiyat;
        } else if (yas > 12 && yas < 24) {
            toplam =   0.9 * toplam_fiyat;
        }else if(yas < 65) {
            toplam =   toplam_fiyat;
        }else {
            toplam =  0.7 * toplam_fiyat;
        }

        //gidis - dönüş
        if (gidis_donus) {
            toplam = toplam * 2 * 0.8;
        }

       return toplam;

    }
}
