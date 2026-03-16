class TourismRunner {
    public static void main(String[] args) {
        
        Tourism t1 = new Tourism();
        t1.agencyName = "MakeMyTrip"; t1.contactNumber = "1800-111-222";
        Package p1 = new Package();
        p1.packageId = "PKG-01"; p1.destination = "Goa"; p1.durationDays = 4; p1.priceRs = 15000.0; p1.isFlightIncluded = true; p1.hotelStarRating = 4; p1.maxPersons = 2; p1.guideName = "Ramesh"; p1.transportType = "Private Cab"; p1.mealPlan = "Breakfast Only";
        t1.tourPackage = p1; t1.getTourismDetails();

        Tourism t2 = new Tourism();
        t2.agencyName = "Thomas Cook"; t2.contactNumber = "1800-333-444";
        Package p2 = new Package();
        p2.packageId = "PKG-02"; p2.destination = "Kerala Backwaters"; p2.durationDays = 6; p2.priceRs = 25000.0; p2.isFlightIncluded = false; p2.hotelStarRating = 5; p2.maxPersons = 4; p2.guideName = "Suresh"; p2.transportType = "Houseboat"; p2.mealPlan = "All Meals";
        t2.tourPackage = p2; t2.getTourismDetails();

        Tourism t3 = new Tourism();
        t3.agencyName = "Yatra"; t3.contactNumber = "1800-555-666";
        Package p3 = new Package();
        p3.packageId = "PKG-03"; p3.destination = "Manali"; p3.durationDays = 5; p3.priceRs = 18000.0; p3.isFlightIncluded = true; p3.hotelStarRating = 3; p3.maxPersons = 2; p3.guideName = "Amit"; p3.transportType = "Volvo Bus"; p3.mealPlan = "Breakfast & Dinner";
        t3.tourPackage = p3; t3.getTourismDetails();

        Tourism t4 = new Tourism();
        t4.agencyName = "SOTC"; t4.contactNumber = "1800-777-888";
        Package p4 = new Package();
        p4.packageId = "PKG-04"; p4.destination = "Dubai"; p4.durationDays = 7; p4.priceRs = 65000.0; p4.isFlightIncluded = true; p4.hotelStarRating = 5; p4.maxPersons = 2; p4.guideName = "Ahmed"; p4.transportType = "Luxury Coach"; p4.mealPlan = "Breakfast Only";
        t4.tourPackage = p4; t4.getTourismDetails();

        Tourism t5 = new Tourism();
        t5.agencyName = "MakeMyTrip"; t5.contactNumber = "1800-111-222";
        Package p5 = new Package();
        p5.packageId = "PKG-05"; p5.destination = "Andaman Islands"; p5.durationDays = 6; p5.priceRs = 45000.0; p5.isFlightIncluded = true; p5.hotelStarRating = 4; p5.maxPersons = 2; p5.guideName = "Karthik"; p5.transportType = "Ferry & Cab"; p5.mealPlan = "Breakfast & Dinner";
        t5.tourPackage = p5; t5.getTourismDetails();

        Tourism t6 = new Tourism();
        t6.agencyName = "ClearTrip"; t6.contactNumber = "1800-999-000";
        Package p6 = new Package();
        p6.packageId = "PKG-06"; p6.destination = "Coorg"; p6.durationDays = 3; p6.priceRs = 12000.0; p6.isFlightIncluded = false; p6.hotelStarRating = 3; p6.maxPersons = 4; p6.guideName = "Gowda"; p6.transportType = "Self Drive"; p6.mealPlan = "All Meals";
        t6.tourPackage = p6; t6.getTourismDetails();

        Tourism t7 = new Tourism();
        t7.agencyName = "KSTDC"; t7.contactNumber = "080-4334-4334";
        Package p7 = new Package();
        p7.packageId = "PKG-07"; p7.destination = "Mysuru Dasara"; p7.durationDays = 2; p7.priceRs = 5000.0; p7.isFlightIncluded = false; p7.hotelStarRating = 3; p7.maxPersons = 1; p7.guideName = "Naveen"; p7.transportType = "AC Bus"; p7.mealPlan = "None";
        t7.tourPackage = p7; t7.getTourismDetails();

        Tourism t8 = new Tourism();
        t8.agencyName = "Thomas Cook"; t8.contactNumber = "1800-333-444";
        Package p8 = new Package();
        p8.packageId = "PKG-08"; p8.destination = "Singapore"; p8.durationDays = 5; p8.priceRs = 55000.0; p8.isFlightIncluded = true; p8.hotelStarRating = 4; p8.maxPersons = 2; p8.guideName = "Lee"; p8.transportType = "MRT Pass"; p8.mealPlan = "Breakfast Only";
        t8.tourPackage = p8; t8.getTourismDetails();

        Tourism t9 = new Tourism();
        t9.agencyName = "Yatra"; t9.contactNumber = "1800-555-666";
        Package p9 = new Package();
        p9.packageId = "PKG-09"; p9.destination = "Jaipur"; p9.durationDays = 4; p9.priceRs = 16000.0; p9.isFlightIncluded = true; p9.hotelStarRating = 4; p9.maxPersons = 2; p9.guideName = "Rajput"; p9.transportType = "Private Cab"; p9.mealPlan = "Breakfast & Dinner";
        t9.tourPackage = p9; t9.getTourismDetails();

        Tourism t10 = new Tourism();
        t10.agencyName = "MakeMyTrip"; t10.contactNumber = "1800-111-222";
        Package p10 = new Package();
        p10.packageId = "PKG-10"; p10.destination = "Maldives"; p10.durationDays = 4; p10.priceRs = 85000.0; p10.isFlightIncluded = true; p10.hotelStarRating = 5; p10.maxPersons = 2; p10.guideName = "Self Guided"; p10.transportType = "Speedboat"; p10.mealPlan = "All Meals";
        t10.tourPackage = p10; t10.getTourismDetails();

        Tourism t11 = new Tourism();
        t11.agencyName = "Cox & Kings"; t11.contactNumber = "1800-222-333";
        Package p11 = new Package();
        p11.packageId = "PKG-11"; p11.destination = "Europe Delights"; p11.durationDays = 12; p11.priceRs = 150000.0; p11.isFlightIncluded = true; p11.hotelStarRating = 4; p11.maxPersons = 1; p11.guideName = "Marco"; p11.transportType = "Eurail"; p11.mealPlan = "Breakfast Only";
        t11.tourPackage = p11; t11.getTourismDetails();

        Tourism t12 = new Tourism();
        t12.agencyName = "SOTC"; t12.contactNumber = "1800-777-888";
        Package p12 = new Package();
        p12.packageId = "PKG-12"; p12.destination = "Bali"; p12.durationDays = 6; p12.priceRs = 42000.0; p12.isFlightIncluded = true; p12.hotelStarRating = 4; p12.maxPersons = 2; p12.guideName = "Wayan"; p12.transportType = "Private Cab"; p12.mealPlan = "Breakfast & Dinner";
        t12.tourPackage = p12; t12.getTourismDetails();

        Tourism t13 = new Tourism();
        t13.agencyName = "ClearTrip"; t13.contactNumber = "1800-999-000";
        Package p13 = new Package();
        p13.packageId = "PKG-13"; p13.destination = "Ooty"; p13.durationDays = 3; p13.priceRs = 9000.0; p13.isFlightIncluded = false; p13.hotelStarRating = 3; p13.maxPersons = 2; p13.guideName = "Ravi"; p13.transportType = "Bus"; p13.mealPlan = "Breakfast Only";
        t13.tourPackage = p13; t13.getTourismDetails();

        Tourism t14 = new Tourism();
        t14.agencyName = "KSTDC"; t14.contactNumber = "080-4334-4334";
        Package p14 = new Package();
        p14.packageId = "PKG-14"; p14.destination = "Hampi Heritage"; p14.durationDays = 2; p14.priceRs = 6500.0; p14.isFlightIncluded = false; p14.hotelStarRating = 3; p14.maxPersons = 1; p14.guideName = "Manjunath"; p14.transportType = "AC Bus"; p14.mealPlan = "Lunch Included";
        t14.tourPackage = p14; t14.getTourismDetails();

        Tourism t15 = new Tourism();
        t15.agencyName = "MakeMyTrip"; t15.contactNumber = "1800-111-222";
        Package p15 = new Package();
        p15.packageId = "PKG-15"; p15.destination = "Kashmir Paradise"; p15.durationDays = 6; p15.priceRs = 35000.0; p15.isFlightIncluded = true; p15.hotelStarRating = 4; p15.maxPersons = 2; p15.guideName = "Tariq"; p15.transportType = "Shikara & Cab"; p15.mealPlan = "Breakfast & Dinner";
        t15.tourPackage = p15; t15.getTourismDetails();

        Tourism t16 = new Tourism();
        t16.agencyName = "Thomas Cook"; t16.contactNumber = "1800-333-444";
        Package p16 = new Package();
        p16.packageId = "PKG-16"; p16.destination = "Thailand"; p16.durationDays = 5; p16.priceRs = 28000.0; p16.isFlightIncluded = true; p16.hotelStarRating = 3; p16.maxPersons = 2; p16.guideName = "Somchai"; p16.transportType = "Coach"; p16.mealPlan = "Breakfast Only";
        t16.tourPackage = p16; t16.getTourismDetails();

        Tourism t17 = new Tourism();
        t17.agencyName = "Yatra"; t17.contactNumber = "1800-555-666";
        Package p17 = new Package();
        p17.packageId = "PKG-17"; p17.destination = "Meghalaya"; p17.durationDays = 5; p17.priceRs = 22000.0; p17.isFlightIncluded = true; p17.hotelStarRating = 3; p17.maxPersons = 4; p17.guideName = "John"; p17.transportType = "Private SUV"; p17.mealPlan = "Breakfast Only";
        t17.tourPackage = p17; t17.getTourismDetails();

        Tourism t18 = new Tourism();
        t18.agencyName = "SOTC"; t18.contactNumber = "1800-777-888";
        Package p18 = new Package();
        p18.packageId = "PKG-18"; p18.destination = "Switzerland"; p18.durationDays = 7; p18.priceRs = 180000.0; p18.isFlightIncluded = true; p18.hotelStarRating = 5; p18.maxPersons = 2; p18.guideName = "Hans"; p18.transportType = "Swiss Pass"; p18.mealPlan = "Breakfast & Dinner";
        t18.tourPackage = p18; t18.getTourismDetails();

        Tourism t19 = new Tourism();
        t19.agencyName = "MakeMyTrip"; t19.contactNumber = "1800-111-222";
        Package p19 = new Package();
        p19.packageId = "PKG-19"; p19.destination = "Darjeeling"; p19.durationDays = 4; p19.priceRs = 17500.0; p19.isFlightIncluded = true; p19.hotelStarRating = 4; p19.maxPersons = 2; p19.guideName = "Bimal"; p19.transportType = "Toy Train & Cab"; p19.mealPlan = "Breakfast Only";
        t19.tourPackage = p19; t19.getTourismDetails();

        Tourism t20 = new Tourism();
        t20.agencyName = "ClearTrip"; t20.contactNumber = "1800-999-000";
        Package p20 = new Package();
        p20.packageId = "PKG-20"; p20.destination = "Pondicherry"; p20.durationDays = 3; p20.priceRs = 8500.0; p20.isFlightIncluded = false; p20.hotelStarRating = 3; p20.maxPersons = 2; p20.guideName = "Self Guided"; p20.transportType = "Rental Scooty"; p20.mealPlan = "None";
        t20.tourPackage = p20; t20.getTourismDetails();
    }
}