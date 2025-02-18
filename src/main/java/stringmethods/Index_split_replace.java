package stringmethods;

import java.util.Scanner;

public class Index_split_replace {
    public static void main(String[] args) {

        /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi giriniz");

        String mail = input.nextLine();
        String domain = mail.split("@")[1].replace("gmail","hotmail");

        System.out.println("güncellenen mail adresiniz : " + mail.split("@")[0] + "@" + domain);


    }
}
