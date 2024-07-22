
import java.util.Arrays;

public class Decrescente {

    public static void bubbleSortDesc(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, -2, 5, 8};
        bubbleSortDesc(arr);
        System.out.println("Saída: " + Arrays.toString(arr));
    }
}
