public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double sum = 0.0;
        double harmonic = 0.0;

        for (int i : list) {
            sum += i;
        }

        for (double j = 1; j <= list.length; j++) {
            harmonic += (1 / j);
        }

        double average = sum / list.length;
        System.out.println("Average of Numbers in the Series: " + average);
        System.out.println("Harmonic Mean in the Series: " + harmonic);
    }
}