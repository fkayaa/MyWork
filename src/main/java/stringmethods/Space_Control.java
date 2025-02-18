package stringmethods;

import java.util.Scanner;

public class Space_Control {
    public static void main(String[] args){

        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup
        // olmadığını kontrol ediniz.
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen bir kelime giriniz");

    String s = input.nextLine();

    boolean spaceControl = s.replaceAll("\\S","").isEmpty();


    if (spaceControl){

        System.out.println(s + "  kelimesinde boşluk bulunmamaktadır");
        ;

    }else {

        System.out.println(s + "  kelimesinde boşluk bulunmaktadır");
    }




    }
}