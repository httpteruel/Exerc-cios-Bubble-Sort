
public class Ordenacao {

    public static boolean isSortedAfterOnePass(int[] arr) {
        int n = arr.length;
        boolean swapped = false;
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        return !swapped;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5};
        System.out.println("Saída: " + isSortedAfterOnePass(arr));
    }
}
