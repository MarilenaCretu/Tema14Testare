package Tema14EX3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogicalOp {
    //Exercitiul 1
    public void schimbaPosition(List<Integer> list, int position, int number) {
        list.set(position, number);
        System.out.println(list);
    }

    //Exercitiul 2

    public void addToList(List<Integer> list, int number) {
        list.add(number);
        System.out.print(list);
    }

    //Exercitiul 3

//    public int sortare(List<Integer> list) {
//        double medie=0;
//        int sum=0;
//        for (int i = 0; i < list.size(); i++) {
//            sum+=list.get(i);
//        }
//        System.out.println(sum);
//        return sum;
//    }
   // public int tooList(List<Integer> list) {
//        List<Integer> listSort=new List<Integer>(list.size());
//        int[] firstArray = {2, 7, 9};
//        int[] emptyArray = new int[firstArray.length];
//        for (int i = 0, j = 0; i < list.size(); i++) {
//            emptyArray[j] = firstArray[i];
//            j++;
//            System.out.print(emptyArray[i]+" ");
//        }
//        return emptyArray;
//    }
 //   }

}
