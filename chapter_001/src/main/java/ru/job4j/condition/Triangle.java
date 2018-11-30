package ru.job4j.condition;

/**
 * Треугольник.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 30.11.2018
 * @version 1
 */

public class Triangle {

    /**
     * Точки треугольника.
     */
    private final Point a;
    private final Point b;
    private final Point c;

    /**
     * Конструктор для инициализации точек треугольника.
     *
     * @param a точка a
     * @param b точка b
     * @param c точка с
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула полупериметра: (ab + ac + bc) / 2.
     *
     * @param ab расстояние между точками a и b
     * @param ac расстояние между точками a и c
     * @param bc расстояние между точками b и c
     * @return полумериметр
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Метод вычисления площади треугольника.
     *
     * @return площадь, если треугольник существует или -1, если треугольник не существует
     */
    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return rsl;
    }

    /**
     * Метод проверяет возможность построения треугольника с данными длинами сторон.
     *
     * @param ab Длина от точки a до b.
     * @param ac Длина от точки a до c.
     * @param bc Длина от точки b до c.
     * @return true or false
     */
    private boolean exist(double ab, double ac, double bc) {
        return ((ab + ac > bc) && (ab + bc > ac) && (ac + bc > ab));
    }
}