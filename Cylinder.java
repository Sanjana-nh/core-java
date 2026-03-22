public class Cylinder {
    String providerName, gasType, cylinderColor, valveType, testDate, nextTestDate, serialNumber, deliveryStatus, supplierId, origin;
    double emptyWeightKg, netWeightKg, grossWeightKg, price, rating, deliveryFee;
    boolean isCommercial, isSubsidized, inStock, safetyCapIncluded;

    public Cylinder() {
        this("Indane", "LPG", "Red", "Standard Pin", "05/2020", "05/2030", "CYL98765", "Delivered", "SUP101", "India", 15.3, 14.2, 29.5, 950.0, 4.5, 50.0, false, true, true, true);
    }

    public Cylinder(String providerName, String gasType, String cylinderColor, String valveType, String testDate, String nextTestDate, String serialNumber, String deliveryStatus, String supplierId, String origin, double emptyWeightKg, double netWeightKg, double grossWeightKg, double price, double rating, double deliveryFee, boolean isCommercial, boolean isSubsidized, boolean inStock, boolean safetyCapIncluded) {
        this.providerName = providerName; this.gasType = gasType; this.cylinderColor = cylinderColor; this.valveType = valveType; this.testDate = testDate; this.nextTestDate = nextTestDate; this.serialNumber = serialNumber; this.deliveryStatus = deliveryStatus; this.supplierId = supplierId; this.origin = origin; this.emptyWeightKg = emptyWeightKg; this.netWeightKg = netWeightKg; this.grossWeightKg = grossWeightKg; this.price = price; this.rating = rating; this.deliveryFee = deliveryFee; this.isCommercial = isCommercial; this.isSubsidized = isSubsidized; this.inStock = inStock; this.safetyCapIncluded = safetyCapIncluded;
    }
}