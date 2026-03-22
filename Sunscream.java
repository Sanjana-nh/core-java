public class Sunscream {
    String brand, paRating, skinType, mainIngredient, fragrance, mfgDate, expDate, batchNo, bottleMaterial, sellerName, originCountry;
    int spfRating, volumeMl, stockCount;
    double price, discount, rating;
    boolean isWaterResistant, isTinted, isReefSafe;

    public Sunscream() {
        this("Minimalist", "PA++++", "All Skin Types", "Zinc Oxide", "Unscented", "11/2023", "11/2025", "SUN123", "Plastic Tube", "BeautyHub", "India", 50, 50, 800, 399.0, 10.0, 4.4, true, false, true);
    }

    public Sunscream(String brand, String paRating, String skinType, String mainIngredient, String fragrance, String mfgDate, String expDate, String batchNo, String bottleMaterial, String sellerName, String originCountry, int spfRating, int volumeMl, int stockCount, double price, double discount, double rating, boolean isWaterResistant, boolean isTinted, boolean isReefSafe) {
        this.brand = brand; this.paRating = paRating; this.skinType = skinType; this.mainIngredient = mainIngredient; this.fragrance = fragrance; this.mfgDate = mfgDate; this.expDate = expDate; this.batchNo = batchNo; this.bottleMaterial = bottleMaterial; this.sellerName = sellerName; this.originCountry = originCountry; this.spfRating = spfRating; this.volumeMl = volumeMl; this.stockCount = stockCount; this.price = price; this.discount = discount; this.rating = rating; this.isWaterResistant = isWaterResistant; this.isTinted = isTinted; this.isReefSafe = isReefSafe;
    }
}