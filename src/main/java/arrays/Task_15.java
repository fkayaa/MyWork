package arrays;

public class Task_15 {
    public static void main(String[] args) {

        /*  TASK :
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlarının ayni olup olmadığını kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};
         */

        int[] arr={2 , 6 , 4 , 8 , 2 , 6 , 2};

        int idx = 0;


        for (int i = arr.length-1; i >=0 ; i--) {

            if (arr[i] == arr[idx]) {
                System.out.println(arr[idx] +". ve " +arr[i] +". ilk ve son indexleri aynı" );
            }
            idx++;

        }


    }
}
