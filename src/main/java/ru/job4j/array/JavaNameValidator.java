package ru.job4j.array;

/**
 * @author sveet
 * @date 16.02.2023
 */
public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        if (name.isEmpty() || !isLowerLatinLetter(name.charAt(0))) {
            return false;
        }
        for (int i = 1; i < name.length(); i++) {
            if (!isSpecialSymbol(name.charAt(i))
                    && !isUpperLatinLetter(name.charAt(i))
                    && !isLowerLatinLetter(name.charAt(i))
                    && !Character.isDigit(name.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
