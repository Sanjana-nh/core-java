class VVPuram {
    String zoneName;
    boolean parkingAvailable;
    FoodStreet foodStreet;

    public void getVVPuramDetails() {
        System.out.println("========================");
        System.out.println("Zone Name : " + zoneName);
        System.out.println("Parking Available : " + parkingAvailable);
        this.foodStreet.getFoodStreetDetails();
    }
}