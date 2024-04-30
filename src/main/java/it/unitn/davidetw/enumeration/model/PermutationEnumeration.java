package it.unitn.davidetw.enumeration.model;

import java.util.HashSet;
import java.util.Set;

public class PermutationEnumeration<T> extends Enumeration<T> {

    @Override
    protected boolean accept(Set<T> problemsData, T[] S, int i) {
        return problemsData.isEmpty();
    }

    @Override
    protected void processSolution(Set<T> problemsData, T[] S, int i) {
        System.out.print("{ ");
        for (T t : S) {
            System.out.print(t + " ");
        }
        System.out.println("}");
    }

    @Override
    protected Set<T> coiches(Set<T> problemsData, T[] S, int i) {
        return new HashSet<>(problemsData);
    }

}
