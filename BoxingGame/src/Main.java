public class Main {
    public static void main(String[] args) {

        Fighter marc = new Fighter("Furkan", 15, 100, 90, 10);
        Fighter alex = new Fighter("Emre", 15, 100, 100, 10);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }
}
