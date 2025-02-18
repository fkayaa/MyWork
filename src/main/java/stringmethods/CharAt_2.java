package stringmethods;

public class CharAt_2 {
    public static void main(String[] args) {
        /*  TASK :
    Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
    String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     */

        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String ali = pickName.charAt(0) + " " +pickName.charAt(11) + " " +pickName.charAt(8);
        System.out.println("Seçilen harfler = " + ali);

    }
}
