package ru.job4j.array;

/**
 * Заполнение массива числами, возведенными в квадрат.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 20.12.2018
 * @version 1
 */
public class Square {

    /**
     * Метод записывает в массив числа, возведенные в квадрат.
     * @param bound граница массива
     * @return числа, возведенные в квадрат
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i <= bound; i++) {
            rst[i - 1] = i * i;
        }
        return rst;
    }
}