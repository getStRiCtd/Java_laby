package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Problem3Tests {
    @Test
    void example_data(){
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = Problem3.flattenMatrix((input));
        assertArrayEquals(expected, result);
    }
}
