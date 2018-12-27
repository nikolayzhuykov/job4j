package ru.job4j.array;

/**
 * Сортировка пузырьком.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 28.12.2018
 * @version 1
 */
public class BubbleSort {

    /**
     * Метод сортирует элементы входного массива методом пузырька.
     * @param array входной массив
     * @return отсортированный массив
     */
    public int[] sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] ^ array[j + 1];
                    array[j + 1] = array[j] ^ array[j + 1];
                    array[j] = array[j] ^ array[j + 1];
                }
            }
        }
        return array;
    }
}