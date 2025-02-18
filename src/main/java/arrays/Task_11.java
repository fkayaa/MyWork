package arrays;

public class Task_11 {
    public static void main(String[] args) {
        /* TASK :
        arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */

        int[][] arr1 = { {1,2}, {3,4,5}, {6} };
        int[][] arr2 = { {7,8,9}, {10,11}, {12} };

        int sumArr1 = 0;
        int sumArr2 = 0;

        for (int[] w : arr1) {
            for (int k : w) {
                sumArr1 +=k;
            }

        }
        for (int[] w : arr2) {
            for (int k : w) {
                sumArr2 += k;
            }
        }
        int sumNet = sumArr1 + sumArr2;
        System.out.println(sumNet);

    }
}
