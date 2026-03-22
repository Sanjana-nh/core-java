public class MedicalShopRunner {
    public static void main(String[] args) {
        MedicalShop defaultShop = new MedicalShop();
        MedicalShop customShop = new MedicalShop("Wellness Forever", "WF102030", "Amit Patel", "9988776655", "Linking Road", "Mumbai", "00:00 AM", "11:59 PM", 400050, 800, 15, 10.0, 4.7, 5000000.0, 120000.0, true, true, false, true, true);

        System.out.println("Default Shop: " + defaultShop.shopName + " | City: " + defaultShop.city);
        System.out.println("Custom Shop: " + customShop.shopName + " | City: " + customShop.city);
    }
}