mport

java.util.Arrays;

public class Jogos {

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
        int[] scores = {250, 300, 150, 400, 350};
        bubbleSortDesc(scores);
        System.out.println("Pontuações Ordenadas: " + Arrays.toString(scores));
        System.out.println("Pontuação Mais Alta: " + scores[0]);
    }
}
