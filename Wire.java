public class Wire {
    String brand, coreMaterial, insulationMaterial, color, applicationType, mfgDate, batchNo, vendor, originCountry;
    double lengthMeters, price, reelWeightKg, rating;
    int gaugeAwg, maxVoltage, maxCurrent, warrantyYears;
    boolean isFireRetardant, isFlexible, inStock;

    public Wire() {
        this("Finolex", "Copper", "PVC", "Red", "House Wiring", "10/2023", "WX404", "Electricals Direct", "India", 90.0, 1200.0, 2.5, 4.6, 14, 1100, 15, 10, true, true, true);
    }

    public Wire(String brand, String coreMaterial, String insulationMaterial, String color, String applicationType, String mfgDate, String batchNo, String vendor, String originCountry, double lengthMeters, double price, double reelWeightKg, double rating, int gaugeAwg, int maxVoltage, int maxCurrent, int warrantyYears, boolean isFireRetardant, boolean isFlexible, boolean inStock) {
        this.brand = brand; this.coreMaterial = coreMaterial; this.insulationMaterial = insulationMaterial; this.color = color; this.applicationType = applicationType; this.mfgDate = mfgDate; this.batchNo = batchNo; this.vendor = vendor; this.originCountry = originCountry; this.lengthMeters = lengthMeters; this.price = price; this.reelWeightKg = reelWeightKg; this.rating = rating; this.gaugeAwg = gaugeAwg; this.maxVoltage = maxVoltage; this.maxCurrent = maxCurrent; this.warrantyYears = warrantyYears; this.isFireRetardant = isFireRetardant; this.isFlexible = isFlexible; this.inStock = inStock;
    }
}