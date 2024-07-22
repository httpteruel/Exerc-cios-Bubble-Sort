
import java.util.Arrays;

public class Nota {

    public static void bubbleSort(int[] arr) {
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

    public static double calculateMedian(int[] arr) {
        int n = arr.length;
        bubbleSort(arr);
        if (n % 2 == 0) {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            return arr[n / 2];
        }
    }

    public static void main(String[] args) {
        int[] notas = {85, 70, 95, 60, 75, 80};
        bubbleSort(notas);
        System.out.println("Notas Ordenadas: " + Arrays.toString(notas));
        System.out.println("Mediana: " + calculateMedian(notas));
    }
}
