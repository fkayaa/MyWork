package arrays;

import whileDo.Task_06;

public class Task_05 {
    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int[] nums = {1,2,3,4,5,6,7};

        int toplam = 0;
        int aritmetic;

        for (int w : nums) {

            toplam += w;

        }
        aritmetic = toplam/nums.length;
        System.out.println(aritmetic);


        for (int w : nums) {

            if (w > aritmetic) {
                System.out.println(aritmetic + " Aritmetik ortalamasından büyük sayılar : " + w);
            }

        }


    }
}
