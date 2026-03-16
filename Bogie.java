class Bogie {
    String bogieNumber;
    String bogieType;
    int capacity;
    String color;
    double weightInTons;
    String manufacturer;
    int yearOfManufacture;
    boolean hasBioToilets;
    int numberOfDoors;
    boolean isAC;

    public void getBogieDetails() {
        System.out.println("------------------------");
        System.out.println("The Bogie Details are:");
        System.out.println("The Bogie Number is :" + bogieNumber);
        System.out.println("The Bogie Type is :" + bogieType);
        System.out.println("The Capacity is :" + capacity);
        System.out.println("The Color is :" + color);
        System.out.println("The Weight (Tons) is :" + weightInTons);
        System.out.println("The Manufacturer is :" + manufacturer);
        System.out.println("The Year of Manufacture is :" + yearOfManufacture);
        System.out.println("Has Bio Toilets :" + hasBioToilets);
        System.out.println("Number of Doors :" + numberOfDoors);
        System.out.println("Is AC :" + isAC);
    }
}