public class TediBarLotion {
    String brand, suitableForAge, fragrance, mainIngredient, mfgDate, expDate, batchNumber, bottleMaterial, sellerName, originCountry;
    int volumeMl, stockCount;
    double price, phLevel, discount, rating;
    boolean isSoapFree, isDermatologistTested, pumpDispenser, isTravelSize;

    public TediBarLotion() {
        this("TediBar", "0-5 Years", "Mild Baby", "Oatmeal", "01/2024", "01/2026", "TB102", "Plastic", "PharmaCare", "India", 150, 500, 250.0, 5.5, 10.0, 4.8, true, true, true, false);
    }

    public TediBarLotion(String brand, String suitableForAge, String fragrance, String mainIngredient, String mfgDate, String expDate, String batchNumber, String bottleMaterial, String sellerName, String originCountry, int volumeMl, int stockCount, double price, double phLevel, double discount, double rating, boolean isSoapFree, boolean isDermatologistTested, boolean pumpDispenser, boolean isTravelSize) {
        this.brand = brand; this.suitableForAge = suitableForAge; this.fragrance = fragrance; this.mainIngredient = mainIngredient; this.mfgDate = mfgDate; this.expDate = expDate; this.batchNumber = batchNumber; this.bottleMaterial = bottleMaterial; this.sellerName = sellerName; this.originCountry = originCountry; this.volumeMl = volumeMl; this.stockCount = stockCount; this.price = price; this.phLevel = phLevel; this.discount = discount; this.rating = rating; this.isSoapFree = isSoapFree; this.isDermatologistTested = isDermatologistTested; this.pumpDispenser = pumpDispenser; this.isTravelSize = isTravelSize;
    }
}