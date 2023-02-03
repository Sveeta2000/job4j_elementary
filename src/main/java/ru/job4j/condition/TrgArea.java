package ru.job4j.condition;

/**
 * @author sveet
 * @date 03.02.2023
 */
public class TrgArea {

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double sq = p * (p - a) * (p - b) * (p - c);
        sq = Math.sqrt(sq);
        return sq;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
