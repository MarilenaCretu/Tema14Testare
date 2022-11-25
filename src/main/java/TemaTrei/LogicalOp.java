package TemaTrei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogicalOp {
    //Exercitiul 1
    public void schimbaPosition(List<Integer> list, int position, int number) {
        list.set(position, number);
        System.out.println(list);
    }
    public void pare(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.print(list.get(i)+" ");
            }
        }
    }
    public void sortare(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            Collections.sort(list);
            System.out.print(list.get(i)+" ");
        }
    }



}
