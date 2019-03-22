package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;


/**
 * Test.
 *
 * @author Nikolay Zhuykov (kishinxy@mail.ru)
 * @since 22.3.2019
 * @version 1.1
 */
public class PointTest {

    /**
     * Проверка расстояния от одной точки до другой.
     */
    @Test
    public void distanceTest() {
        Point a = new Point(0, 3);
        Point b = new Point(4, 0);
        double result = a.distanceTo(b);
        assertThat(result, closeTo(5.0, 0.1));
    }

    /**
     * Расстояние от одной точки до другой.
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        double result = first.distanceTo(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }

    /**
     *  Проверка расстояния от точки до самой себя.
     */
    @Test
    public void whenCheckItself() {
        Point point = new Point(0, 0);
        double result = point.distanceTo(point);
        assertThat(result, is(0D));
    }

    /**
     * Info
     */
    @Test
    public void whenShowInfo() {
        Point first = new Point(1, 1);
        first.info();
        Point second = new Point(2, 2);
        second.info();
    }
}
