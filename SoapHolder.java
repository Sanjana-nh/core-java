public class SoapHolder {
    String brand, material, color, shape, finish, vendor, originCountry;
    double price, lengthCm, widthCm, rating, discount;
    int weightGrams, warrantyMonths, stockCount;
    boolean hasWaterDrain, isWallMounted, suctionCupIncluded, isRustProof, isEcoFriendly;

    public SoapHolder() {
        this("Cera", "Stainless Steel", "Silver", "Oval", "Matte", "BathFittings Co", "India", 350.0, 12.5, 8.5, 4.3, 5.0, 200, 12, 150, true, true, false, true, false);
    }

    public SoapHolder(String brand, String material, String color, String shape, String finish, String vendor, String originCountry, double price, double lengthCm, double widthCm, double rating, double discount, int weightGrams, int warrantyMonths, int stockCount, boolean hasWaterDrain, boolean isWallMounted, boolean suctionCupIncluded, boolean isRustProof, boolean isEcoFriendly) {
        this.brand = brand; this.material = material; this.color = color; this.shape = shape; this.finish = finish; this.vendor = vendor; this.originCountry = originCountry; this.price = price; this.lengthCm = lengthCm; this.widthCm = widthCm; this.rating = rating; this.discount = discount; this.weightGrams = weightGrams; this.warrantyMonths = warrantyMonths; this.stockCount = stockCount; this.hasWaterDrain = hasWaterDrain; this.isWallMounted = isWallMounted; this.suctionCupIncluded = suctionCupIncluded; this.isRustProof = isRustProof; this.isEcoFriendly = isEcoFriendly;
    }
}