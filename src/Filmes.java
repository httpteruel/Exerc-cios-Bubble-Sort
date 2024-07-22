
public class Filmes {

    public static void bubbleSort(double[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j][1] > arr[j + 1][1]) {
                    double[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static double calculateAverage(int[] ratings) {
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return (double) sum / ratings.length;
    }

    public static void main(String[] args) {
        Object[][] movies = {
            {"Filme A", new int[]{5, 4, 3, 4, 5}},
            {"Filme B", new int[]{2, 3, 4, 3, 2}},
            {"Filme C", new int[]{4, 4, 5, 5, 4}}
        };

        double[][] avgRatings = new double[movies.length][2];
        for (int i = 0; i < movies.length; i++) {
            avgRatings[i][0] = i;
            avgRatings[i][1] = calculateAverage((int[]) movies[i][1]);
        }

        bubbleSort(avgRatings);

        System.out.println("Filmes Ordenados: ");
        for (double[] movie : avgRatings) {
            int index = (int) movie[0];
            System.out.println(movies[index][0] + ": " + movie[1]);
        }

        int bestMovieIndex = (int) avgRatings[avgRatings.length - 1][0];
        System.out.println("Filme Mais Bem Avaliado: " + movies[bestMovieIndex][0]);
    }
}
