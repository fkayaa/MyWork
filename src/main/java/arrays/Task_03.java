package arrays;

import java.util.Arrays;

public class Task_03 {
    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
         */

        int[] arr = {1,2,-3,4,-5,-6};

        int idx = 0;


        for (int w : arr) {
            arr[idx] = w * -1;
            idx++;
        }
        System.out.println(Arrays.toString(arr));





    }
}
