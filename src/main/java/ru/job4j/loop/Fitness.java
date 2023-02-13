package ru.job4j.loop;

/**
 * @author sveet
 * @date 13.02.2023
 */
public class Fitness {

    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
