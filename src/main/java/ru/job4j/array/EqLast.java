package ru.job4j.array;

/**
 * @author sveet
 * @date 15.02.2023
 */
public class EqLast {

    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }
}
