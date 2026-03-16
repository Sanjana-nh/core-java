class Diamond {
    String diamondName;
    double caratWeight;
    String colorGrade;
    String clarityGrade;
    String cutGrade;
    String originCountry;
    double estimatedValueUsd;
    boolean isOnDisplay;
    int discoveryYear;
    String previousOwner;

    public void getDiamondDetails() {
        System.out.println("------------------------");
        System.out.println("The Diamond Details are:");
        System.out.println("Name : " + diamondName);
        System.out.println("Carat : " + caratWeight);
        System.out.println("Color : " + colorGrade);
        System.out.println("Clarity : " + clarityGrade);
        System.out.println("Cut : " + cutGrade);
        System.out.println("Origin : " + originCountry);
        System.out.println("Value (USD) : " + estimatedValueUsd);
        System.out.println("On Display : " + isOnDisplay);
        System.out.println("Discovery Year : " + discoveryYear);
        System.out.println("Previous Owner : " + previousOwner);
    }
}


