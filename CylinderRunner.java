public class CylinderRunner {
    public static void main(String[] args) {
        Cylinder defaultCylinder = new Cylinder();
        Cylinder customCylinder = new Cylinder("Bharat Gas", "LPG", "Red", "Click-on", "08/2021", "08/2031", "BG112233", "Pending", "SUP555", "India", 15.0, 19.0, 34.0, 1850.0, 4.2, 0.0, true, false, true, true);

        System.out.println("Default Cylinder: " + defaultCylinder.providerName + " | Net Weight: " + defaultCylinder.netWeightKg + "kg");
        System.out.println("Custom Cylinder: " + customCylinder.providerName + " | Net Weight: " + customCylinder.netWeightKg + "kg");
    }
}