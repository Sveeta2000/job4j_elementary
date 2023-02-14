package ru.job4j.array;

/**
 * @author sveet
 * @date 14.02.2023
 */
public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
