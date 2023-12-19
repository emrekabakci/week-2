import java.util.Scanner;

public class Main {

    //pow() method created for calculate power of base number.
    static int pow(int base, int exponent){

        if (exponent == 0){
            return 1;
        }
        return base * pow(base, exponent - 1);
    }

    public static void main(String[] args) {
        //Scanner created.
        Scanner inp = new Scanner(System.in);
        //Data retrieved from user.
        System.out.print("Please enter number for base: ");
        int base = inp.nextInt();
        System.out.print("Please enter number for exponent: ");
        int exponent = inp.nextInt();

        //Result printed.
        System.out.println(pow(base,exponent));

    }
}