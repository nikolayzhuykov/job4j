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
     * @param arrOne первый отсортированный массив
     * @param arrTwo второй отсортированный массив
     * @return отсортированный по возрастанию массив, состоящий из двух входных массивов
     */
    public int[] plus(int[] arrOne, int[] arrTwo) {
        int[] arrThree = new int[arrOne.length + arrTwo.length];
        int indexOne = 0;
        int indexTwo = 0;
        for (int i = 0; i < arrThree.length; i++) {
            if (indexOne < arrOne.length && indexTwo < arrTwo.length) {
                if (arrOne[indexOne] < arrTwo[indexTwo]) {
                    arrThree[i] = arrOne[indexOne];
                    indexOne++;
                } else {
                    arrThree[i] = arrTwo[indexTwo];
                    indexTwo++;
                }
            } else {
                if (indexOne < arrOne.length) {
                    arrThree[i] = arrOne[indexOne];
                    indexOne++;
                } else {
                    arrThree[i] = arrTwo[indexTwo];
                    indexTwo++;
                }
            }
        }
        return arrThree;
    }
}