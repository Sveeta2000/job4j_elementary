package ru.job4j;

/**
 * @author sveet
 * @date 02.02.2023
 */
public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euros.");
        float dollar = rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars.");
    }
}