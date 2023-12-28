import java.util.Arrays;
import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] list = {15,12,788,1,-1,-778,2,0};
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        Arrays.sort(list);
        int minValue = list[0];
        int maxValue = list[list.length - 1];

        for (int k : list) {

            if (k < number) {
                if (k > minValue) {
                    minValue = k;
                }
            }
        }
        System.out.println("The nearest number smaller than the entered number is : " + minValue);

        for (int i : list) {
            if (i > number) {
                if (i < maxValue) {
                    maxValue = i;
                }
            }
        }
        System.out.println("The nearest number greater than the entered number is : "+ maxValue);
    }
}