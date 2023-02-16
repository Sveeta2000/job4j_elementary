package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author sveet
 * @date 16.02.2023
 */
class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayOfThreeElements() {
        int[] data = new int[] {3, 4, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayOfFiveElements() {
        int[] data = new int[] {3, 1, 1, 2, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 1, 2, 2, 3};
        assertThat(result).containsExactly(expected);
    }
}