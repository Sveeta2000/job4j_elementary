package ru.job4j.loop;

/**
 * @author sveet
 * @date 13.02.2023
 */
public class Counter {

    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(0, 1));
        System.out.println(sum(10, 11));
        System.out.println(sum(1, 17));
    }
}
