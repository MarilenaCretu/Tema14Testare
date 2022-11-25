package TemaTrei;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(0, 5);
        listNumber.add(1, 33);
        listNumber.add(2, 4);
        listNumber.add(3, 72);
        listNumber.add(4, 6);

        LogicalOp logicalOp = new LogicalOp();
        System.out.println("Exercitiul 1:\n\tScrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista.");
        logicalOp.schimbaPosition(listNumber, 4, 26);
        System.out.println("Exercitiul 2:\n\tScrieti o metoda Java care sa primeasca o Lista si sa returneze o alta lista, care sa contina doar numerele pare din lista primita.");
        logicalOp.pare(listNumber);

        System.out.println("\nExercitiul 3:\n\tScrieti o metoda Java care sa primeasca parametru o Lista nesortata, si sa returneze Lista sortata crescator.\n" +
                "Atentie, sortarea sa se faca programatic.");
        logicalOp.sortare(listNumber);

    }
}
