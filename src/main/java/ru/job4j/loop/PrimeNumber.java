package ru.job4j.loop;

/**
 * @author sveet
 * @date 13.02.2023
 */
public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        if (finish < 2) {
            return count;
        }
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}
