package ru.job4j.array;

import java.util.Arrays;

/**
 * Удаление дубликатов в массиве.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 5.1.2019
 * @version 1
 */
public class ArrayDuplicate {

    /**
     * Метод принимает массив, удаляет повторяющиеся элементы
     * и возвращает массив без повторов.
     * @param array входной массив строк
     * @return массив без дубликатов
     */
    public String[] remove(String[] array) {
        int duplicates = 0;
        for (int i = 0; i < array.length - 1 - duplicates; i++) {
            for (int j = i + 1; j < array.length - duplicates; j++) {
                if (array[i].equals(array[j])) {
                    for (int k = j; k < array.length - 1 - duplicates; k++) {
                        String temp = array[k];
                        array[k] = array[k + 1];
                        array[k + 1] = temp;
                    }
                    duplicates++;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, array.length - duplicates);
    }
}