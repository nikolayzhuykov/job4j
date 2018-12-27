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
public class BubbleSortTest {

    /**
     * {1, 5, 4, 2, 3, 1, 7, 8, 0, 5} - входной массив
     * {0, 1, 1, 2, 3, 4, 5, 5, 7, 8} - после сортировки
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] sortArray = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        int[] result = bubbleSort.sort(array);
        assertThat(result, is(sortArray));
    }
}