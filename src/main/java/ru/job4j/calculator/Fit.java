package ru.job4j.calculator;

public class Fit {

    private static final short BASE_HEIGHT_MAN = 100;
    private static final short BASE_HEIGHT_WOMAN = 110;
    private static final double WEIGHT_COEFFICIENT = 1.15;

    public static double manWeight(short height) {
        double idealWeight = (height - BASE_HEIGHT_MAN) * WEIGHT_COEFFICIENT;
        return idealWeight;
    }

    public static double womanWeight(short height) {
        double idealWeight = (height - BASE_HEIGHT_WOMAN) * WEIGHT_COEFFICIENT;
        return idealWeight;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}
