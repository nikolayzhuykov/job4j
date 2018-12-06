package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Построение пирамиды из крышек. Произведен рефакторинг.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 6.11.2018
 * @version 2
 */

public class Paint {

    /**
     * Правый треугольник. Второй height = width.
     * @param height высота
     * @return параметры для метода loopBy
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Левый треугольник. Второй height = width.
     * @param height высота
     * @return параметры для метода loopBy
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Пирамида.
     * @param height высота пирамиды
     * @return параметры для метода loopBy
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> (row >= height - column - 1) && (row + height - 1 >= column)
        );
    }

    /**
     * Рисует треугольники и пирамиду.
     * @param height высота пирамиды
     * @param width ширина пирамиды
     * @param predict условие проставления крышки
     * @return строка с добавленными символами " " и "^"
     */
    private String loopBy(int height, int width, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (predict.test(row, column)) {
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