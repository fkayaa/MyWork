package arrays;

public class Task_10 {
    public static void main(String[] args) {
        /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )
         */

        String str = "GayetBasarılı";
        String s = str.replaceAll("Gayet","Coook");
        System.out.println(s); //CoookBasarılı

    }
}
