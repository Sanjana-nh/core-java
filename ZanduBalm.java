public class ZanduBalm {
    String brand painReliefType, mainIngredient, expiryDate, mfgDate, batchNo, color, scent, packagingMaterial, manufacturer, countryOfOrigin;
    double price, weightInGrams, customerRating, discountPercentage;
    int shelfLifeMonths;
	int stockQuantity;
    boolean isAyurvedic;
	boolean isClinicallyTested;
	boolean isAvailableOnline;

    public ZanduBalm() {
        this("Zandu", "Headache & Body Ache", "Menthol", "12/2026", "12/2023", "ZB1001", "Green", "Mint", "Glass Bottle", "Emami Ltd", "India", 45.0, 10.0, 4.8, 5.0, 36, 5000, true, true, true);
    }

    public ZanduBalm(String brand, String painReliefType, String mainIngredient, String expiryDate, String mfgDate, String batchNo, String color, String scent, String packagingMaterial, String manufacturer, String countryOfOrigin, double price, double weightInGrams, double customerRating, double discountPercentage, int shelfLifeMonths, int stockQuantity, boolean isAyurvedic, boolean isClinicallyTested, boolean isAvailableOnline) {
        this.brand = brand; 
		this.painReliefType = painReliefType;
		this.mainIngredient = mainIngredient;
		this.expiryDate = expiryDate;
		this.mfgDate = mfgDate; 
		this.batchNo = batchNo;
		this.color = color;
		this.scent = scent; 
		this.packagingMaterial = packagingMaterial;
		this.manufacturer = manufacturer;
		this.countryOfOrigin = countryOfOrigin; 
		this.price = price; 
		this.weightInGrams = weightInGrams;
		this.customerRating = customerRating;
		this.discountPercentage = discountPercentage; 
		this.shelfLifeMonths = shelfLifeMonths;
		this.stockQuantity = stockQuantity;
		this.isAyurvedic = isAyurvedic;
		this.isClinicallyTested = isClinicallyTested;
		this.isAvailableOnline = isAvailableOnline;
    }
}