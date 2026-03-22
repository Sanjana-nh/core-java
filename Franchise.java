class Franchise {
    String franchiseName; String teamPrincipal; String baseLocation; int championshipsWon; String engineSupplier;
    String leadDriver; int yearEstablished; double budgetCapMillions; boolean isActive; String mainSponsor;

    public Franchise(String franchiseName, String teamPrincipal, String baseLocation, int championshipsWon, String engineSupplier, String leadDriver, int yearEstablished, double budgetCapMillions, boolean isActive, String mainSponsor) {
        this.franchiseName = franchiseName; this.teamPrincipal = teamPrincipal; this.baseLocation = baseLocation;
        this.championshipsWon = championshipsWon; this.engineSupplier = engineSupplier; this.leadDriver = leadDriver;
        this.yearEstablished = yearEstablished; this.budgetCapMillions = budgetCapMillions; this.isActive = isActive;
        this.mainSponsor = mainSponsor;
    }

    public void displayDetails() {
        System.out.println("------------------------");
        System.out.println("Team : " + franchiseName + " | Principal : " + teamPrincipal + " | Base : " + baseLocation);
        System.out.println("Championships : " + championshipsWon + " | Engine : " + engineSupplier + " | Lead : " + leadDriver);
        System.out.println("Est. : " + yearEstablished + " | Budget : $" + budgetCapMillions + "M | Active : " + isActive + " | Sponsor : " + mainSponsor);
    }
}



