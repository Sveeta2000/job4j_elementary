package ru.job4j.array;

import java.util.Arrays;

/**
 * @author sveet
 * @date 16.02.2023
 */
public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int changeLeft = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (changeLeft >= coins[i]) {
                changeLeft -= coins[i];
                result[size] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
