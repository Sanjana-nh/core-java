class LazyPool {
    String poolId;
    String themeName;
    double capacityLiters;
    double depthMeters;
    double temperatureCelsius;
    boolean isHeated;
    int maxPersons;
    String lifeguardName;
    int cleaningFrequencyHours;
    double chlorineLevelPpm;

    public void getLazyPoolDetails() {
        System.out.println("------------------------");
        System.out.println("The Lazy Pool Details are:");
        System.out.println("Pool ID : " + poolId);
        System.out.println("Theme Name : " + themeName);
        System.out.println("Capacity (L) : " + capacityLiters);
        System.out.println("Depth (m) : " + depthMeters);
        System.out.println("Temp (C) : " + temperatureCelsius);
        System.out.println("Is Heated : " + isHeated);
        System.out.println("Max Persons : " + maxPersons);
        System.out.println("Lifeguard : " + lifeguardName);
        System.out.println("Cleaning Freq (Hrs) : " + cleaningFrequencyHours);
        System.out.println("Chlorine (ppm) : " + chlorineLevelPpm);
    }
}


