package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 28.12.2018
 * @version 1
 */
public class MatrixCheckTest {

    /**
     * {
     *    {true, false},
     *    {false, true}
     * } - вернет true;
     */
    @Test
    public void whenDataWithEvenAmountOfElementsMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, false},
                {false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    /**
     * {
     *    {true, false},
     *    {false, false}
     * } - вернет true;
     */
    @Test
    public void whenDataWithEvenAmountOfElementsNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, false},
                {false, false}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * {
     *    {true, true, true},
     *    {false, true, true},
     *    {true, false, true}
     * } - вернет true;
     */
    @Test
    public void whenDataWithOddAmountOfElementsMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * {
     *     {true, true, false},
     *     {false, true, true},
     *     {true, false, true}
     * }- вернет false;
     */
    @Test
    public void whenDataWithOddAmountOfElementsNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}