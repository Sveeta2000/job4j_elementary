package ru.job4j.array;

/**
 * @author sveet
 * @date 14.02.2023
 */
public class FindLoop {

    public static int indexOf(int[] data, int el) {
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                result = i;
                break;
            }
        }
        return result;
    }
}
