public class SunscreamRunner {
    public static void main(String[] args) {
        Sunscream defaultScream = new Sunscream();
        Sunscream customScream = new Sunscream("Aqualogica", "PA+++", "Oily Skin", "Hyaluronic Acid", "Watermelon", "02/2024", "02/2026", "AQ887", "Pump Bottle", "Nykaa", "India", 50, 80, 1200, 599.0, 15.0, 4.6, false, false, true);

        System.out.println("Default Sunscreen: " + defaultScream.brand + " | SPF: " + defaultScream.spfRating);
        System.out.println("Custom Sunscreen: " + customScream.brand + " | SPF: " + customScream.spfRating);
    }
}