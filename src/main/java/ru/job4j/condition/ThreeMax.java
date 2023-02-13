package ru.job4j.condition;

/**
 * @author sveet
 * @date 10.02.2023
 */
public class ThreeMax {

    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }
}
