package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result;
        switch (n) {
            case 1:
                result = 1;
                break;
            case 0:
                result = 1;
                break;
            default:
                result = 1;
                for (int i = 2; i <= n; i++) {
                    result = result * i;
                }
        }

        return result;
    }
}
