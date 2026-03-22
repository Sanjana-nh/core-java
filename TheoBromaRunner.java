public class TheoBromaRunner {
    public static void main(String[] args) {
        TheoBroma defaultBakery = new TheoBroma();
        TheoBroma customBakery = new TheoBroma("TB-DEL-03", "New Delhi", "Priya Singh", "09:00 AM", "10:30 PM", "Walnut Brownie", "9876500000", "11223344558899", "DELHI15", 12, 8, 15, 65000.0, 550.0, 4.6, false, true, true, false, true);

        System.out.println("Default Bakery Location: " + defaultBakery.locationCity + " | Manager: " + defaultBakery.storeManager);
        System.out.println("Custom Bakery Location: " + customBakery.locationCity + " | Manager: " + customBakery.storeManager);
    }
}