package ru.job4j.array;

/**
 * @author sveet
 * @date 16.02.2023
 */
public class LengthArrayArrays {

    public static void main(String[] args) {
        int[][] numbers = {{1}, {4, 5}, {7, 8, 9}, {2, 3, 2, 3}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }
}
