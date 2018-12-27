package ru.job4j.array;

/**
 * Массив заполнен true или false.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 28.12.2018
 * @version 1
 */
public class Check {

    /**
     * Метод проверяет заполнение массива true или false.
     * Если все элементы массива заполнены только true или только false,
     * тогда метод вернет true. Иначе метод вернет false.
     * Например.
     * {true, true, true} - вернет true;
     * {true, false, true} - вернет false;
     * {false, false, false} - вернет true;
     * @param data входной массив
     * @return true или false
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}