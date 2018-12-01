package ru.job4j.max;

/**
 * Максимум из нескольких чисел.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 1.11.2018
 * @version 1
 */

public class Max {

    /**
     * Находим максимум из двух чисел.
     * @param first первое число
     * @param second второе число
     * @return максимум
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    /**
     * Находим максимум из трех чисел.
     * @param first первое число
     * @param second второе число
     * @param third третье число
     * @return максимум
     */
    public int max(int first, int second, int third) {
        return this.max(this.max(first, second), third);
    }
}