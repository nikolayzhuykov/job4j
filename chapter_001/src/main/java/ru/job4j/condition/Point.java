package ru.job4j.condition;

/**
 * Point - точка в системе координат.
 *
 * @author Nikolay Zhuykov (kishinxy@mail.ru)
 * @since 22.3.2019
 * @version 1.1
 */
public class Point {

    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private final int x;

    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private final int y;

    /**
     * Конструктор для инициализации точки в системе координат.
     * @param x координата x
     * @param y координата y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Расстояние до другой точки.
     * @param that входящая точка
     * @return расстояние от текущей точки до входящей
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

    /**
     * Main.
     * @param args args
     */
    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);
        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}