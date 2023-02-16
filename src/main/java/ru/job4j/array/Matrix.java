package ru.job4j.array;

/**
 * @author sveet
 * @date 16.02.2023
 */
public class Matrix {

    public static int[][] multiple(int size) {
        int[][] result = new int[size][size];
        for (int row = 1; row <= size; row++) {
            for (int cell = 1; cell <= size; cell++) {
                result[row - 1][cell - 1] = row * cell;
            }
        }
        return result;
    }
}

