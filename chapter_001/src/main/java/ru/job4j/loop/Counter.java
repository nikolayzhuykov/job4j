package ru.job4j.loop;

/**
 * Подсчет суммы четных чисел.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 2.11.2018
 * @version 1
 */

public class Counter {

    /**
     * Метод вычисляет сумму четных чисел в диапазоне от start до finish.
     * @param start начальное значение
     * @param finish конечное значение
     * @return сумма четных чисел
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}