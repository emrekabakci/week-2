import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Please type your word: ");
        String word = inp.nextLine();
        System.out.println(isPalindrome(word));
    }
}