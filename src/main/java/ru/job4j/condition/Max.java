package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int third) {
        return left >= right + third ? left : right + third; }

    public static int max(int left, int right, int third, int four) {
        return left + four >= right + third ? left + four : right + third; }
}
