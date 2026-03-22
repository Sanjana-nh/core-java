public class LionDates {
    String brand, variety, originRegion, packagingType, mfgDate, expDate, batchNo, vendor, fssaiLicense;
    int weightGrams, caloriesPer100g, stockCount;
    double price, sugarGrams, moistureContentPercentage, rating, discount;
    boolean isPitted, isOrganic, isPremium;

    public LionDates() {
        this("Lion", "Oman Dates", "Middle East", "Plastic Box", "01/2024", "12/2024", "LD456", "SuperMart", "10012042000012", 500, 280, 1000, 220.0, 63.0, 15.0, 4.4, 5.0, false, false, false);
    }

    public LionDates(String brand, String variety, String originRegion, String packagingType, String mfgDate, String expDate, String batchNo, String vendor, String fssaiLicense, int weightGrams, int caloriesPer100g, int stockCount, double price, double sugarGrams, double moistureContentPercentage, double rating, double discount, boolean isPitted, boolean isOrganic, boolean isPremium) {
        this.brand = brand; this.variety = variety; this.originRegion = originRegion; this.packagingType = packagingType; this.mfgDate = mfgDate; this.expDate = expDate; this.batchNo = batchNo; this.vendor = vendor; this.fssaiLicense = fssaiLicense; this.weightGrams = weightGrams; this.caloriesPer100g = caloriesPer100g; this.stockCount = stockCount; this.price = price; this.sugarGrams = sugarGrams; this.moistureContentPercentage = moistureContentPercentage; this.rating = rating; this.discount = discount; this.isPitted = isPitted; this.isOrganic = isOrganic; this.isPremium = isPremium;
    }
}