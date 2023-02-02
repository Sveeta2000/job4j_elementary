package ru.job4j.condition;

/**
 * @author sveet
 * @date 02.02.2023
 */
public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double xPart = x2 - x1;
        xPart = Math.pow(xPart, 2);
        double yPart = y2 - y1;
        yPart = Math.pow(yPart, 2);
        double rsl = xPart + yPart;
        rsl = Math.sqrt(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(1, 0, 2, 4);
        System.out.println("result (1, 0) to (2, 4) " + result2);
    }
}
