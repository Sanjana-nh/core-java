class SalonRunner {
    public static void main(String[] args) {
        
        Salon s1 = new Salon();
        s1.salonName = "Lakme Salon"; s1.location = "Indiranagar";
        Service sv1 = new Service();
        sv1.serviceId = "SRV-01"; sv1.serviceName = "Advanced Haircut"; sv1.category = "Hair Care"; sv1.durationMins = 45; sv1.priceRs = 800.0; sv1.isUnisex = false; sv1.beauticianName = "Neha"; sv1.productsUsed = "TIGI, L'Oreal"; sv1.isDiscountApplicable = true; sv1.rating = 4.8;
        s1.service = sv1; s1.getSalonDetails();

        Salon s2 = new Salon();
        s2.salonName = "Toni & Guy"; s2.location = "Koramangala";
        Service sv2 = new Service();
        sv2.serviceId = "SRV-02"; sv2.serviceName = "Keratin Treatment"; sv2.category = "Hair Treatment"; sv2.durationMins = 120; sv2.priceRs = 5000.0; sv2.isUnisex = true; sv2.beauticianName = "Rahul"; sv2.productsUsed = "Global Keratin"; sv2.isDiscountApplicable = false; sv2.rating = 4.9;
        s2.service = sv2; s2.getSalonDetails();

        Salon s3 = new Salon();
        s3.salonName = "Naturals"; s3.location = "Jayanagar";
        Service sv3 = new Service();
        sv3.serviceId = "SRV-03"; sv3.serviceName = "Bridal Makeup"; sv3.category = "Makeup"; sv3.durationMins = 180; sv3.priceRs = 12000.0; sv3.isUnisex = false; sv3.beauticianName = "Priya"; sv3.productsUsed = "MAC, Huda Beauty"; sv3.isDiscountApplicable = false; sv3.rating = 4.7;
        s3.service = sv3; s3.getSalonDetails();

        Salon s4 = new Salon();
        s4.salonName = "Green Trends"; s4.location = "Malleswaram";
        Service sv4 = new Service();
        sv4.serviceId = "SRV-04"; sv4.serviceName = "Fruit Facial"; sv4.category = "Skin Care"; sv4.durationMins = 60; sv4.priceRs = 1500.0; sv4.isUnisex = true; sv4.beauticianName = "Anjali"; sv4.productsUsed = "Biotique"; sv4.isDiscountApplicable = true; sv4.rating = 4.5;
        s4.service = sv4; s4.getSalonDetails();

        Salon s5 = new Salon();
        s5.salonName = "Jawed Habib"; s5.location = "BTM Layout";
        Service sv5 = new Service();
        sv5.serviceId = "SRV-05"; sv5.serviceName = "Men's Hair Styling"; sv5.category = "Hair Care"; sv5.durationMins = 30; sv5.priceRs = 400.0; sv5.isUnisex = false; sv5.beauticianName = "Vikram"; sv5.productsUsed = "Habib's Gel"; sv5.isDiscountApplicable = false; sv5.rating = 4.4;
        s5.service = sv5; s5.getSalonDetails();

        Salon s6 = new Salon();
        s6.salonName = "YLG Salon"; s6.location = "HSR Layout";
        Service sv6 = new Service();
        sv6.serviceId = "SRV-06"; sv6.serviceName = "Waxing - Full Arms & Legs"; sv6.category = "Body Care"; sv6.durationMins = 45; sv6.priceRs = 900.0; sv6.isUnisex = false; sv6.beauticianName = "Kavitha"; sv6.productsUsed = "Rica Wax"; sv6.isDiscountApplicable = true; sv6.rating = 4.6;
        s6.service = sv6; s6.getSalonDetails();

        Salon s7 = new Salon();
        s7.salonName = "Bodycraft"; s7.location = "Whitefield";
        Service sv7 = new Service();
        sv7.serviceId = "SRV-07"; sv7.serviceName = "Swedish Massage"; sv7.category = "Spa"; sv7.durationMins = 60; sv7.priceRs = 2500.0; sv7.isUnisex = true; sv7.beauticianName = "Anita"; sv7.productsUsed = "Essential Oils"; sv7.isDiscountApplicable = false; sv7.rating = 4.8;
        s7.service = sv7; s7.getSalonDetails();

        Salon s8 = new Salon();
        s8.salonName = "Enrich Salon"; s8.location = "JP Nagar";
        Service sv8 = new Service();
        sv8.serviceId = "SRV-08"; sv8.serviceName = "Hair Spa"; sv8.category = "Hair Care"; sv8.durationMins = 60; sv8.priceRs = 1200.0; sv8.isUnisex = true; sv8.beauticianName = "Suresh"; sv8.productsUsed = "Wella Professionals"; sv8.isDiscountApplicable = true; sv8.rating = 4.7;
        s8.service = sv8; s8.getSalonDetails();

        Salon s9 = new Salon();
        s9.salonName = "Lakme Salon"; s9.location = "Electronic City";
        Service sv9 = new Service();
        sv9.serviceId = "SRV-09"; sv9.serviceName = "Pedicure"; sv9.category = "Nail Care"; sv9.durationMins = 45; sv9.priceRs = 700.0; sv9.isUnisex = true; sv9.beauticianName = "Meera"; sv9.productsUsed = "Lakme Foot Scrub"; sv9.isDiscountApplicable = true; sv9.rating = 4.5;
        s9.service = sv9; s9.getSalonDetails();

        Salon s10 = new Salon();
        s10.salonName = "Toni & Guy"; s10.location = "Phoenix Marketcity";
        Service sv10 = new Service();
        sv10.serviceId = "SRV-10"; sv10.serviceName = "Global Hair Color"; sv10.category = "Hair Treatment"; sv10.durationMins = 90; sv10.priceRs = 3500.0; sv10.isUnisex = true; sv10.beauticianName = "John"; sv10.productsUsed = "Schwarzkopf"; sv10.isDiscountApplicable = false; sv10.rating = 4.8;
        s10.service = sv10; s10.getSalonDetails();

        Salon s11 = new Salon();
        s11.salonName = "Naturals"; s11.location = "Banashankari";
        Service sv11 = new Service();
        sv11.serviceId = "SRV-11"; sv11.serviceName = "De-Tan Pack"; sv11.category = "Skin Care"; sv11.durationMins = 30; sv11.priceRs = 500.0; sv11.isUnisex = true; sv11.beauticianName = "Lakshmi"; sv11.productsUsed = "O3+"; sv11.isDiscountApplicable = true; sv11.rating = 4.3;
        s11.service = sv11; s11.getSalonDetails();

        Salon s12 = new Salon();
        s12.salonName = "Bodycraft"; s12.location = "Frazer Town";
        Service sv12 = new Service();
        sv12.serviceId = "SRV-12"; sv12.serviceName = "Manicure"; sv12.category = "Nail Care"; sv12.durationMins = 40; sv12.priceRs = 600.0; sv12.isUnisex = true; sv12.beauticianName = "Sonia"; sv12.productsUsed = "OPI"; sv12.isDiscountApplicable = true; sv12.rating = 4.6;
        s12.service = sv12; s12.getSalonDetails();

        Salon s13 = new Salon();
        s13.salonName = "Green Trends"; s13.location = "RR Nagar";
        Service sv13 = new Service();
        sv13.serviceId = "SRV-13"; sv13.serviceName = "Thread Eyebrows"; sv13.category = "Facial Grooming"; sv13.durationMins = 15; sv13.priceRs = 100.0; sv13.isUnisex = false; sv13.beauticianName = "Geetha"; sv13.productsUsed = "Cotton Thread"; sv13.isDiscountApplicable = false; sv13.rating = 4.5;
        s13.service = sv13; s13.getSalonDetails();

        Salon s14 = new Salon();
        s14.salonName = "Jawed Habib"; s14.location = "Yelahanka";
        Service sv14 = new Service();
        sv14.serviceId = "SRV-14"; sv14.serviceName = "Beard Trim & Styling"; sv14.category = "Men's Grooming"; sv14.durationMins = 20; sv14.priceRs = 250.0; sv14.isUnisex = false; sv14.beauticianName = "Arif"; sv14.productsUsed = "Habib's Beard Oil"; sv14.isDiscountApplicable = true; sv14.rating = 4.4;
        s14.service = sv14; s14.getSalonDetails();

        Salon s15 = new Salon();
        s15.salonName = "YLG Salon"; s15.location = "Kalyan Nagar";
        Service sv15 = new Service();
        sv15.serviceId = "SRV-15"; sv15.serviceName = "Anti-Aging Facial"; sv15.category = "Skin Care"; sv15.durationMins = 75; sv15.priceRs = 2200.0; sv15.isUnisex = false; sv15.beauticianName = "Deepa"; sv15.productsUsed = "Dermalogica"; sv15.isDiscountApplicable = false; sv15.rating = 4.7;
        s15.service = sv15; s15.getSalonDetails();

        Salon s16 = new Salon();
        s16.salonName = "Enrich Salon"; s16.location = "Bellandur";
        Service sv16 = new Service();
        sv16.serviceId = "SRV-16"; sv16.serviceName = "Hair Smoothening"; sv16.category = "Hair Treatment"; sv16.durationMins = 150; sv16.priceRs = 6000.0; sv16.isUnisex = true; sv16.beauticianName = "Ravi"; sv16.productsUsed = "Matrix"; sv16.isDiscountApplicable = true; sv16.rating = 4.8;
        s16.service = sv16; s16.getSalonDetails();

        Salon s17 = new Salon();
        s17.salonName = "Lakme Salon"; s17.location = "Sahakar Nagar";
        Service sv17 = new Service();
        sv17.serviceId = "SRV-17"; sv17.serviceName = "Party Makeup"; sv17.category = "Makeup"; sv17.durationMins = 60; sv17.priceRs = 2500.0; sv17.isUnisex = false; sv17.beauticianName = "Tara"; sv17.productsUsed = "Lakme Absolute"; sv17.isDiscountApplicable = false; sv17.rating = 4.6;
        s17.service = sv17; s17.getSalonDetails();

        Salon s18 = new Salon();
        s18.salonName = "Naturals"; s18.location = "Basavanagudi";
        Service sv18 = new Service();
        sv18.serviceId = "SRV-18"; sv18.serviceName = "Head Massage"; sv18.category = "Spa"; sv18.durationMins = 30; sv18.priceRs = 400.0; sv18.isUnisex = true; sv18.beauticianName = "Kishore"; sv18.productsUsed = "Ayurvedic Oil"; sv18.isDiscountApplicable = true; sv18.rating = 4.5;
        s18.service = sv18; s18.getSalonDetails();

        Salon s19 = new Salon();
        s19.salonName = "Toni & Guy"; s19.location = "MG Road";
        Service sv19 = new Service();
        sv19.serviceId = "SRV-19"; sv19.serviceName = "Balayage Highlights"; sv19.category = "Hair Treatment"; sv19.durationMins = 120; sv19.priceRs = 4500.0; sv19.isUnisex = true; sv19.beauticianName = "Sarah"; sv19.productsUsed = "L'Oreal Professionnel"; sv19.isDiscountApplicable = false; sv19.rating = 4.9;
        s19.service = sv19; s19.getSalonDetails();

        Salon s20 = new Salon();
        s20.salonName = "Bodycraft"; s20.location = "Sadashivanagar";
        Service sv20 = new Service();
        sv20.serviceId = "SRV-20"; sv20.serviceName = "Aromatherapy Massage"; sv20.category = "Spa"; sv20.durationMins = 90; sv20.priceRs = 3500.0; sv20.isUnisex = true; sv20.beauticianName = "Divya"; sv20.productsUsed = "Lavender & Chamomile Oil"; sv20.isDiscountApplicable = false; sv20.rating = 4.8;
        s20.service = sv20; s20.getSalonDetails();
    }
}