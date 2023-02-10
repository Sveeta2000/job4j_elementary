package ru.job4j.condition;

/**
 * @author sveet
 * @date 10.02.2023
 */
public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac);
    }
}
