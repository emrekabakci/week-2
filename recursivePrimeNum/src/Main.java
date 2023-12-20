import java.util.Scanner;

public class Main {
    static boolean isPrime(int n, int i) {

        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return isPrime(n, i + 1);
    }


    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = inp.nextInt();

        if (isPrime(n, 2))
            System.out.println("Yes " + n + " is a prime number.");
        else
            System.out.println("No " + n + " is not a prime number.");
    }

}

