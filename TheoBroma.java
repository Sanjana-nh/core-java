public class TheoBroma {
    String branchId, locationCity, storeManager, openingTime, closingTime, bestSellingItem, contactNumber, fssaiLicenseNo, currentPromotionCode;
    int totalStaff, deliveryRadiusKm, totalBrownieFlavors;
    double dailyRevenue, averageOrderValue, customerSatisfactionScore;
    boolean isOpen24Hours, offersDelivery, hasVeganOptions, hasGlutenFreeOptions, acceptsCreditCards;

    public TheoBroma() {
        this("TB-BLR-01", "Bengaluru", "Rahul Sharma", "08:00 AM", "11:00 PM", "Chocoholic Brownie", "9876543210", "11223344556677", "SWEET10", 15, 10, 12, 55000.0, 450.0, 4.7, false, true, true, true, true);
    }

    public TheoBroma(String branchId, String locationCity, String storeManager, String openingTime, String closingTime, String bestSellingItem, String contactNumber, String fssaiLicenseNo, String currentPromotionCode, int totalStaff, int deliveryRadiusKm, int totalBrownieFlavors, double dailyRevenue, double averageOrderValue, double customerSatisfactionScore, boolean isOpen24Hours, boolean offersDelivery, boolean hasVeganOptions, boolean hasGlutenFreeOptions, boolean acceptsCreditCards) {
        this.branchId = branchId; this.locationCity = locationCity; this.storeManager = storeManager; this.openingTime = openingTime; this.closingTime = closingTime; this.bestSellingItem = bestSellingItem; this.contactNumber = contactNumber; this.fssaiLicenseNo = fssaiLicenseNo; this.currentPromotionCode = currentPromotionCode; this.totalStaff = totalStaff; this.deliveryRadiusKm = deliveryRadiusKm; this.totalBrownieFlavors = totalBrownieFlavors; this.dailyRevenue = dailyRevenue; this.averageOrderValue = averageOrderValue; this.customerSatisfactionScore = customerSatisfactionScore; this.isOpen24Hours = isOpen24Hours; this.offersDelivery = offersDelivery; this.hasVeganOptions = hasVeganOptions; this.hasGlutenFreeOptions = hasGlutenFreeOptions; this.acceptsCreditCards = acceptsCreditCards;
    }
}