package ru.job4j.loop;

/**
 * Построение шахматной доски в псевдографике.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 6.11.2018
 * @version 1
 */

public class Board {

    /**
     * Рисование шахматной доски из символов X и пробелов.
     * @param width ширина доски
     * @param height высота доски
     * @return все добавленные символы и строки в одну строку
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}