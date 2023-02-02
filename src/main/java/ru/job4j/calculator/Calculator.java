package ru.job4j.calculator;

/**
 * @author sveet
 * @date 01.02.2023
 */
public class Calculator {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);
    }
}
