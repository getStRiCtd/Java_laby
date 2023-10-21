package lab1;

public class Problem1 {
    public static boolean containsDigitAInHexadecimalRepresentation(int number) {
//        String hex = Integer.toHexString(number);
//        return hex.contains("a");
        while (number/16 >= 10) {
            number /=16;
        }
        return (number == 10) || (number % 16 == 10);
    }
}
