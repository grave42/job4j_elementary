package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int index = 0; index < size; index++) {
            for (int index2 = 0; index2 < size; index2++) {
                int number = index + 1;
                array[index][index2] = number * (index2 + 1);
                System.out.println(array[index][index2]);

            }
        }
        return array;
    }
}
