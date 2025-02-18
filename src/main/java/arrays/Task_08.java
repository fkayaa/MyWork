package arrays;

public class Task_08 {
    public static void main(String[] args) {
        /*
         TASK :
         $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */


        String str = " $1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

         String[] arr = str.trim().split(" ");

         Integer sum$ = 0;
         Integer sum£ = 0;

         for (String w : arr) {

             if (w.contains("$")) {

              sum$ +=  Integer.valueOf(w.replace("$" ,""));

             } else if (w.contains("£")) {

             }
             {
                 sum£ +=  Integer.valueOf(w.replace("£" ,""));
             }
             {

             }
         }
        System.out.println("sum£ = " + sum£);
        System.out.println("sum$ = " + sum$);





    }
}
