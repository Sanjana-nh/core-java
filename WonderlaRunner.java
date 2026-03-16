
class WonderlaRunner {
    public static void main(String[] args) {
        
        Wonderla w1 = new Wonderla();
        w1.parkLocation = "Bengaluru"; w1.ticketPrice = 1499.0;
        LazyPool p1 = new LazyPool();
        p1.poolId = "BLR-01"; p1.themeName = "Tropical River"; p1.capacityLiters = 50000.0; p1.depthMeters = 1.2; p1.temperatureCelsius = 28.0; p1.isHeated = false; p1.maxPersons = 200; p1.lifeguardName = "Ramesh"; p1.cleaningFrequencyHours = 12; p1.chlorineLevelPpm = 1.5;
        w1.lazyPool = p1; w1.getWonderlaDetails();

        Wonderla w2 = new Wonderla();
        w2.parkLocation = "Bengaluru"; w2.ticketPrice = 1499.0;
        LazyPool p2 = new LazyPool();
        p2.poolId = "BLR-02"; p2.themeName = "Jungle Safari"; p2.capacityLiters = 60000.0; p2.depthMeters = 1.0; p2.temperatureCelsius = 29.0; p2.isHeated = true; p2.maxPersons = 250; p2.lifeguardName = "Suresh"; p2.cleaningFrequencyHours = 8; p2.chlorineLevelPpm = 1.8;
        w2.lazyPool = p2; w2.getWonderlaDetails();

        Wonderla w3 = new Wonderla();
        w3.parkLocation = "Kochi"; w3.ticketPrice = 1299.0;
        LazyPool p3 = new LazyPool();
        p3.poolId = "KOC-01"; p3.themeName = "Backwater Float"; p3.capacityLiters = 45000.0; p3.depthMeters = 1.1; p3.temperatureCelsius = 30.0; p3.isHeated = false; p3.maxPersons = 180; p3.lifeguardName = "Ajith"; p3.cleaningFrequencyHours = 12; p3.chlorineLevelPpm = 1.6;
        w3.lazyPool = p3; w3.getWonderlaDetails();

        Wonderla w4 = new Wonderla();
        w4.parkLocation = "Kochi"; w4.ticketPrice = 1299.0;
        LazyPool p4 = new LazyPool();
        p4.poolId = "KOC-02"; p4.themeName = "Monsoon River"; p4.capacityLiters = 55000.0; p4.depthMeters = 1.3; p4.temperatureCelsius = 27.0; p4.isHeated = false; p4.maxPersons = 220; p4.lifeguardName = "Vishnu"; p4.cleaningFrequencyHours = 10; p4.chlorineLevelPpm = 1.7;
        w4.lazyPool = p4; w4.getWonderlaDetails();

        Wonderla w5 = new Wonderla();
        w5.parkLocation = "Hyderabad"; w5.ticketPrice = 1599.0;
        LazyPool p5 = new LazyPool();
        p5.poolId = "HYD-01"; p5.themeName = "Deccan Drift"; p5.capacityLiters = 70000.0; p5.depthMeters = 1.2; p5.temperatureCelsius = 26.0; p5.isHeated = true; p5.maxPersons = 300; p5.lifeguardName = "Kiran"; p5.cleaningFrequencyHours = 6; p5.chlorineLevelPpm = 2.0;
        w5.lazyPool = p5; w5.getWonderlaDetails();

        Wonderla w6 = new Wonderla();
        w6.parkLocation = "Hyderabad"; w6.ticketPrice = 1599.0;
        LazyPool p6 = new LazyPool();
        p6.poolId = "HYD-02"; p6.themeName = "Nizam's Creek"; p6.capacityLiters = 40000.0; p6.depthMeters = 1.0; p6.temperatureCelsius = 28.0; p6.isHeated = false; p6.maxPersons = 150; p6.lifeguardName = "Raju"; p6.cleaningFrequencyHours = 12; p6.chlorineLevelPpm = 1.4;
        w6.lazyPool = p6; w6.getWonderlaDetails();

        Wonderla w7 = new Wonderla();
        w7.parkLocation = "Bengaluru"; w7.ticketPrice = 1499.0;
        LazyPool p7 = new LazyPool();
        p7.poolId = "BLR-03"; p7.themeName = "Sunset Stream"; p7.capacityLiters = 52000.0; p7.depthMeters = 0.9; p7.temperatureCelsius = 31.0; p7.isHeated = true; p7.maxPersons = 210; p7.lifeguardName = "Manoj"; p7.cleaningFrequencyHours = 8; p7.chlorineLevelPpm = 1.5;
        w7.lazyPool = p7; w7.getWonderlaDetails();

        Wonderla w8 = new Wonderla();
        w8.parkLocation = "Kochi"; w8.ticketPrice = 1299.0;
        LazyPool p8 = new LazyPool();
        p8.poolId = "KOC-03"; p8.themeName = "Coconut Grove Stream"; p8.capacityLiters = 48000.0; p8.depthMeters = 1.2; p8.temperatureCelsius = 29.5; p8.isHeated = false; p8.maxPersons = 190; p8.lifeguardName = "Rahul"; p8.cleaningFrequencyHours = 12; p8.chlorineLevelPpm = 1.6;
        w8.lazyPool = p8; w8.getWonderlaDetails();

        Wonderla w9 = new Wonderla();
        w9.parkLocation = "Hyderabad"; w9.ticketPrice = 1599.0;
        LazyPool p9 = new LazyPool();
        p9.poolId = "HYD-03"; p9.themeName = "Pearl River"; p9.capacityLiters = 80000.0; p9.depthMeters = 1.4; p9.temperatureCelsius = 25.0; p9.isHeated = false; p9.maxPersons = 350; p9.lifeguardName = "Naveen"; p9.cleaningFrequencyHours = 6; p9.chlorineLevelPpm = 2.1;
        w9.lazyPool = p9; w9.getWonderlaDetails();

        Wonderla w10 = new Wonderla();
        w10.parkLocation = "Bhubaneswar"; w10.ticketPrice = 1199.0;
        LazyPool p10 = new LazyPool();
        p10.poolId = "BHU-01"; p10.themeName = "Kalinga Cove"; p10.capacityLiters = 42000.0; p10.depthMeters = 1.1; p10.temperatureCelsius = 28.0; p10.isHeated = false; p10.maxPersons = 160; p10.lifeguardName = "Bikash"; p10.cleaningFrequencyHours = 12; p10.chlorineLevelPpm = 1.3;
        w10.lazyPool = p10; w10.getWonderlaDetails();

        Wonderla w11 = new Wonderla();
        w11.parkLocation = "Bengaluru"; w11.ticketPrice = 1499.0;
        LazyPool p11 = new LazyPool();
        p11.poolId = "BLR-04"; p11.themeName = "Kids Lazy River"; p11.capacityLiters = 25000.0; p11.depthMeters = 0.6; p11.temperatureCelsius = 32.0; p11.isHeated = true; p11.maxPersons = 100; p11.lifeguardName = "Sanjay"; p11.cleaningFrequencyHours = 4; p11.chlorineLevelPpm = 1.2;
        w11.lazyPool = p11; w11.getWonderlaDetails();

        Wonderla w12 = new Wonderla();
        w12.parkLocation = "Kochi"; w12.ticketPrice = 1299.0;
        LazyPool p12 = new LazyPool();
        p12.poolId = "KOC-04"; p12.themeName = "Silent Waters"; p12.capacityLiters = 38000.0; p12.depthMeters = 1.2; p12.temperatureCelsius = 28.5; p12.isHeated = false; p12.maxPersons = 140; p12.lifeguardName = "Jitin"; p12.cleaningFrequencyHours = 10; p12.chlorineLevelPpm = 1.4;
        w12.lazyPool = p12; w12.getWonderlaDetails();

        Wonderla w13 = new Wonderla();
        w13.parkLocation = "Hyderabad"; w13.ticketPrice = 1599.0;
        LazyPool p13 = new LazyPool();
        p13.poolId = "HYD-04"; p13.themeName = "Rapid Float"; p13.capacityLiters = 65000.0; p13.depthMeters = 1.3; p13.temperatureCelsius = 27.5; p13.isHeated = false; p13.maxPersons = 280; p13.lifeguardName = "Vikas"; p13.cleaningFrequencyHours = 8; p13.chlorineLevelPpm = 1.9;
        w13.lazyPool = p13; w13.getWonderlaDetails();

        Wonderla w14 = new Wonderla();
        w14.parkLocation = "Bengaluru"; w14.ticketPrice = 1499.0;
        LazyPool p14 = new LazyPool();
        p14.poolId = "BLR-05"; p14.themeName = "Amazon Drift"; p14.capacityLiters = 55000.0; p14.depthMeters = 1.1; p14.temperatureCelsius = 27.0; p14.isHeated = false; p14.maxPersons = 210; p14.lifeguardName = "Anil"; p14.cleaningFrequencyHours = 12; p14.chlorineLevelPpm = 1.6;
        w14.lazyPool = p14; w14.getWonderlaDetails();

        Wonderla w15 = new Wonderla();
        w15.parkLocation = "Kochi"; w15.ticketPrice = 1299.0;
        LazyPool p15 = new LazyPool();
        p15.poolId = "KOC-05"; p15.themeName = "Marine Float"; p15.capacityLiters = 50000.0; p15.depthMeters = 1.2; p15.temperatureCelsius = 29.0; p15.isHeated = true; p15.maxPersons = 200; p15.lifeguardName = "Deepak"; p15.cleaningFrequencyHours = 10; p15.chlorineLevelPpm = 1.5;
        w15.lazyPool = p15; w15.getWonderlaDetails();

        Wonderla w16 = new Wonderla();
        w16.parkLocation = "Hyderabad"; w16.ticketPrice = 1599.0;
        LazyPool p16 = new LazyPool();
        p16.poolId = "HYD-05"; p16.themeName = "Golkonda Stream"; p16.capacityLiters = 45000.0; p16.depthMeters = 1.0; p16.temperatureCelsius = 28.5; p16.isHeated = false; p16.maxPersons = 180; p16.lifeguardName = "Ashok"; p16.cleaningFrequencyHours = 12; p16.chlorineLevelPpm = 1.7;
        w16.lazyPool = p16; w16.getWonderlaDetails();

        Wonderla w17 = new Wonderla();
        w17.parkLocation = "Bhubaneswar"; w17.ticketPrice = 1199.0;
        LazyPool p17 = new LazyPool();
        p17.poolId = "BHU-02"; p17.themeName = "Temple River"; p17.capacityLiters = 35000.0; p17.depthMeters = 0.9; p17.temperatureCelsius = 30.0; p17.isHeated = true; p17.maxPersons = 120; p17.lifeguardName = "Soumya"; p17.cleaningFrequencyHours = 8; p17.chlorineLevelPpm = 1.4;
        w17.lazyPool = p17; w17.getWonderlaDetails();

        Wonderla w18 = new Wonderla();
        w18.parkLocation = "Bengaluru"; w18.ticketPrice = 1499.0;
        LazyPool p18 = new LazyPool();
        p18.poolId = "BLR-06"; p18.themeName = "Cave Float"; p18.capacityLiters = 40000.0; p18.depthMeters = 1.3; p18.temperatureCelsius = 26.0; p18.isHeated = false; p18.maxPersons = 150; p18.lifeguardName = "Harish"; p18.cleaningFrequencyHours = 12; p18.chlorineLevelPpm = 1.5;
        w18.lazyPool = p18; w18.getWonderlaDetails();

        Wonderla w19 = new Wonderla();
        w19.parkLocation = "Kochi"; w19.ticketPrice = 1299.0;
        LazyPool p19 = new LazyPool();
        p19.poolId = "KOC-06"; p19.themeName = "Spice River"; p19.capacityLiters = 60000.0; p19.depthMeters = 1.2; p19.temperatureCelsius = 28.0; p19.isHeated = false; p19.maxPersons = 240; p19.lifeguardName = "Surya"; p19.cleaningFrequencyHours = 8; p19.chlorineLevelPpm = 1.8;
        w19.lazyPool = p19; w19.getWonderlaDetails();

        Wonderla w20 = new Wonderla();
        w20.parkLocation = "Hyderabad"; w20.ticketPrice = 1599.0;
        LazyPool p20 = new LazyPool();
        p20.poolId = "HYD-06"; p20.themeName = "Night Drift"; p20.capacityLiters = 50000.0; p20.depthMeters = 1.1; p20.temperatureCelsius = 31.0; p20.isHeated = true; p20.maxPersons = 200; p20.lifeguardName = "Karthik"; p20.cleaningFrequencyHours = 6; p20.chlorineLevelPpm = 1.6;
        w20.lazyPool = p20; w20.getWonderlaDetails();
    }
}