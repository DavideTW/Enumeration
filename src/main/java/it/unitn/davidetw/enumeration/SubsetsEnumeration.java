package it.unitn.davidetw.enumeration;

import java.util.Set;

public class SubsetsEnumeration extends Enumeration<Integer> {

    @Override
    boolean accept(Set<Integer> problemsData, Integer[] S, int i) {
        return i >= problemsData.size(); // starts from 0, so i >= size
    }

    @Override
    void processSolution(Set<Integer> problemsData, Integer[] S, int n) {
        System.out.print("{ ");
        for (int i = 0; i < n; i++) {
            if (S[i] != 0) {
                System.out.print((i + 1) + " "); // i + 1 because the index starts from 0
            }
        }
        System.out.println("}");
    }

    @Override
    Set<Integer> coiches(Set<Integer> problemsData, Integer[] S, int i) {
        return Set.of(0, 1);
    }

}
