package ru.job4j.array;

/**
 * @author sveet
 * @date 16.02.2023
 */
public class Min {

    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
