package forLoop;

public class task_01 {
    public static void main(String[] args) {
        /* TASK : aşagıdaki şekli console'a yazdırınız
         *
         **
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         */

        char yildiz = '*';
        for (int i = 0; i < 11; i++) {
            if (i <= 1) {

                System.out.print(yildiz);
            }

            for (int j = 0; j < i; j++) {

                System.out.print(yildiz);


            }


            System.out.println();
        }
    }
}
