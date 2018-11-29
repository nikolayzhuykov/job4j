package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 29.11.2018
 * @version 1
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
}
