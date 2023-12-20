import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //n value retrieved from user.
        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        // Recursive function called
        printPattern(n);

    }

    public static void printPattern(int n) {
        if (n <= 0) {
            //When reach 0 function will stop
            System.out.print(n + " ");
        } else {
            //Decrease the value with -5
            System.out.print(n + " ");
            printPattern(n - 5);
            //Waiting for the stop the function when function stops this code will print increased with 5
            System.out.print(n + " ");
        }
    }
}