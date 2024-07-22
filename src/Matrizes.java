
import java.util.Arrays;

public class Matrizes {

    public static void bubbleSortMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            bubbleSort(row);
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3, 2, 1},
            {6, 5, 4},
            {9, 8, 7}
        };
        bubbleSortMatrix(matrix);
        System.out.println("Saída: " + Arrays.deepToString(matrix));
    }
}
