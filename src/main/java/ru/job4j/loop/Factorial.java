package ru.job4j.loop;

/**
 * @author sveet
 * @date 13.02.2023
 */
public class Factorial {

    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
