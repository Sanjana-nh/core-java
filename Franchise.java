class Franchise {
    String franchiseName;
    String teamPrincipal;
    String baseLocation;
    int championshipsWon;
    String engineSupplier;
    String leadDriver;
    int yearEstablished;
    double budgetCapMillions;
    boolean isActive;
    String mainSponsor;

    public void getFranchiseDetails() {
        System.out.println("------------------------");
        System.out.println("The Franchise Details are:");
        System.out.println("Franchise Name : " + franchiseName);
        System.out.println("Team Principal : " + teamPrincipal);
        System.out.println("Base Location : " + baseLocation);
        System.out.println("Championships Won : " + championshipsWon);
        System.out.println("Engine Supplier : " + engineSupplier);
        System.out.println("Lead Driver : " + leadDriver);
        System.out.println("Year Established : " + yearEstablished);
        System.out.println("Budget Cap ($M) : " + budgetCapMillions);
        System.out.println("Is Active : " + isActive);
        System.out.println("Main Sponsor : " + mainSponsor);
    }
}