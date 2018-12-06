package ru.job4j.loop;

/**
 * Построение пирамиды из крышек.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 6.11.2018
 * @version 1
 */

public class Paint {

    /**
     * Рисует правый треугольник. Во внутреннем цикле ширина равна высоте.
     * @param height высота
     * @return все добавленные символы в одну строку
     */
    public String rightTrl(int height) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != height; column++) {
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    /**
     * Рисует левый треугольник. Во внутреннем цикле ширина равна высоте.
     * @param height высота
     * @return все добавленные символы в одну строку
     */
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != height; column++) {
                if (row >= height - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    /**
     * Рисует пирамиду.
     * @param height высота пирамиды
     * @return все добавленные символы в одну строку
     */
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != (2 * height - 1); column++) {
                if ((row >= height - column - 1) && (row + height - 1 >= column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}