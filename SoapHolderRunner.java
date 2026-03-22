public class SoapHolderRunner {
    public static void main(String[] args) {
        SoapHolder defaultHolder = new SoapHolder();
        SoapHolder customHolder = new SoapHolder("Kohler", "Ceramic", "White", "Rectangle", "Glossy", "HomeCenter", "India", 850.0, 15.0, 10.0, 4.8, 0.0, 450, 24, 80, true, false, false, false, true);

        System.out.println("Default Holder: " + defaultHolder.brand + " | Material: " + defaultHolder.material);
        System.out.println("Custom Holder: " + customHolder.brand + " | Material: " + customHolder.material);
    }
}