package it.unitn.davidetw.enumeration.model;

import java.util.Set;

public abstract class Enumeration <T> {

    public void enumeration(Set<T> problemsData, T[] S, int i, boolean remove) {
        if (accept(problemsData, S, i)) {
            processSolution(problemsData, S, i);
        } else {
            Set<T> candidates = coiches(problemsData, S, i);
            for (T candidate : candidates) {
                S[i] = candidate;

                if (remove) problemsData.remove(candidate);

                enumeration(problemsData, S, i + 1, remove);

                if (remove) problemsData.add(candidate);
            }

        }
    }

    protected abstract boolean accept(Set<T> problemsData, T[] S, int i);

    protected abstract void processSolution(Set<T> problemsData, T[] S, int i);

    protected abstract Set<T> coiches(Set<T> problemsData, T[] S, int i);

}
