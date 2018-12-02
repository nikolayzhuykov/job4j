package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 3.11.2018
 * @version 1
 */

public class FactorialTest {

    /**
     * 5! = 1x2x3x4x5 = 120.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
       Factorial fact = new Factorial();
       int result = fact.calc(5);
       assertThat(result, is(120));
    }

    /**
     * 0! = 1.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial fact = new Factorial();
        int result = fact.calc(0);
        assertThat(result, is(1));
    }

    /**
     * Получаем 0 вместо ошибки.
     */
    @Test
    public void whenCalculateFactorialForNegativeNumberThenZero() {
        Factorial fact = new Factorial();
        int result = fact.calc(-1);
        assertThat(result, is(0));
    }
}