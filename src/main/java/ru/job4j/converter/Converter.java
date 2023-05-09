package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 120;
        float expected = 2;
        float euro = Converter.rubleToEuro(in);
        boolean passed = expected == euro;
        System.out.println("140 rubles are " + euro + " euro. Test result : " + passed);
        in = 120;
        expected = 2;
        float dollar = rubleToDollar(in);
        passed = expected == dollar;
        System.out.println("120 rubles are " + dollar + " dollars. Test result : " + passed);
    }
}
