class Shop {
    String shopNumber;
    String shopName;
    String category;
    int floorNumber;
    double areaInSqFt;
    double monthlyRent;
    int numberOfEmployees;
    boolean isAirConditioned;
    String managerName;
    String contactNumber;

    public void getShopDetails() {
        System.out.println("------------------------");
        System.out.println("The Shop Details are:");
        System.out.println("Shop Number : " + shopNumber);
        System.out.println("Shop Name : " + shopName);
        System.out.println("Category : " + category);
        System.out.println("Floor Number : " + floorNumber);
        System.out.println("Area (Sq Ft) : " + areaInSqFt);
        System.out.println("Monthly Rent : " + monthlyRent);
        System.out.println("Employees : " + numberOfEmployees);
        System.out.println("Air Conditioned: " + isAirConditioned);
        System.out.println("Manager : " + managerName);
        System.out.println("Contact : " + contactNumber);
    }
}