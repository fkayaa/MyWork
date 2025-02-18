package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Tasks {

    //-------------------------task_01---------------------------------------

   /*  * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
                 * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
            */

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));

        myList.removeIf(t -> t.toLowerCase().contains("a"));
        System.out.println(myList);//[Veli, Omer]


        //------------------------task_02------------------------------------
        /*
         2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */

        String[][] mdArr = {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
        sort(mdArr); //[Ali, Ayse, Can, Hasan, Suzan, Veli]

        //------------------task_03-------------------------------------------

        /*
            Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
       toplamını bulan code create ediniz.
         */
        List<Integer> numbers = Arrays.asList(1 ,2 ,3 ,4 ,5);

        System.out.println(numbers.stream().map(t-> t * t).reduce(0,Integer :: sum));//55


        //---------------------------task_03-------------------------------------------------

        /*
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
         */

     /*   Scanner input = new Scanner(System.in);
        List<Double> notes = new ArrayList<>();
      //  System.out.println("Öğrenci notlarını giriniz. \n Çıkış için -1 ' e basınız");

        while (true) {
            double notGiris = input.nextInt();
            if (notGiris == -1){
                break;
            }
            notes.add(notGiris);
        }

       double ort = notes.isEmpty() ? 0.0 : notes.stream().reduce(0.0,Double::sum)/notes.size();

        //gecen öğrenci sayısı
        long gecenÖğrenciSayisi = notes.stream().filter(t-> t >= ort).count();
        System.out.println("Ortalama :" + ort);
        System.out.println("Geçen Öğrenci Sayısı : " + gecenÖğrenciSayisi);
*/


        //---------------------task_04----------------------------------------------

        /*
         Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.
         */
     /*   Scanner input = new Scanner(System.in);


         List<Integer> numList = new ArrayList<>();
        System.out.println("6 adet sayı girisi yapınız");

        for (int i = 0; i < 6; i++) {

            numList.add(input.nextInt());

        }

        oddNumList(numList);*/

/*
 * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
 * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
 * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
 */
        int[] arr = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};


        List<Integer> result = ardisikElemanToplam(arr);


        System.out.println(result);

    
    }//main sonu

    private static List<Integer> ardisikElemanToplam(int[] arr) {
        List<Integer> result = new ArrayList<>();


        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];


            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                result.add(sum);
                sum = 0;
            }
        }

        return result;
    }

    //task04
    private static void oddNumList(List<Integer> numList) {
        List<Integer> oddNum = new ArrayList<>();
        numList.stream().filter(t-> t % 2 == 1).forEach(t-> oddNum.add(t));
        System.out.println(oddNum);
    }

    //md sort method --task_02 :
    public static void sort(String[][] mdArr){

        List<String> sortedList = Arrays.stream(mdArr).flatMap(Arrays::stream).sorted().collect(Collectors.toList());

        System.out.println(sortedList);

    }
}
