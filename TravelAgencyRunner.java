class TravelAgencyRunner {
    public static void main(String[] args) {
        TravelAgency agency = new TravelAgency();

        agency.addPlace("Paris");
        agency.addPlace("Tokyo");
        agency.addPlace("New York");
        agency.addPlace("London");
        agency.addPlace("Rome");
        agency.addPlace("Sydney");
        agency.addPlace("Istanbul");
        agency.addPlace("Dubai");
        agency.addPlace("Singapore");
        agency.addPlace("Barcelona");
        agency.addPlace("Amsterdam");
        agency.addPlace("Seoul");
        agency.addPlace("Bangkok");
        agency.addPlace("Bali");
        agency.addPlace("Maldives");
        agency.addPlace("Cape Town");
        agency.addPlace("Rio de Janeiro");

        agency.getPlaces();
    }
}