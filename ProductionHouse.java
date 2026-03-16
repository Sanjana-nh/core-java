class ProductionHouse {
    String houseName;
    String founderName;
    Movie movie;

    public void getProductionHouseDetails() {
        System.out.println("========================");
        System.out.println("Production House : " + houseName);
        System.out.println("Founder : " + founderName);
        this.movie.getMovieDetails();
    }
}