package ru.job4j.array;

/**
 * @author sveet
 * @date 14.02.2023
 */
public class Turn {

    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
