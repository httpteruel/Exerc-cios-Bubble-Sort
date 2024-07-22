
import java.util.Arrays;

public class Parcial {

    public static void bubbleSortPartial(int[] arr, int N) {
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 3, 7, 6, 5, 2};
        int N = 4;
        bubbleSortPartial(arr, N);
        System.out.println("Saída: " + Arrays.toString(arr));
    }
}
