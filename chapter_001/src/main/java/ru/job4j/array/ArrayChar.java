package ru.job4j.array;

/**
 * Обертка над строкой.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 31.12.2018
 * @version 1.1
 */
public class ArrayChar {

    /**
     * Проверяемая строка.
     */
    private final char[] data;

    /**
     * Конструктор.
     * @param line входящая строка
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет, что слово начинается с префикса.
     * Т.е. массив data имеет первые элементы одинаковые с value.
     * @param prefix префикс
     * @return true - слово начинается с префикса, иначе - false
     */
    public boolean startWith(String prefix) {
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (value[i] != data[i]) {
                return false;
            }
        }
        return true;
    }
}