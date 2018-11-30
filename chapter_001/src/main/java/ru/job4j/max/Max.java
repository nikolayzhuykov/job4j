package ru.job4j.max;

/**
 * Максимум из двух чисел.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 30.11.2018
 * @version 1
 */

public class Max {

    /**
     * Находим максимум.
     * @param first первое число
     * @param second второе число
     * @return максимум
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
}