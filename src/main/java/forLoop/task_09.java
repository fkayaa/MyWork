package forLoop;

public class task_09 {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.

        System.out.println("Sayı\tHarf");

        for (int i = 0; i <= 255; i++) {

            char ch = (char) i;
            System.out.println(i +"-->"+ "\t" + ch);
        }
    }
}
