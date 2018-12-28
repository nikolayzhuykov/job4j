package ru.job4j.array;

/**
 * Таблица умножения.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 28.12.2018
 * @version 1
 */
public class Matrix {

    /**
     * Метод строит таблицу умножения по заданному размеру.
     * @param size размер таблицы
     * @return таблица умножения
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}