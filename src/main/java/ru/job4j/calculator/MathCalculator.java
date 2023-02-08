package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

/**
 * @author sveet
 * @date 08.02.2023
 */
public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double allBasicOperationsSum(double first, double second) {
        return sumAndMultiply(first, second)
                + subtractAndDivide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}
