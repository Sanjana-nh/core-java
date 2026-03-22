public class Comb {
    String brand, material, type, color, toothSpacing, handleGrip, suitableForHairType, mfgDate, vendor, originCountry;
    double lengthCm, price, rating, discount;
    int weightGrams, warrantyMonths, stockCount;
    boolean isAntiStatic, isPocketSize, isHandcrafted;

    public Comb() {
        this("Roots", "Neem Wood", "Wide Tooth", "Brown", "Wide", "Ergonomic", "Curly", "02/2024", "NatureCare", "India", 18.0, 199.0, 4.7, 15.0, 50, 6, 300, true, false, true);
    }

    public Comb(String brand, String material, String type, String color, String toothSpacing, String handleGrip, String suitableForHairType, String mfgDate, String vendor, String originCountry, double lengthCm, double price, double rating, double discount, int weightGrams, int warrantyMonths, int stockCount, boolean isAntiStatic, boolean isPocketSize, boolean isHandcrafted) {
        this.brand = brand; this.material = material; this.type = type; this.color = color; this.toothSpacing = toothSpacing; this.handleGrip = handleGrip; this.suitableForHairType = suitableForHairType; this.mfgDate = mfgDate; this.vendor = vendor; this.originCountry = originCountry; this.lengthCm = lengthCm; this.price = price; this.rating = rating; this.discount = discount; this.weightGrams = weightGrams; this.warrantyMonths = warrantyMonths; this.stockCount = stockCount; this.isAntiStatic = isAntiStatic; this.isPocketSize = isPocketSize; this.isHandcrafted = isHandcrafted;
    }
}