public class MedicalShop {
    String shopName, licenseNumber, pharmacistName, contactNumber, address, city, openingTime, closingTime;
    int pinCode, dailyCustomersAvg, totalStaff;
    double deliveryRadiusKm, rating, stockValue, rentAmount;
    boolean isOpen24x7, hasDelivery, acceptsInsurance, acceptsCards, isFranchise;

    public MedicalShop() {
        this("Apollo Pharmacy", "APL9090", "Dr. Ravi Kumar", "9876543210", "12th Main Road", "Bengaluru", "12:00 AM", "11:59 PM", 560034, 300, 5, 5.0, 4.3, 1500000.0, 45000.0, true, true, true, true, true);
    }

    public MedicalShop(String shopName, String licenseNumber, String pharmacistName, String contactNumber, String address, String city, String openingTime, String closingTime, int pinCode, int dailyCustomersAvg, int totalStaff, double deliveryRadiusKm, double rating, double stockValue, double rentAmount, boolean isOpen24x7, boolean hasDelivery, boolean acceptsInsurance, boolean acceptsCards, boolean isFranchise) {
        this.shopName = shopName; this.licenseNumber = licenseNumber; this.pharmacistName = pharmacistName; this.contactNumber = contactNumber; this.address = address; this.city = city; this.openingTime = openingTime; this.closingTime = closingTime; this.pinCode = pinCode; this.dailyCustomersAvg = dailyCustomersAvg; this.totalStaff = totalStaff; this.deliveryRadiusKm = deliveryRadiusKm; this.rating = rating; this.stockValue = stockValue; this.rentAmount = rentAmount; this.isOpen24x7 = isOpen24x7; this.hasDelivery = hasDelivery; this.acceptsInsurance = acceptsInsurance; this.acceptsCards = acceptsCards; this.isFranchise = isFranchise;
    }
}