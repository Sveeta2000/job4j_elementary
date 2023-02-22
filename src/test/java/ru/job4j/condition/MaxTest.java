package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author sveet
 * @date 09.02.2023
 */
class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxMinus1ToMinus2ThenMinus1() {
        int left = -1;
        int right = -2;
        int result = Max.max(left, right);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1Vs2Vs3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1Vs2Vs3Vs0Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 0;
        int result = Max.max(first, second, third, fourth);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}