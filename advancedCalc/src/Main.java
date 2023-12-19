import java.util.Scanner;

public class Main {

    static void pressEnterToContinue()
    {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

    static void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            result += number;
        }

        System.out.println("Result : " + result);

        pressEnterToContinue();
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
        pressEnterToContinue();
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);

        pressEnterToContinue();
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You can't enter divisor as 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);

        pressEnterToContinue();
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base value :");
        int base = scan.nextInt();
        System.out.print("Enter exponent value :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);

        pressEnterToContinue();
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("result : " + result);

        pressEnterToContinue();
    }

    static void mode(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First Number :");
        int n = scan.nextInt();

        System.out.print("Enter Second Number :");
        int n2 = scan.nextInt();

        int result = n % n2;

        System.out.print("Result :" + result);

        pressEnterToContinue();
    }

    static void rectangleArea(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the short side of the rectangle :");
        int n = scan.nextInt();

        System.out.print("Enter the long side of the rectangle :");
        int n2 = scan.nextInt();

        int areaResult = n * n2;
        int perimeterResult = (n + n2) * 2;

        System.out.println("Rectangle Area is :" + areaResult);

        System.out.println("The Perimeter is :" + perimeterResult);

        pressEnterToContinue();

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = """
                1- Addition
                2- Subtraction
                3- Multiplication
                4- Division
                5- Exponent Calculation
                6- Factorial Calculation
                7- Mode of Numbers
                8- Rectangle Area and Perimeter Calculation
                0- Exit""";

        do {
            System.out.println(menu);
            System.out.print("Choose an action :");
            select = scan.nextInt();
            switch (select) {
                case 1 -> plus();
                case 2 -> minus();
                case 3 -> times();
                case 4 -> divided();
                case 5 -> power();
                case 6 -> factorial();
                case 7 -> mode();
                case 8 -> rectangleArea();
                case 0 -> {
                }
                default -> System.out.println("Invalid value, try again later.");
            }
        } while (select != 0);


    }
}