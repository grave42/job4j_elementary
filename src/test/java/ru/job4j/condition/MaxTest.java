package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1Then1() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To3Plus3Then6() {
        int left = 3;
        int right = 3;
        int third = 3;
        int result = Max.max(left, right, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3Plus9To3Plus3Then12() {
        int left = 3;
        int four = 9;
        int right = 3;
        int third = 3;
        int result = Max.max(left, four, right, third);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}