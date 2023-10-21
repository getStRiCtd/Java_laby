package lab1;

public class Main {
    public static void main(String[] args) {

        boolean answerProblem1 = Problem1.containsDigitAInHexadecimalRepresentation(29);
        System.out.println(answerProblem1);
        int[] input = {1,2,3,7,8,9};
        int[] expected = {2,8,1,3,7,9};
        int[] result = Problem2.segregateEvenAndOddNumbers(input);
    }
}