package ternaryOperator;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
       // int a = 10;
        //if (a > 10) { a *= 2; } else { a += 10; }

       // (Boolean sart ,Koşul parantezi ) ? (True ) : (False);

       // a = a > 10 ? a * 2 : a + 10;

       // System.out.println(a > 10 ? a * 2 : a + 10);


        //System.out.println(a > 10 ? "10 dan büyük sayı" : a + 10);

        //Task 1
       //Kullanıcıdan 1 sayı isteyin , sayıyı kontrol edin,5 ile bölünebiliyorsa "5 in tam katı" , bölünemiyorsa "5 in tam katı değil" yazdırın.

        Scanner input = new Scanner(System.in);
       // System.out.println("Lütfen bir tamsayı giriniz");

       // int num = input.nextInt();

       // System.out.println((num % 5 == 0) ? ("5 ile tam bölünür") : ("5 ile tam böünmez"));

        //Task 2
        //Kullanıcıdan bir harf isteyin ,girilen karakter ; küçük harf ise onu büyük harf olarak yazdırın, değilse aynen yazdırın.

        //System.out.println("Lütfen bir harf giriniz...");

       // char harf = input.next().charAt(0);
        //a --> 97
        //A -->65

        //b-->98
        //B-->66

        //c -->99
        //C -->67

       // System.out.println(   harf >= 'a' && harf <='z' ?(char) (harf-32) : harf );


        //Task 3
       //Kullanıcıdan notunu girmesini isteyin , not 70 veya daha büyükse "Sınıfı Geçtin" , değilse "Maalesef Kaldın" yazdırın.

       // System.out.println("Lütfen notunuzu giriniz ...");

      //  double not = input.nextDouble();
      //  System.out.println(not >= 70 ? "Sınıfı Geçtin" :   "Maalesef Kaldın" );

        //Task 4
       // int a = 10;
       // System.out.println(a>20 ? a*a : a++); // 10 yazdırır, a = 11 olarak devam eder.


       // System.out.println(a>20 ? a*a : ++a);//12

       /* int x = 10;
        int y = 15;
        int z = a > 0 ? y++ : --x;// y = z = 15 sonra y = 16

        System.out.println(x + " , " + y + " , " + z); // x = 10 , y=16 , z =15*/



        //Nested Ternary - İç içe Ternary
        //Task 5
        //Kulanıcıdan bir tamsayı alın,
        //Sayı pozitif ise , çift - tek kontrolü yapın
        //Sayı pozitif değilse ,"3 basamaklı sayı" veya "3 basamaklı değil" yazdırın

        System.out.println("Lütfen bir tamsayı giriniz ...");
        int sayi = input.nextInt();

        String s = (sayi > 0) ?
                ((sayi % 2 == 0) ? ("Pozitif Çift sayıdır"):("Pozitif Tek sayıdır")) :
                ((sayi <= -100 && sayi > -1000) ? ("3 basamaklı negatif bir sayıdır"): ("3 basamaklı değildir"));
        System.out.println(s);

        int a = 10;
        int b = 20;

        System.out.println((a > 5) ? (a > 0 ? 100 : 50 ): ((a < 20) ? a + 5 : a - 5)); //100
        System.out.println(b < a ? (b > 0 ? b + a : b -a) : (a <10 ? a*5 : b/a)); //2
        System.out.println((a == b )? (a > b ? a : b) : (a < b ? a + b : a -b)); //30



    }
}
