package it.unitn.davidetw.enumeration;

import it.unitn.davidetw.enumeration.model.PermutationEnumeration;
import it.unitn.davidetw.enumeration.model.SubsetsEnumeration;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EnumerationApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Subsets:");
        subsetExample(n);

        System.out.println("Permutations:");
        permutationExample(n);
    }

    private static void subsetExample(int number) {
        SubsetsEnumeration subsetsEnumeration = new SubsetsEnumeration();
        Integer[] S = new Integer[number]; // Solutions

        Set<Integer> set = new HashSet<>(); // Generating a set of elements representing 'n'
        for (int i = 0; i < number; i++) {
            set.add(i);
        }

        subsetsEnumeration.enumeration(set, S, 0, false);
    }

    private static void permutationExample(int number) {
        PermutationEnumeration<String> permutationEnumeration = new PermutationEnumeration<>();
        String[] S = new String[number]; // Solutions

        Set<String> chars = new HashSet<>();

        for (int i = 0; i < number; i++) { // char A, B, C, ...
            chars.add(String.valueOf((char) (65 + i)));
        }

        permutationEnumeration.enumeration(chars, S, 0, true);
    }

}
