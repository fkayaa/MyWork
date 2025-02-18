package arrays;

import static java.util.Collections.replaceAll;

public class Task_16 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

        String str = "ade1r4d3";

       String[] newStr = str.replaceAll("[^0-9]","").split("");

       int sum = 0;



       for (String w : newStr) {
           sum += Integer.parseInt(w);


       }
        System.out.println(sum);












    }
}
