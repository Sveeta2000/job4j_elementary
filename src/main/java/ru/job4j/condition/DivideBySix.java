package ru.job4j.condition;

/**
 * @author sveet
 * @date 10.02.2023
 */
public class DivideBySix {

    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "The number divides by 6.";
        } else if (number % 3 == 0 && number % 2 != 0) {
            rsl = "The number divides by 3, but it isn't the even number.";
        } else if (number % 3 != 0 && number % 2 == 0) {
            rsl = "The number doesn't divide by 3, but it is the even number.";
        } else {
            rsl = "The number doesn't divide by 3 and it isn't the even number.";
        }
        return rsl;
    }
}
