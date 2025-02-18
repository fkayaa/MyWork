package stringmethods;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
             /*  TASK :
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */


        String input = "Python";

        if (input.length()%2 == 0) {

            System.out.println(input.substring(0,input.length()/2));

        }else System.out.println(input);
    }
}
