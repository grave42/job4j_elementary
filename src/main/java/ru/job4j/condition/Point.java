package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int r1 = x2 - x1;
        int r2 = y2 - y1;
        double first = Math.pow(r1, 2);
        double second = Math.pow(r2, 2);
        double r3 = first + second;
        double rsl = Math.sqrt(r3);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(5, 3, 5, 1);
        System.out.println("result 2 (5, 3) to (5, 1) " + result2);
        double result3 = Point.distance(4, 2, 7, 2);
        System.out.println("result 3 (4, 2) to (7, 2) " + result3);
    }
}