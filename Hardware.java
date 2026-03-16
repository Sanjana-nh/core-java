class Hardware {
    String componentType;
    String manufacturer;
    String modelName;
    int releaseYear;
    double price;
    int warrantyYears;
    int powerDrawWatts;
    boolean hasRGB;
    String formFactor;
    double weightInKg;

    public void getHardwareDetails() {
        System.out.println("------------------------");
        System.out.println("The Hardware Details are:");
        System.out.println("Component Type : " + componentType);
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Model Name : " + modelName);
        System.out.println("Release Year : " + releaseYear);
        System.out.println("Price ($) : " + price);
        System.out.println("Warranty (Years) : " + warrantyYears);
        System.out.println("Power Draw (W) : " + powerDrawWatts);
        System.out.println("Has RGB : " + hasRGB);
        System.out.println("Form Factor : " + formFactor);
        System.out.println("Weight (Kg) : " + weightInKg);
    }
}