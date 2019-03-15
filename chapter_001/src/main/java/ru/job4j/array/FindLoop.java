package ru.job4j.array;

/**
 * Поиск в массиве индекса элемента, удовлетворяющего условию.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 21.12.2018
 * @version 1
 */
public class FindLoop {

    /**
     * Нахождение индекса элемента в массиве.
     * если элемента нет в массиве, то возвращаем -1.
     * @param data исходный массив элементов
     * @param el значение, сравниваемое с элементом массива
     * @return искомый индекс элемента или -1, если такого индекса не существует
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}