package ru.job4j.array;

/**
 * Даны два массива, отсортированных по возрастанию.
 * Из них нужно получить третий массив, отсортированный по возрастанию.
 *
 * @author Nikolay Zhuykov (kishinxy@mail.ru)
 * @since 25.1.2019
 * @version 1
 */
public class Array1SortPlusArray2Sort {

    /**
     * Метод из 2х массивов возвращает 3й.
     * @param first первый отсортированный массив
     * @param second второй отсортированный массив
     * @return отсортированный по возрастанию массив, состоящий из двух входных массивов
     */
    public int[] plus(int[] first, int[] second) {
        int[] third = new int[first.length + second.length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < third.length; i++) {
            if (index1 < first.length && index2 < second.length) {
                if (first[index1] < second[index2]) {
                    third[i] = first[index1];
                    index1++;
                } else {
                    third[i] = second[index2];
                    index2++;
                }
            } else {
                if (index1 < first.length) {
                    third[i] = first[index1];
                    index1++;
                } else {
                    third[i] = second[index2];
                    index2++;
                }
            }
        }
        return third;
    }
}