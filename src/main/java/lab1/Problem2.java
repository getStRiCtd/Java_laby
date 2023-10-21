package lab1;

public class Problem2 {
    public static int[] segregateEvenAndOddNumbers(int[] array) {
//      шейкерная сортировка не оч конечно зато циклы и if потрогал
        int r_border = array.length;
        int l_border = 0;
        boolean swapped = true;
        int tmp =0;

        while (swapped) {
            swapped = false;
            for (int i = l_border; i < r_border-1; i++) {
                if (array[i] % 2 == 1 && array[i+1] % 2==0) {
                    tmp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=tmp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
            r_border--;
            swapped = false;

            for (int i = r_border-1; i > l_border; i--) {
                if (array[i] % 2 == 0 && array[i-1] % 2==1) {
                    tmp=array[i];
                    array[i]=array[i-1];
                    array[i-1]=tmp;
                    swapped = true;
                }
            }
            l_border++;
        }
        return array;
    }
}
