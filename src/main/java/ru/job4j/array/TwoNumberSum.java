package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                return new int[] {i, j};
            } else {
                j--;
            }
            if (i == j) {
                i++;
                j = array.length - 1;
            }
        }
        return new int[] {};
    }
}

