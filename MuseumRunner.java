class MuseumRunner {
    public static void main(String[] args) {
        
        Museum m1 = new Museum();
        m1.museumName = "Smithsonian Institution"; m1.cityLocation = "Washington D.C.";
        Diamond d1 = new Diamond();
        d1.diamondName = "Hope Diamond"; d1.caratWeight = 45.52; d1.colorGrade = "Fancy Dark Greyish-Blue"; d1.clarityGrade = "VS1"; d1.cutGrade = "Antique Cushion"; d1.originCountry = "India"; d1.estimatedValueUsd = 250000000.0; d1.isOnDisplay = true; d1.discoveryYear = 1666; d1.previousOwner = "Harry Winston";
        m1.diamond = d1; m1.getMuseumDetails();

        Museum m2 = new Museum();
        m2.museumName = "Tower of London"; m2.cityLocation = "London";
        Diamond d2 = new Diamond();
        d2.diamondName = "Koh-i-Noor"; d2.caratWeight = 105.6; d2.colorGrade = "D"; d2.clarityGrade = "Flawless"; d2.cutGrade = "Oval Cut"; d2.originCountry = "India"; d2.estimatedValueUsd = 500000000.0; d2.isOnDisplay = true; d2.discoveryYear = 1304; d2.previousOwner = "Maharaja Duleep Singh";
        m2.diamond = d2; m2.getMuseumDetails();

        Museum m3 = new Museum();
        m3.museumName = "Tower of London"; m3.cityLocation = "London";
        Diamond d3 = new Diamond();
        d3.diamondName = "Cullinan I"; d3.caratWeight = 530.2; d3.colorGrade = "D"; d3.clarityGrade = "Flawless"; d3.cutGrade = "Pear"; d3.originCountry = "South Africa"; d3.estimatedValueUsd = 400000000.0; d3.isOnDisplay = true; d3.discoveryYear = 1905; d3.previousOwner = "Thomas Cullinan";
        m3.diamond = d3; m3.getMuseumDetails();

        Museum m4 = new Museum();
        m4.museumName = "Louvre Museum"; m4.cityLocation = "Paris";
        Diamond d4 = new Diamond();
        d4.diamondName = "Regent Diamond"; d4.caratWeight = 140.64; d4.colorGrade = "D"; d4.clarityGrade = "Internally Flawless"; d4.cutGrade = "Cushion Cut"; d4.originCountry = "India"; d4.estimatedValueUsd = 60000000.0; d4.isOnDisplay = true; d4.discoveryYear = 1698; d4.previousOwner = "French Crown";
        m4.diamond = d4; m4.getMuseumDetails();

        Museum m5 = new Museum();
        m5.museumName = "Louvre Museum"; m5.cityLocation = "Paris";
        Diamond d5 = new Diamond();
        d5.diamondName = "Sancy Diamond"; d5.caratWeight = 55.23; d5.colorGrade = "Pale Yellow"; d5.clarityGrade = "VVS1"; d5.cutGrade = "Shield"; d5.originCountry = "India"; d5.estimatedValueUsd = 10000000.0; d5.isOnDisplay = true; d5.discoveryYear = 1570; d5.previousOwner = "William Waldorf Astor";
        m5.diamond = d5; m5.getMuseumDetails();

        Museum m6 = new Museum();
        m6.museumName = "Kremlin Armoury"; m6.cityLocation = "Moscow";
        Diamond d6 = new Diamond();
        d6.diamondName = "Orlov Diamond"; d6.caratWeight = 189.62; d6.colorGrade = "White with faint bluish-green"; d6.clarityGrade = "VS1"; d6.cutGrade = "Indian Rose Cut"; d6.originCountry = "India"; d6.estimatedValueUsd = 20000000.0; d6.isOnDisplay = true; d6.discoveryYear = 1750; d6.previousOwner = "Catherine the Great";
        m6.diamond = d6; m6.getMuseumDetails();

        Museum m7 = new Museum();
        m7.museumName = "Green Vault"; m7.cityLocation = "Dresden";
        Diamond d7 = new Diamond();
        d7.diamondName = "Dresden Green"; d7.caratWeight = 41.0; d7.colorGrade = "Fancy Green"; d7.clarityGrade = "VS1"; d7.cutGrade = "Pear"; d7.originCountry = "India"; d7.estimatedValueUsd = 15000000.0; d7.isOnDisplay = true; d7.discoveryYear = 1722; d7.previousOwner = "Augustus III of Poland";
        m7.diamond = d7; m7.getMuseumDetails();

        Museum m8 = new Museum();
        m8.museumName = "Natural History Museum"; m8.cityLocation = "London";
        Diamond d8 = new Diamond();
        d8.diamondName = "Aurora Pyramid of Hope"; d8.caratWeight = 267.45; d8.colorGrade = "Multi-color"; d8.clarityGrade = "Mixed"; d8.cutGrade = "Mixed Cuts"; d8.originCountry = "Various"; d8.estimatedValueUsd = 5000000.0; d8.isOnDisplay = false; d8.discoveryYear = 1980; d8.previousOwner = "Aurora Gems";
        m8.diamond = d8; m8.getMuseumDetails();

        Museum m9 = new Museum();
        m9.museumName = "Royal Ontario Museum"; m9.cityLocation = "Toronto";
        Diamond d9 = new Diamond();
        d9.diamondName = "Incomparable Diamond"; d9.caratWeight = 407.48; d9.colorGrade = "Fancy Brownish-Yellow"; d9.clarityGrade = "Internally Flawless"; d9.cutGrade = "Shield Step Cut"; d9.originCountry = "DR Congo"; d9.estimatedValueUsd = 20000000.0; d9.isOnDisplay = false; d9.discoveryYear = 1984; d9.previousOwner = "Zale Corporation";
        m9.diamond = d9; m9.getMuseumDetails();

        Museum m10 = new Museum();
        m10.museumName = "Diamond Museum"; m10.cityLocation = "Amsterdam";
        Diamond d10 = new Diamond();
        d10.diamondName = "Amsterdam Diamond"; d10.caratWeight = 33.74; d10.colorGrade = "Pure Black"; d10.clarityGrade = "Opaque"; d10.cutGrade = "Pear"; d10.originCountry = "South Africa"; d10.estimatedValueUsd = 1000000.0; d10.isOnDisplay = true; d10.discoveryYear = 1972; d10.previousOwner = "D. Drukker & Zn";
        m10.diamond = d10; m10.getMuseumDetails();

        Museum m11 = new Museum();
        m11.museumName = "Tower of London"; m11.cityLocation = "London";
        Diamond d11 = new Diamond();
        d11.diamondName = "Cullinan II"; d11.caratWeight = 317.4; d11.colorGrade = "D"; d11.clarityGrade = "Flawless"; d11.cutGrade = "Cushion Cut"; d11.originCountry = "South Africa"; d11.estimatedValueUsd = 200000000.0; d11.isOnDisplay = true; d11.discoveryYear = 1905; d11.previousOwner = "King Edward VII";
        m11.diamond = d11; m11.getMuseumDetails();

        Museum m12 = new Museum();
        m12.museumName = "National Museum of Natural History"; m12.cityLocation = "Paris";
        Diamond d12 = new Diamond();
        d12.diamondName = "Great Tavernier Blue"; d12.caratWeight = 112.18; d12.colorGrade = "Blue"; d12.clarityGrade = "VS1"; d12.cutGrade = "Rough"; d12.originCountry = "India"; d12.estimatedValueUsd = 0.0; d12.isOnDisplay = false; d12.discoveryYear = 1642; d12.previousOwner = "Jean-Baptiste Tavernier";
        m12.diamond = d12; m12.getMuseumDetails();

        Museum m13 = new Museum();
        m13.museumName = "De Beers Museum"; m13.cityLocation = "Kimberley";
        Diamond d13 = new Diamond();
        d13.diamondName = "Eureka Diamond"; d13.caratWeight = 21.25; d13.colorGrade = "Yellowish"; d13.clarityGrade = "VS2"; d13.cutGrade = "Cushion"; d13.originCountry = "South Africa"; d13.estimatedValueUsd = 2000000.0; d13.isOnDisplay = true; d13.discoveryYear = 1867; d13.previousOwner = "Erasmus Jacobs";
        m13.diamond = d13; m13.getMuseumDetails();

        Museum m14 = new Museum();
        m14.museumName = "GIA Museum"; m14.cityLocation = "Carlsbad";
        Diamond d14 = new Diamond();
        d14.diamondName = "Golden Jubilee"; d14.caratWeight = 545.67; d14.colorGrade = "Fancy Yellow-Brown"; d14.clarityGrade = "Flawless"; d14.cutGrade = "Fire Rose Cushion"; d14.originCountry = "South Africa"; d14.estimatedValueUsd = 12000000.0; d14.isOnDisplay = false; d14.discoveryYear = 1985; d14.previousOwner = "De Beers";
        m14.diamond = d14; m14.getMuseumDetails();

        Museum m15 = new Museum();
        m15.museumName = "Smithsonian Institution"; m15.cityLocation = "Washington D.C.";
        Diamond d15 = new Diamond();
        d15.diamondName = "De Young Red"; d15.caratWeight = 5.03; d15.colorGrade = "Fancy Dark Red"; d15.clarityGrade = "VS2"; d15.cutGrade = "Round Brilliant"; d15.originCountry = "Unknown"; d15.estimatedValueUsd = 5000000.0; d15.isOnDisplay = true; d15.discoveryYear = 1920; d15.previousOwner = "Sydney DeYoung";
        m15.diamond = d15; m15.getMuseumDetails();

        Museum m16 = new Museum();
        m16.museumName = "Louvre Museum"; m16.cityLocation = "Paris";
        Diamond d16 = new Diamond();
        d16.diamondName = "Hortensia Diamond"; d16.caratWeight = 20.53; d16.colorGrade = "Pale Orange-Pink"; d16.clarityGrade = "SI1"; d16.cutGrade = "Flat Oval"; d16.originCountry = "India"; d16.estimatedValueUsd = 3000000.0; d16.isOnDisplay = true; d16.discoveryYear = 1643; d16.previousOwner = "King Louis XIV";
        m16.diamond = d16; m16.getMuseumDetails();

        Museum m17 = new Museum();
        m17.museumName = "Topkapi Palace Museum"; m17.cityLocation = "Istanbul";
        Diamond d17 = new Diamond();
        d17.diamondName = "Spoonmaker's Diamond"; d17.caratWeight = 86.0; d17.colorGrade = "White"; d17.clarityGrade = "VS2"; d17.cutGrade = "Pear"; d17.originCountry = "Unknown"; d17.estimatedValueUsd = 10000000.0; d17.isOnDisplay = true; d17.discoveryYear = 1669; d17.previousOwner = "Ottoman Empire";
        m17.diamond = d17; m17.getMuseumDetails();

        Museum m18 = new Museum();
        m18.museumName = "Smithsonian Institution"; m18.cityLocation = "Washington D.C.";
        Diamond d18 = new Diamond();
        d18.diamondName = "Blue Heart Diamond"; d18.caratWeight = 30.62; d18.colorGrade = "Fancy Deep Blue"; d18.clarityGrade = "VS2"; d18.cutGrade = "Heart"; d18.originCountry = "South Africa"; d18.estimatedValueUsd = 18000000.0; d18.isOnDisplay = true; d18.discoveryYear = 1908; d18.previousOwner = "Marjorie Merriweather Post";
        m18.diamond = d18; m18.getMuseumDetails();

        Museum m19 = new Museum();
        m19.museumName = "Bavarian State Collection"; m19.cityLocation = "Munich";
        Diamond d19 = new Diamond();
        d19.diamondName = "Wittelsbach-Graff"; d19.caratWeight = 31.06; d19.colorGrade = "Fancy Deep Blue"; d19.clarityGrade = "Internally Flawless"; d19.cutGrade = "Antique Oval"; d19.originCountry = "India"; d19.estimatedValueUsd = 80000000.0; d19.isOnDisplay = false; d19.discoveryYear = 1664; d19.previousOwner = "Laurence Graff";
        m19.diamond = d19; m19.getMuseumDetails();

        Museum m20 = new Museum();
        m20.museumName = "Iranian National Jewels"; m20.cityLocation = "Tehran";
        Diamond d20 = new Diamond();
        d20.diamondName = "Darya-i-Noor"; d20.caratWeight = 182.0; d20.colorGrade = "Pale Pink"; d20.clarityGrade = "Flawless"; d20.cutGrade = "Table Cut"; d20.originCountry = "India"; d20.estimatedValueUsd = 100000000.0; d20.isOnDisplay = true; d20.discoveryYear = 1739; d20.previousOwner = "Nader Shah";
        m20.diamond = d20; m20.getMuseumDetails();
    }
}