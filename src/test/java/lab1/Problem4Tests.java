package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Problem4Tests {
    @Test
    void shouldReturnTrue(){
        String numbers = "1,2,4,8,16";
        boolean result = Problem4.isGeometricProgression(numbers);
        assertTrue(result);
    }

    @Test
    void shouldReturnTrue_withPermutation(){
        String numbers = "16,2,8,1,4";
        boolean result = Problem4.isGeometricProgression(numbers);
        assertTrue(result);
    }

    @Test
    void shouldReturnFalse(){
        String numbers = "2,3,5";
        boolean result = Problem4.isGeometricProgression(numbers);
        assertFalse(result);
    }
}
