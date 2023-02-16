package ru.job4j.array;

/**
 * @author sveet
 * @date 16.02.2023
 */
public class Matrix {

    public static int[][] multiple(int size) {
        int[][] result = new int[size][size];
        for (int row = 1; row <= result.length; row++) {
            for (int cell = 1; cell <= result.length; cell++) {
                result[row - 1][cell - 1] = row * cell;
            }
        }
        return result;
    }
}

