public class PaperCupsRunner {
    public static void main(String[] args) {
        PaperCups defaultCups = new PaperCups();
        PaperCups customCups = new PaperCups("GreenPack", "Bamboo Paper", "White", "Coffee Print", "04/2024", "GP404", "EcoStore", "India", 150, 50, 1000, 99.0, 7.0, 5.0, 8.0, 4.5, 4.7, 0.0, true, true);

        System.out.println("Default PaperCups: " + defaultCups.brand + " | Pack Size: " + defaultCups.packSize);
        System.out.println("Custom PaperCups: " + customCups.brand + " | Pack Size: " + customCups.packSize);
    }
}