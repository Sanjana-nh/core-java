public class PaperCups {
    String brand, material, color, design, mfgDate, batchNo, vendor, originCountry;
    int capacityMl, packSize, stockCount;
    double price, diameterTopCm, diameterBottomCm, heightCm, weightPerCupGrams, rating, discount;
    boolean isBiodegradable, isForHotDrinks;

    public PaperCups() {
        this("EcoWare", "Kraft Paper", "Brown", "Plain", "01/2024", "PC889", "Party Supplies Inc", "India", 250, 100, 500, 150.0, 8.0, 5.5, 9.0, 5.0, 4.2, 5.0, true, true);
    }

    public PaperCups(String brand, String material, String color, String design, String mfgDate, String batchNo, String vendor, String originCountry, int capacityMl, int packSize, int stockCount, double price, double diameterTopCm, double diameterBottomCm, double heightCm, double weightPerCupGrams, double rating, double discount, boolean isBiodegradable, boolean isForHotDrinks) {
        this.brand = brand; this.material = material; this.color = color; this.design = design; this.mfgDate = mfgDate; this.batchNo = batchNo; this.vendor = vendor; this.originCountry = originCountry; this.capacityMl = capacityMl; this.packSize = packSize; this.stockCount = stockCount; this.price = price; this.diameterTopCm = diameterTopCm; this.diameterBottomCm = diameterBottomCm; this.heightCm = heightCm; this.weightPerCupGrams = weightPerCupGrams; this.rating = rating; this.discount = discount; this.isBiodegradable = isBiodegradable; this.isForHotDrinks = isForHotDrinks;
    }
}