public class PlasticPlate {
    String brand, shape, color, materialGrade, pattern, mfgDate, batchNo, vendor, originCountry;
    int packSize, stockCount;
    double diameterCm, price, weightPerPlateGrams, rating, discount;
    boolean isMicrowaveSafe, isDishwasherSafe, isBpaFree, isRecyclable;

    public PlasticPlate() {
        this("Cello", "Round", "White", "Food Grade PP", "Textured Edge", "12/2023", "PL990", "Kitchen Hub", "India", 6, 300, 25.0, 299.0, 150.0, 4.5, 10.0, true, true, true, true);
    }

    public PlasticPlate(String brand, String shape, String color, String materialGrade, String pattern, String mfgDate, String batchNo, String vendor, String originCountry, int packSize, int stockCount, double diameterCm, double price, double weightPerPlateGrams, double rating, double discount, boolean isMicrowaveSafe, boolean isDishwasherSafe, boolean isBpaFree, boolean isRecyclable) {
        this.brand = brand; this.shape = shape; this.color = color; this.materialGrade = materialGrade; this.pattern = pattern; this.mfgDate = mfgDate; this.batchNo = batchNo; this.vendor = vendor; this.originCountry = originCountry; this.packSize = packSize; this.stockCount = stockCount; this.diameterCm = diameterCm; this.price = price; this.weightPerPlateGrams = weightPerPlateGrams; this.rating = rating; this.discount = discount; this.isMicrowaveSafe = isMicrowaveSafe; this.isDishwasherSafe = isDishwasherSafe; this.isBpaFree = isBpaFree; this.isRecyclable = isRecyclable;
    }
}