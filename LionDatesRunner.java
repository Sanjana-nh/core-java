public class LionDatesRunner {
    public static void main(String[] args) {
        LionDates defaultDates = new LionDates();
        LionDates customDates = new LionDates("Kimia", "Mazafati", "Iran", "Cardboard Box", "11/2023", "11/2024", "KM777", "DryFruit Hub", "10015042000088", 600, 290, 500, 450.0, 65.0, 20.0, 4.8, 10.0, false, true, true);

        System.out.println("Default Dates: " + defaultDates.brand + " | Variety: " + defaultDates.variety);
        System.out.println("Custom Dates: " + customDates.brand + " | Variety: " + customDates.variety);
    }
}