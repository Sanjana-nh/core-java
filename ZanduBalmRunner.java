public class ZanduBalmRunner {
    public static void main(String[] args) {
        
        // 1. Using the default constructor (relies on this() statement chaining)
        ZanduBalm defaultBalm = new ZanduBalm();
        
        // 2. Using the master parameterized constructor with custom values
        ZanduBalm customBalm = new ZanduBalm(
            "Tiger Balm", "Severe Muscle Ache", "Camphor & Menthol", 
            "05/2028", "05/2024", "TB-XYZ-99", "White", "Strong Mint", 
            "Glass Jar", "Haw Par Healthcare", "Singapore", 
            85.0, 21.0, 4.9, 0.0, 48, 2500, true, true, true
        );

        // --- Output Verification ---
        System.out.println("### Default ZanduBalm Details ###");
        System.out.println("Brand: " + defaultBalm.brand);
        System.out.println("Main Ingredient: " + defaultBalm.mainIngredient);
        System.out.println("Price: ₹" + defaultBalm.price);
        System.out.println("Stock Quantity: " + defaultBalm.stockQuantity);
        
        System.out.println("\n### Custom Balm Details ###");
        System.out.println("Brand: " + customBalm.brand);
        System.out.println("Main Ingredient: " + customBalm.mainIngredient);
        System.out.println("Price: ₹" + customBalm.price);
        System.out.println("Stock Quantity: " + customBalm.stockQuantity);
    }
}