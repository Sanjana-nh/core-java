class Formula1 {
    String raceCategory; int seasonYear; Franchise franchise;

    public Formula1(String raceCategory, int seasonYear, Franchise franchise) {
        this.raceCategory = raceCategory; this.seasonYear = seasonYear; this.franchise = franchise;
    }

    public void displayDetails() {
        System.out.println("========================");
        System.out.println("Category : " + raceCategory + " | Season : " + seasonYear);
        this.franchise.displayDetails();
    }
}