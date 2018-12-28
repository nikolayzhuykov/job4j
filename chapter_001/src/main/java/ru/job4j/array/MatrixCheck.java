package ru.job4j.array;

/**
 * Матрица заполнена true или false по диагоналям.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 28.12.2018
 * @version 1.1
 */
public class MatrixCheck {

    /**
     * Метод проверяет заполнение матрицы true или false по диагоналям.
     * Если главная и побочная диагонали матрицы заполнены элементами true или false,
     * тогда метод вернет true. Иначе метод вернет false.
     * Например.
     * {
     *     {true, false}
     *     {false, true}
     * } - вернет true;
     * {
     *     {true, true}
     *     {false, true}
     * } - вернет false;
     * {
     *     {true, true, true}
     *     {true, true, false}
     *     {true, false, true}
     * } - вернет true;
     * {
     *     {false, true, false}
     *     {true, false, true}
     *     {false, false, false}
     * } - вернет true;
     * {
     *     {true, true, false}
     *     {true, false, false}
     *     {false, false, true}
     * } - вернет false;
     * @param data входной массив
     * @return true или false
     */
    public boolean mono(boolean[][] data) {
        for (int i = 0; i < data.length - 1; i++) {
            if ((data[i][i] != data[i + 1][i + 1])
                    || (data[i][data.length - i - 1] != data[i + 1][data.length - (i + 1) - 1])) {
                        return false;
            }
        }
        return true;
    }
}