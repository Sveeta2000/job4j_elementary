package ru.job4j.array;

/**
 * @author sveet
 * @date 15.02.2023
 */
public class RollBackArray {

    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int lastIndex = array[array.length - 1 - index];
            result[index] = lastIndex;
        }
        return result;
    }
}
