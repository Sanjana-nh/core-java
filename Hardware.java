class Hardware {
    String componentType; String manufacturer; String modelName; int releaseYear; double price; 
    int warrantyYears; int powerDrawWatts; boolean hasRGB; String formFactor; double weightInKg;

    public Hardware(String componentType, String manufacturer, String modelName, int releaseYear, double price, int warrantyYears, int powerDrawWatts, boolean hasRGB, String formFactor, double weightInKg) {
        this.componentType = componentType; this.manufacturer = manufacturer; this.modelName = modelName;
        this.releaseYear = releaseYear; this.price = price; this.warrantyYears = warrantyYears;
        this.powerDrawWatts = powerDrawWatts; this.hasRGB = hasRGB; this.formFactor = formFactor; this.weightInKg = weightInKg;
    }

    public void displayDetails() {
        System.out.println("------------------------");
        System.out.println("Type : " + componentType + " | Mfr : " + manufacturer + " | Model : " + modelName);
        System.out.println("Year : " + releaseYear + " | Price : $" + price + " | Warranty : " + warrantyYears + "Y");
        System.out.println("Power : " + powerDrawWatts + "W | RGB : " + hasRGB + " | Form : " + formFactor + " | Wgt : " + weightInKg + "kg");
    }
}



