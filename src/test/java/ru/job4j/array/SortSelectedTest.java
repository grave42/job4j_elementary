package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[]{5, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[]{16, 15, 12, 22, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{3, 12, 15, 16, 22};
        assertThat(result).containsExactly(expected);
    }
}