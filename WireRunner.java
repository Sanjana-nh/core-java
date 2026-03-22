public class WireRunner {
    public static void main(String[] args) {
        Wire defaultWire = new Wire();
        Wire customWire = new Wire("Polycab", "Aluminum", "Teflon", "Black", "Industrial", "01/2024", "PC999", "BuildMart", "India", 100.0, 1500.0, 3.0, 4.8, 12, 2200, 25, 5, true, false, true);

        System.out.println("Default Wire: " + defaultWire.brand + " | Core: " + defaultWire.coreMaterial);
        System.out.println("Custom Wire: " + customWire.brand + " | Core: " + customWire.coreMaterial);
    }
}