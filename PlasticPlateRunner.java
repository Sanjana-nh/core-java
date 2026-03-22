public class PlasticPlateRunner {
    public static void main(String[] args) {
        PlasticPlate defaultPlate = new PlasticPlate();
        PlasticPlate customPlate = new PlasticPlate("Tupperware", "Square", "Red", "Premium PP", "Smooth", "03/2024", "TW123", "Tupperware Store", "India", 4, 150, 20.0, 550.0, 200.0, 4.9, 5.0, true, true, true, true);

        System.out.println("Default Plate: " + defaultPlate.brand + " | Shape: " + defaultPlate.shape);
        System.out.println("Custom Plate: " + customPlate.brand + " | Shape: " + customPlate.shape);
    }
}