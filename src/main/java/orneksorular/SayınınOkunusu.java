package orneksorular;

import java.util.Scanner;

public class SayınınOkunusu {
    public static void main(String[] args) {
        //Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız


                Scanner input = new Scanner(System.in);
                System.out.println("Ucbasamakli bir sayi giriniz");
                int sayi = input.nextInt();

                if(sayi<100 || sayi>999){
                    System.out.println("Lutfen sadece 3 basamakli sayi giriniz");
                }

                int birlerBamagindakiSayi = sayi % 10;
                int onlarBasamagindakiSayi = (sayi / 10) %10;
                int yuzlerBasamagindakiSayi  = sayi /100;

                String sonuc ="";

                switch (yuzlerBasamagindakiSayi){
                    case 1:
                        sonuc += "Yuz ";
                        break;
                    case 2 :
                        sonuc += "Iki Yuz ";
                        break;
                    case 3 :
                        sonuc += "Uc yuz ";
                        break;
                    case 4 :
                        sonuc += "Dort yuz ";
                        break;
                    case 5 :
                        sonuc += "Bes yuz ";
                        break;
                    case 6 :
                        sonuc += "Alti yuz ";
                        break;
                    case 7 :
                        sonuc += "Yedi yuz ";
                        break;
                    case 8 :
                        sonuc += "Sekiz yuz ";
                        break;
                    case 9 :
                        sonuc += "Dokuz yuz ";
                        break;
                }
                switch (onlarBasamagindakiSayi){
                    case 1:
                        sonuc += "On ";
                        break;
                    case 2 :
                        sonuc += "Yirmi ";
                        break;
                    case 3 :
                        sonuc += "Otuz ";
                        break;
                    case 4 :
                        sonuc += "Kirk ";
                        break;
                    case 5 :
                        sonuc += "Elli ";
                        break;
                    case 6 :
                        sonuc += "Altmis ";
                        break;
                    case 7 :
                        sonuc += "Yetmis ";
                        break;
                    case 8 :
                        sonuc += "Seksen ";
                        break;
                    case 9 :
                        sonuc += "Doksan ";
                        break;
                }
                switch (birlerBamagindakiSayi){
                    case 1:
                        sonuc += "Bir ";
                        break;
                    case 2 :
                        sonuc += "Iki ";
                        break;
                    case 3 :
                        sonuc += "Uc ";
                        break;
                    case 4 :
                        sonuc += "Dort ";
                        break;
                    case 5 :
                        sonuc += "Bes ";
                        break;
                    case 6 :
                        sonuc += "Alti ";
                        break;
                    case 7 :
                        sonuc += "Yedi ";
                        break;
                    case 8 :
                        sonuc += "Sekiz ";
                        break;
                    case 9 :
                        sonuc += "Dokuz ";

                }

                System.out.println(sonuc.trim());

            }



        }


