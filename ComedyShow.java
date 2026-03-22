public class ComedyShow {
    String showName, leadComedian, venue, city, date, time, language, openingActName, sponsorName;
    int totalSeats, availableSeats, durationInMinutes, ageRestriction;
    double ticketPrice, venueRating, discountAvailable;
    boolean isSoldOut, hasOpeningAct, allowsFoodDrinks, requiresIdProof;

    public ComedyShow() {
        this("Laugh Riot", "Zakir Khan", "Chowdiah Hall", "Bengaluru", "2024-05-20", "19:00", "Hindi/English", "Local Talent", "BookMyShow", 1000, 250, 120, 16, 999.0, 4.5, 10.0, false, true, true, true);
    }

    public ComedyShow(String showName, String leadComedian, String venue, String city, String date, String time, String language, String openingActName, String sponsorName, int totalSeats, int availableSeats, int durationInMinutes, int ageRestriction, double ticketPrice, double venueRating, double discountAvailable, boolean isSoldOut, boolean hasOpeningAct, boolean allowsFoodDrinks, boolean requiresIdProof) {
        this.showName = showName; this.leadComedian = leadComedian; this.venue = venue; this.city = city; this.date = date; this.time = time; this.language = language; this.openingActName = openingActName; this.sponsorName = sponsorName; this.totalSeats = totalSeats; this.availableSeats = availableSeats; this.durationInMinutes = durationInMinutes; this.ageRestriction = ageRestriction; this.ticketPrice = ticketPrice; this.venueRating = venueRating; this.discountAvailable = discountAvailable; this.isSoldOut = isSoldOut; this.hasOpeningAct = hasOpeningAct; this.allowsFoodDrinks = allowsFoodDrinks; this.requiresIdProof = requiresIdProof;
    }
}