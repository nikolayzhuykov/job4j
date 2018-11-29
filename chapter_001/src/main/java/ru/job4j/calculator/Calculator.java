package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 29.11.2018
 * @version 1
 */

public class Calculator {

    /**
     * result результат операции.
     */
    private double result;

    /**
     * Method add сложение.
     * @param first первое число.
     * @param second второе число.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method subtract вычитание.
     * @param first первое число.
     * @param second второе число.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method div деление.
     * @param first первое число.
     * @param second второе число.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method multiple умножение.
     * @param first первое число.
     * @param second второе число.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method getResult.
     * @return значение поля result.
     */
    public double getResult() {
        return this.result;
    }
}