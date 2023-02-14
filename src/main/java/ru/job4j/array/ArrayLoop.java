package ru.job4j.array;

/**
 * @author sveet
 * @date 14.02.2023
 */
public class ArrayLoop {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
