public class Main {

    public static void main(String[] args) {
        int [] list = {10, 20, 20, 10, 10, 20, 5, 20} ;
        int[] duplicate = new int [list.length];

        for(int i = 0; i < list.length; i++) {
            int elements = list[i];
            int frequency = 1;
            for (int j = 0; j < i; j++) {
                if (list[j] == elements) {
                    frequency++;
                }
            }
            duplicate[i] = frequency;
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " element was repeated " + duplicate[i] + " times.");
        }
    }
}