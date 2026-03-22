public class BedSheetRunner {
    public static void main(String[] args) {
        BedSheet defaultSheet = new BedSheet();
        BedSheet customSheet = new BedSheet("Spaces", "Queen", "Linen", "Beige", "Solid", "Hand Wash", "01/2024", "Lifestyle", "India", 400, 2, 1500, 100, 2500.0, 250.0, 225.0, 4.8, 10.0, true, true);

        System.out.println("Default BedSheet: " + defaultSheet.brand + " | Size: " + defaultSheet.size);
        System.out.println("Custom BedSheet: " + customSheet.brand + " | Size: " + customSheet.size);
    }
}