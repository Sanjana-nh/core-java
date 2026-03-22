public class CombRunner {
    public static void main(String[] args) {
        Comb defaultComb = new Comb();
        Comb customComb = new Comb("Vega", "Carbon Fiber", "Tail Comb", "Black", "Fine", "Textured", "Straight", "11/2023", "StylePro", "India", 22.0, 250.0, 4.5, 5.0, 30, 12, 500, true, true, false);

        System.out.println("Default Comb: " + defaultComb.brand + " | Type: " + defaultComb.type);
        System.out.println("Custom Comb: " + customComb.brand + " | Type: " + customComb.type);
    }
}