package stringmethods;

public class ValueOf {
    public static void main(String[] args) {
         /*
        TASK :
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

         */

        String  str1= "%13.99";
        String str2=" %10.55";

        Double num1 =Double.valueOf(str1.replace("%",""));
        Double num2 =Double.valueOf(str2.replace("%",""));


        System.out.println("Toplam :" + (num1+num2));


    }
}
