package ru.job4j.loop;

/**
 * Подсчет произведения чисел от 1 до n.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 3.11.2018
 * @version 1
 */

public class Factorial {

    /**
     * Вычисление факториала.
     * @param n количество множителей
     * @return произведение множителей
     */
    public int calc(int n) {
        int multiplier = 1;
        for (int i = 1; i <= n; i++) {
            multiplier *= i;
        }
        return multiplier;
    }
}