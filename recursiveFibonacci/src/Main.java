import java.util.Scanner;

public class Main {

    //Method created.
    static int fibonacci(int enteredNum){
        //Checked if it is 1 or 2.
        if (enteredNum == 1 || enteredNum == 2) {
            return 1;
        }
        //Here method is calling himself.
        return fibonacci(enteredNum - 1) + fibonacci(enteredNum - 2);
    }

    public static void main(String[] args) {

        //Scanner created
        Scanner inp = new Scanner(System.in);

        //Data retrieved from user.
        System.out.print("Enter number: ");
        int enteredNum = inp.nextInt();

        //Result printed
        System.out.println("Fibonacci result: " + fibonacci(enteredNum));

    }
}