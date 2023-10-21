package lab1;
import java.util.Arrays;

public class Problem4 {

    public static boolean isGeometricProgression(String numbers) {
        int[] numArr = Arrays.stream(numbers.split(",")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numArr);
        for (int i = 1; i < numArr.length-1; i++) {
            if ( (double)numArr[i]/numArr[i-1] != (double)numArr[i+1]/numArr[i])
                return false;
        }
        return true;
    }

}
