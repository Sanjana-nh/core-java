class Bogie {
    String bogieNumber; String bogieType; int capacity; String color; double weightInTons; 
    String manufacturer; int yearOfManufacture; boolean hasBioToilets; int numberOfDoors; boolean isAC;

    public Bogie(String bogieNumber, String bogieType, int capacity, String color, double weightInTons, String manufacturer, int yearOfManufacture, boolean hasBioToilets, int numberOfDoors, boolean isAC) {
        this.bogieNumber = bogieNumber; this.bogieType = bogieType; this.capacity = capacity; this.color = color;
        this.weightInTons = weightInTons; this.manufacturer = manufacturer; this.yearOfManufacture = yearOfManufacture;
        this.hasBioToilets = hasBioToilets; this.numberOfDoors = numberOfDoors; this.isAC = isAC;
    }

    public void displayDetails() {
        System.out.println("------------------------");
        System.out.println("Bogie Number : " + bogieNumber + " | Type : " + bogieType + " | Capacity : " + capacity);
        System.out.println("Color : " + color + " | Weight : " + weightInTons + "T | Mfr : " + manufacturer);
        System.out.println("Year : " + yearOfManufacture + " | BioToilets : " + hasBioToilets + " | Doors : " + numberOfDoors + " | AC : " + isAC);
    }
}



