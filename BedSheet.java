public class BedSheet {
    String brand, size, material, color, pattern, washCare, mfgDate, vendor, originCountry;
    int threadCount, pillowCaseCount, weightGrams, stockCount;
    double price, lengthCm, widthCm, rating, discount;
    boolean includesPillowCases, isFitted;

    public BedSheet() {
        this("Bombay Dyeing", "King", "Cotton", "Blue", "Floral", "Machine Wash Cold", "08/2023", "Home Decors", "India", 300, 2, 1200, 250, 1500.0, 275.0, 275.0, 4.6, 20.0, true, false);
    }

    public BedSheet(String brand, String size, String material, String color, String pattern, String washCare, String mfgDate, String vendor, String originCountry, int threadCount, int pillowCaseCount, int weightGrams, int stockCount, double price, double lengthCm, double widthCm, double rating, double discount, boolean includesPillowCases, boolean isFitted) {
        this.brand = brand; this.size = size; this.material = material; this.color = color; this.pattern = pattern; this.washCare = washCare; this.mfgDate = mfgDate; this.vendor = vendor; this.originCountry = originCountry; this.threadCount = threadCount; this.pillowCaseCount = pillowCaseCount; this.weightGrams = weightGrams; this.stockCount = stockCount; this.price = price; this.lengthCm = lengthCm; this.widthCm = widthCm; this.rating = rating; this.discount = discount; this.includesPillowCases = includesPillowCases; this.isFitted = isFitted;
    }
}