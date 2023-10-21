package lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class Problem2Tests {

    @Test
    void whatTheActualF(){
        //given
        int[] input = {1,2,3,7,8,9};
        int[] expected = {2,8,1,3,7,9};
        int[] result = Problem2.segregateEvenAndOddNumbers(input);
        assertArrayEquals(expected, result);
    }

    @Test
    void iGotItReally(){
        int[] input = {2, 1, 5, 6, 8};
        int[] expected = {2, 6, 8, 1, 5};
        int[] result = Problem2.segregateEvenAndOddNumbers(input);
        assertArrayEquals(expected, result);
    }
}
