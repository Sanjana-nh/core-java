class Service {
    String serviceId;
    String serviceName;
    String category;
    int durationMins;
    double priceRs;
    boolean isUnisex;
    String beauticianName;
    String productsUsed;
    boolean isDiscountApplicable;
    double rating;

    public void getServiceDetails() {
        System.out.println("------------------------");
        System.out.println("The Service Details are:");
        System.out.println("Service ID : " + serviceId);
        System.out.println("Name : " + serviceName);
        System.out.println("Category : " + category);
        System.out.println("Duration (Mins): " + durationMins);
        System.out.println("Price (Rs) : " + priceRs);
        System.out.println("Unisex : " + isUnisex);
        System.out.println("Beautician : " + beauticianName);
        System.out.println("Products : " + productsUsed);
        System.out.println("Discount App : " + isDiscountApplicable);
        System.out.println("Rating : " + rating);
    }
}



