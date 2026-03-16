class Formula1 {
    String raceCategory;
    int seasonYear;
    Franchise franchise;

    public void getFormula1Details() {
        System.out.println("========================");
        System.out.println("The Race Category is : " + raceCategory);
        System.out.println("The Season Year is : " + seasonYear);
        this.franchise.getFranchiseDetails();
    }
}