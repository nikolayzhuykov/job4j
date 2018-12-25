package ru.job4j.array;

/**
 * Инверсия массива.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 25.12.2018
 * @version 1
 */
public class Turn {

    /**
     * Переворот массива задом наперед.
     * @param array входной массив
     * @return инвертированный массив
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}