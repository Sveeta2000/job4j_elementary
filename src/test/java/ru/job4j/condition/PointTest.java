package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author sveet
 * @date 08.02.2023
 */
public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point one = new Point(0, 0);
        Point two = new Point(2, 0);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to24then4dot12() {
        double expected = 4.12;
        Point one = new Point(1, 0);
        Point two = new Point(2, 4);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to00then0() {
        double expected = 0;
        Point one = new Point(0, 0);
        Point two = new Point(0, 0);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123to321then2Dot82() {
        double expected = 2.82;
        Point one = new Point(1, 2, 3);
        Point two = new Point(3, 2, 1);
        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when111to000then1Dot73() {
        double expected = 1.73;
        Point one = new Point(1, 1, 1);
        Point two = new Point(0, 0, 0);
        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.01);
    }
}