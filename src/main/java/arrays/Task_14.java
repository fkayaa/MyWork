package arrays;

import java.util.Arrays;

public class Task_14 {
    public static void main(String[] args) {
        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.
         */

        String str = "Congratulations";
        String[] strArr = str.split("");
        System.out.println(Arrays.toString(strArr)); //[C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]

        String strNew = "";

        for (int i = strArr.length-1; i >=0 ; i--) {
            if (strArr[i].contains("a") || strArr[i].contains("o") || strArr[i].contains("u")) {

                strNew += "i";

            }
           else  strNew += strArr[i];
        }
        System.out.println(strNew); //sniitilitirgniC


    }
}
