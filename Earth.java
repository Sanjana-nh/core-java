class Earth {
    String earthDesignation;
    String dominantSpecies;
    double populationBillion;
    boolean isHabitable;
    int techLevel;
    boolean magicExists;
    String majorThreat;
    String protectorName;
    String atmosphereType;
    double waterPercentage;

    public void getEarthDetails() {
        System.out.println("------------------------");
        System.out.println("The Earth Details are:");
        System.out.println("Designation : " + earthDesignation);
        System.out.println("Dominant Species : " + dominantSpecies);
        System.out.println("Population (B) : " + populationBillion);
        System.out.println("Habitable : " + isHabitable);
        System.out.println("Tech Level : " + techLevel);
        System.out.println("Magic Exists : " + magicExists);
        System.out.println("Major Threat : " + majorThreat);
        System.out.println("Protector : " + protectorName);
        System.out.println("Atmosphere : " + atmosphereType);
        System.out.println("Water % : " + waterPercentage);
    }
}



