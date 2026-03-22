public class TediBarLotionRunner {
    public static void main(String[] args) {
        TediBarLotion defaultLotion = new TediBarLotion();
        TediBarLotion customLotion = new TediBarLotion("Himalaya Baby", "0-3 Years", "Aloe Vera", "Aloe Extract", "03/2024", "03/2026", "HB220", "Plastic Pump", "BabyCare Hub", "India", 200, 800, 180.0, 5.5, 15.0, 4.6, true, true, true, false);

        System.out.println("Default Lotion: " + defaultLotion.brand + " | Volume: " + defaultLotion.volumeMl + "ml");
        System.out.println("Custom Lotion: " + customLotion.brand + " | Volume: " + customLotion.volumeMl + "ml");
    }
}