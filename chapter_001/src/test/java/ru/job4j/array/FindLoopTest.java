package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 21.12.2018
 * @version 1
 */
public class FindLoopTest {

    /**
     *  0 1  2  - indexes
     * [5,10,3] - array
     */
    @Test
    public void whenArrayHasElement5ThenIndex0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     *  -1 - индекс с таким элементом не найден
     */
    @Test
    public void whenArrayHasNotElement4ThenIndexNotFound() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 4;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}