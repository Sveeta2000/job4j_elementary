package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sveet
 * @date 08.02.2023
 */
public class SqAreaTest {

    @Test
    public void whenP6K2ThenSquare2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1ThenSquare1() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP0K0ThenSquare0() {
        int expected = 0;
        int p = 0;
        double k = 0;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}