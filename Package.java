class Package {
    String packageId;
    String destination;
    int durationDays;
    double priceRs;
    boolean isFlightIncluded;
    int hotelStarRating;
    int maxPersons;
    String guideName;
    String transportType;
    String mealPlan;

    public void getPackageDetails() {
        System.out.println("------------------------");
        System.out.println("The Package Details are:");
        System.out.println("Package ID : " + packageId);
        System.out.println("Destination : " + destination);
        System.out.println("Duration (Days) : " + durationDays);
        System.out.println("Price (Rs) : " + priceRs);
        System.out.println("Flight Included : " + isFlightIncluded);
        System.out.println("Hotel Rating : " + hotelStarRating + " Star");
        System.out.println("Max Persons : " + maxPersons);
        System.out.println("Guide Name : " + guideName);
        System.out.println("Transport : " + transportType);
        System.out.println("Meal Plan : " + mealPlan);
    }
}



