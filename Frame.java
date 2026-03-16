class Frame {
    String frameId;
    String brand;
    String shape;
    String color;
    String material;
    double price;
    int weightGrams;
    boolean isFlexible;
    String size;
    int warrantyMonths;

    public void getFrameDetails() {
        System.out.println("------------------------");
        System.out.println("The Frame Details are:");
        System.out.println("Frame ID : " + frameId);
        System.out.println("Brand : " + brand);
        System.out.println("Shape : " + shape);
        System.out.println("Color : " + color);
        System.out.println("Material : " + material);
        System.out.println("Price : " + price);
        System.out.println("Weight (g) : " + weightGrams);
        System.out.println("Is Flexible : " + isFlexible);
        System.out.println("Size : " + size);
        System.out.println("Warranty (Months): " + warrantyMonths);
    }
}


