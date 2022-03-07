package com.github.kyleryvn.challenges.hackerrank.problemsolving;

import java.util.List;

public class DiagonalDifference {

    // Given a square matrix, calculate the absolute difference between the sums of its diagonals.
    public int difference(List<List<Integer>> numbers) {
        display(numbers);
        int diagonalOne = 0;
        int diagonalTwo = 0;

        for (int i = 0, j = numbers.get(0).size() - 1; i < numbers.get(0).size(); i++, j--) {
            diagonalOne += numbers.get(i).get(i);
            diagonalTwo += numbers.get(i).get(j);
        }

        return Math.abs(diagonalOne - diagonalTwo);
    }

    private void display(List<List<Integer>> numbers) {
        System.out.println("--- Matrix ---");
        for (List<Integer> list : numbers) {
            System.out.print("[");

            for (Integer number : list) {
                System.out.print(" " + number + " ");
            }

            System.out.println("]");
        }
    }
}
