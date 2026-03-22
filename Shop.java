class Shop {
    String shopNumber; String shopName; String category; int floorNumber; double areaInSqFt; 
    double monthlyRent; int numberOfEmployees; boolean isAirConditioned; String managerName; String contactNumber;

    public Shop(String shopNumber, String shopName, String category, int floorNumber, double areaInSqFt, double monthlyRent, int numberOfEmployees, boolean isAirConditioned, String managerName, String contactNumber) {
        this.shopNumber = shopNumber; this.shopName = shopName; this.category = category; this.floorNumber = floorNumber;
        this.areaInSqFt = areaInSqFt; this.monthlyRent = monthlyRent; this.numberOfEmployees = numberOfEmployees;
        this.isAirConditioned = isAirConditioned; this.managerName = managerName; this.contactNumber = contactNumber;
    }

    public void displayDetails() {
        System.out.println("------------------------");
        System.out.println("Shop # : " + shopNumber + " | Name : " + shopName + " | Category : " + category);
        System.out.println("Floor : " + floorNumber + " | Area : " + areaInSqFt + " | Rent : " + monthlyRent);
        System.out.println("Emp : " + numberOfEmployees + " | AC : " + isAirConditioned + " | Mgr : " + managerName + " | Contact : " + contactNumber);
    }
}



