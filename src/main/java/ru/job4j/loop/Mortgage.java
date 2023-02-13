package ru.job4j.loop;

/**
 * @author sveet
 * @date 13.02.2023
 */
public class Mortgage {

    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount += (percent / 100) * amount;
            amount -= salary;
            year++;
        }
        return year;
    }
}
