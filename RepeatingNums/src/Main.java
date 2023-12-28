public class Main {
    public static void main(String[] args) {
        int [] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            list [i] = (int)(Math.random() * 10);
        }
        for (int i : list) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && list[i] == list[j]) {
                    if (list[i] % 2 == 0) {
                        System.out.print(list[j] + " ");
                    }
                }
            }
        }
    }
}