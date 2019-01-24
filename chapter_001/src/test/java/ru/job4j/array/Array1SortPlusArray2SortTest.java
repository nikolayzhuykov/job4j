package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Nikolay Zhuykov (kishinxy@mail.ru)
 * @since 25.1.2019
 * @version 1
 */
public class Array1SortPlusArray2SortTest {

    /**
     * arrOne = {1, 2, 3, 4, 5};
     * arrTwo = {6, 7, 8, 9, 10};
     * arrThree = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     */
    @Test
    public void whenArray1SortPlusArray2SortThenArraySort3a() {
        Array1SortPlusArray2Sort array1SortPlusArray2Sort = new Array1SortPlusArray2Sort();
        int[] arrOne = new int[] {1, 2, 3, 4, 5};
        int[] arrTwo = new int[] {6, 7, 8, 9, 10};
        int[] result = array1SortPlusArray2Sort.plus(arrOne, arrTwo);
        int[] expect = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(result, is(expect));
    }

    /**
     * arrOne = {1, 2, 3, 4, 5};
     * arrTwo = {1, 2, 3};
     * arrThree = {1, 1, 2, 2, 3, 3, 4, 5};
     */
    @Test
    public void whenArray1SortPlusArray2SortThenArraySort3b() {
        Array1SortPlusArray2Sort array1SortPlusArray2Sort = new Array1SortPlusArray2Sort();
        int[] arrOne = new int[] {1, 2, 3, 4, 5};
        int[] arrTwo = new int[] {1, 2, 3};
        int[] result = array1SortPlusArray2Sort.plus(arrOne, arrTwo);
        int[] expect = new int[] {1, 1, 2, 2, 3, 3, 4, 5};
        assertThat(result, is(expect));
    }

    /**
     * arrObe = {1, 2, 3};
     * arrTwo = {1, 2, 3, 4, 5};
     * arrThree = {1, 1, 2, 2, 3, 3, 4, 5};
     */
    @Test
    public void whenArray1SortPlusArray2SortThenArraySort3c() {
        Array1SortPlusArray2Sort array1SortPlusArray2Sort = new Array1SortPlusArray2Sort();
        int[] arrOne = new int[] {1, 2, 3};
        int[] arrTwo = new int[] {1, 2, 3, 4, 5};
        int[] result = array1SortPlusArray2Sort.plus(arrOne, arrTwo);
        int[] expect = new int[] {1, 1, 2, 2, 3, 3, 4, 5};
        assertThat(result, is(expect));
    }
}