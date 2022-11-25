package TemaDoi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumber =new ArrayList<>();
        listNumber.add(0,5);
        listNumber.add(1,33);
        listNumber.add(2,4);
        listNumber.add(3,7);
        listNumber.add(4,6);

        LogicalOp logicalOp=new LogicalOp();
        System.out.println("Exercitiul 1:\n\tScrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.");
        logicalOp.printListInt(listNumber);
        System.out.println("Exercitiul 2:\n\tScrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).\n" +
                "Metoda sa adauge numarul primit ca si parametru la final de lista.");
        logicalOp.addToList(listNumber, 42);
        System.out.println("\nExercitiul 3:\n\tScrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg.\n" +
                "Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.");
        logicalOp.printList(listNumber,2);
        System.out.println("Exercitiul 4:\n\tScrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).");
        logicalOp.printListInvers(listNumber);
        System.out.println("\nExercitiul 5:\n\tScrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.\n" +
                "Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.");
        List<String> listS=new ArrayList<>();
        listS.add(0,"Ana");
        listS.add(1,"are");
        listS.add(2,"multe");
        listS.add(3,"mere");
        listS.add(4,"galbene");
        logicalOp.addString(listS,2,"azi");
        System.out.println("\nExercitiul 6:\n\tScrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista,\n" +
                "iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.");
        logicalOp.addOList(listNumber,87);
        System.out.println("\nExercitiul 7:\n\tScrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, si ce pe ce pozitie.");
        logicalOp.printListValue(listNumber);
        System.out.println("\nExercitiul 8:\n\tScrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.");
        logicalOp.getMaxFromList(listNumber);

    }
}
