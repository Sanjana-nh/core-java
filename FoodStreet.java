class FoodStreet {
    int stallNumber;
    String stallName;
    String signatureDish;
    double priceRs;
    boolean isPureVeg;
    double rating;
    String ownerName;
    String openingTimePM;
    String closingTimePM;
    boolean isCrowded;

    public void getFoodStreetDetails() {
        System.out.println("------------------------");
        System.out.println("The Stall Details are:");
        System.out.println("Stall Number : " + stallNumber);
        System.out.println("Stall Name : " + stallName);
        System.out.println("Signature Dish: " + signatureDish);
        System.out.println("Price (Rs) : " + priceRs);
        System.out.println("Pure Veg : " + isPureVeg);
        System.out.println("Rating : " + rating);
        System.out.println("Owner : " + ownerName);
        System.out.println("Opens at : " + openingTimePM);
        System.out.println("Closes at : " + closingTimePM);
        System.out.println("Is Crowded : " + isCrowded);
    }
}



