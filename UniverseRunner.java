class UniverseRunner {
    public static void main(String[] args) {
        
        Universe u1 = new Universe();
        u1.universeName = "Marvel Prime Universe"; u1.creatorEntity = "The One Above All";
        Earth e1 = new Earth();
        e1.earthDesignation = "Earth-616"; e1.dominantSpecies = "Humans/Mutants"; e1.populationBillion = 8.0; e1.isHabitable = true; e1.techLevel = 8; e1.magicExists = true; e1.majorThreat = "Thanos"; e1.protectorName = "Avengers"; e1.atmosphereType = "Oxygen-Nitrogen"; e1.waterPercentage = 71.0;
        u1.earth = e1; u1.getUniverseDetails();

        Universe u2 = new Universe();
        u2.universeName = "Marvel Ultimate Universe"; u2.creatorEntity = "The One Above All";
        Earth e2 = new Earth();
        e2.earthDesignation = "Earth-1610"; e2.dominantSpecies = "Humans"; e2.populationBillion = 7.5; e2.isHabitable = true; e2.techLevel = 8; e2.magicExists = true; e2.majorThreat = "Maker"; e2.protectorName = "Ultimates"; e2.atmosphereType = "Oxygen-Nitrogen"; e2.waterPercentage = 70.5;
        u2.earth = e2; u2.getUniverseDetails();

        Universe u3 = new Universe();
        u3.universeName = "DC Prime Earth"; u3.creatorEntity = "The Presence";
        Earth e3 = new Earth();
        e3.earthDesignation = "Earth-0"; e3.dominantSpecies = "Humans/Metahumans"; e3.populationBillion = 8.1; e3.isHabitable = true; e3.techLevel = 9; e3.magicExists = true; e3.majorThreat = "Darkseid"; e3.protectorName = "Justice League"; e3.atmosphereType = "Oxygen-Nitrogen"; e3.waterPercentage = 71.0;
        u3.earth = e3; u3.getUniverseDetails();

        Universe u4 = new Universe();
        u4.universeName = "DC Multiverse"; u4.creatorEntity = "The Presence";
        Earth e4 = new Earth();
        e4.earthDesignation = "Earth-2"; e4.dominantSpecies = "Humans"; e4.populationBillion = 6.5; e4.isHabitable = true; e4.techLevel = 7; e4.magicExists = true; e4.majorThreat = "Steppenwolf"; e4.protectorName = "Justice Society"; e4.atmosphereType = "Oxygen-Nitrogen"; e4.waterPercentage = 72.0;
        u4.earth = e4; u4.getUniverseDetails();

        Universe u5 = new Universe();
        u5.universeName = "DC Multiverse"; u5.creatorEntity = "The Presence";
        Earth e5 = new Earth();
        e5.earthDesignation = "Earth-3"; e5.dominantSpecies = "Corrupt Humans"; e5.populationBillion = 7.0; e5.isHabitable = true; e5.techLevel = 8; e5.magicExists = true; e5.majorThreat = "Crime Syndicate"; e5.protectorName = "Lex Luthor (Hero)"; e5.atmosphereType = "Oxygen-Nitrogen"; e5.waterPercentage = 71.5;
        u5.earth = e5; u5.getUniverseDetails();

        Universe u6 = new Universe();
        u6.universeName = "Star Trek Universe"; u6.creatorEntity = "Unknown";
        Earth e6 = new Earth();
        e6.earthDesignation = "Sector 001 Earth"; e6.dominantSpecies = "Humans"; e6.populationBillion = 9.0; e6.isHabitable = true; e6.techLevel = 10; e6.magicExists = false; e6.majorThreat = "Borg"; e6.protectorName = "Starfleet"; e6.atmosphereType = "Oxygen-Nitrogen"; e6.waterPercentage = 71.0;
        u6.earth = e6; u6.getUniverseDetails();

        Universe u7 = new Universe();
        u7.universeName = "Mirror Universe"; u7.creatorEntity = "Unknown";
        Earth e7 = new Earth();
        e7.earthDesignation = "Terran Empire Earth"; e7.dominantSpecies = "Terrans"; e7.populationBillion = 8.5; e7.isHabitable = true; e7.techLevel = 10; e7.magicExists = false; e7.majorThreat = "Rebellions"; e7.protectorName = "Terran Emperor"; e7.atmosphereType = "Oxygen-Nitrogen"; e7.waterPercentage = 71.0;
        u7.earth = e7; u7.getUniverseDetails();

        Universe u8 = new Universe();
        u8.universeName = "Real World Universe"; u8.creatorEntity = "Nature/God";
        Earth e8 = new Earth();
        e8.earthDesignation = "Earth Prime"; e8.dominantSpecies = "Humans"; e8.populationBillion = 8.1; e8.isHabitable = true; e8.techLevel = 5; e8.magicExists = false; e8.majorThreat = "Climate Change"; e8.protectorName = "Humanity"; e8.atmosphereType = "Oxygen-Nitrogen"; e8.waterPercentage = 71.0;
        u8.earth = e8; u8.getUniverseDetails();

        Universe u9 = new Universe();
        u9.universeName = "Cyberpunk Universe"; u9.creatorEntity = "Mike Pondsmith";
        Earth e9 = new Earth();
        e9.earthDesignation = "Earth-2077"; e9.dominantSpecies = "Cyborgs/Humans"; e9.populationBillion = 10.0; e9.isHabitable = true; e9.techLevel = 7; e9.magicExists = false; e9.majorThreat = "Megacorporations"; e9.protectorName = "Mercenaries"; e9.atmosphereType = "Polluted Oxygen"; e9.waterPercentage = 68.0;
        u9.earth = e9; u9.getUniverseDetails();

        Universe u10 = new Universe();
        u10.universeName = "Fallout Universe"; u10.creatorEntity = "Bethesda";
        Earth e10 = new Earth();
        e10.earthDesignation = "Wasteland Earth"; e10.dominantSpecies = "Mutants/Ghouls"; e10.populationBillion = 0.5; e10.isHabitable = false; e10.techLevel = 6; e10.magicExists = false; e10.majorThreat = "Radiation"; e10.protectorName = "Vault Dwellers"; e10.atmosphereType = "Irradiated"; e10.waterPercentage = 50.0;
        u10.earth = e10; u10.getUniverseDetails();

        Universe u11 = new Universe();
        u11.universeName = "Dune Universe"; u11.creatorEntity = "Frank Herbert";
        Earth e11 = new Earth();
        e11.earthDesignation = "Old Earth"; e11.dominantSpecies = "None"; e11.populationBillion = 0.0; e11.isHabitable = false; e11.techLevel = 0; e11.magicExists = false; e11.majorThreat = "Nuclear Fallout"; e11.protectorName = "None"; e11.atmosphereType = "Toxic"; e11.waterPercentage = 0.0;
        u11.earth = e11; u11.getUniverseDetails();

        Universe u12 = new Universe();
        u12.universeName = "Matrix Universe"; u12.creatorEntity = "The Architect";
        Earth e12 = new Earth();
        e12.earthDesignation = "Scorched Earth"; e12.dominantSpecies = "Machines"; e12.populationBillion = 0.01; e12.isHabitable = false; e12.techLevel = 9; e12.magicExists = false; e12.majorThreat = "Sentinels"; e12.protectorName = "Neo"; e12.atmosphereType = "Thick Black Clouds"; e12.waterPercentage = 60.0;
        u12.earth = e12; u12.getUniverseDetails();

        Universe u13 = new Universe();
        u13.universeName = "Middle-Earth Universe"; u13.creatorEntity = "Eru Iluvatar";
        Earth e13 = new Earth();
        e13.earthDesignation = "Arda"; e13.dominantSpecies = "Elves/Men"; e13.populationBillion = 0.1; e13.isHabitable = true; e13.techLevel = 2; e13.magicExists = true; e13.majorThreat = "Sauron"; e13.protectorName = "Gandalf"; e13.atmosphereType = "Pristine Oxygen"; e13.waterPercentage = 75.0;
        u13.earth = e13; u13.getUniverseDetails();

        Universe u14 = new Universe();
        u14.universeName = "Dragon Ball Universe"; u14.creatorEntity = "Zeno";
        Earth e14 = new Earth();
        e14.earthDesignation = "Universe 7 Earth"; e14.dominantSpecies = "Humans/Saiyans"; e14.populationBillion = 7.0; e14.isHabitable = true; e14.techLevel = 8; e14.magicExists = true; e14.majorThreat = "Frieza"; e14.protectorName = "Goku"; e14.atmosphereType = "Oxygen-Nitrogen"; e14.waterPercentage = 71.0;
        u14.earth = e14; u14.getUniverseDetails();

        Universe u15 = new Universe();
        u15.universeName = "Invincible Universe"; u15.creatorEntity = "Robert Kirkman";
        Earth e15 = new Earth();
        e15.earthDesignation = "Earth-Invincible"; e15.dominantSpecies = "Humans"; e15.populationBillion = 8.0; e15.isHabitable = true; e15.techLevel = 6; e15.magicExists = false; e15.majorThreat = "Viltrumites"; e15.protectorName = "Invincible"; e15.atmosphereType = "Oxygen-Nitrogen"; e15.waterPercentage = 71.0;
        u15.earth = e15; u15.getUniverseDetails();

        Universe u16 = new Universe();
        u16.universeName = "Doctor Who Universe"; u16.creatorEntity = "Time Lords (Debatable)";
        Earth e16 = new Earth();
        e16.earthDesignation = "Sol 3"; e16.dominantSpecies = "Humans"; e16.populationBillion = 8.0; e16.isHabitable = true; e16.techLevel = 5; e16.magicExists = false; e16.majorThreat = "Daleks"; e16.protectorName = "The Doctor"; e16.atmosphereType = "Oxygen-Nitrogen"; e16.waterPercentage = 71.0;
        u16.earth = e16; u16.getUniverseDetails();

        Universe u17 = new Universe();
        u17.universeName = "Planet of the Apes Universe"; u17.creatorEntity = "Fox";
        Earth e17 = new Earth();
        e17.earthDesignation = "Ape Earth"; e17.dominantSpecies = "Intelligent Apes"; e17.populationBillion = 0.05; e17.isHabitable = true; e17.techLevel = 3; e17.magicExists = false; e17.majorThreat = "Simian Flu"; e17.protectorName = "Caesar"; e17.atmosphereType = "Oxygen-Nitrogen"; e17.waterPercentage = 71.0;
        u17.earth = e17; u17.getUniverseDetails();

        Universe u18 = new Universe();
        u18.universeName = "Mad Max Universe"; u18.creatorEntity = "George Miller";
        Earth e18 = new Earth();
        e18.earthDesignation = "Wasteland"; e18.dominantSpecies = "Humans"; e18.populationBillion = 0.02; e18.isHabitable = false; e18.techLevel = 4; e18.magicExists = false; e18.majorThreat = "Warlords / Drought"; e18.protectorName = "Max Rockatansky"; e18.atmosphereType = "Dusty Oxygen"; e18.waterPercentage = 5.0;
        u18.earth = e18; u18.getUniverseDetails();

        Universe u19 = new Universe();
        u19.universeName = "Rick and Morty Universe"; u19.creatorEntity = "Dan Harmon";
        Earth e19 = new Earth();
        e19.earthDesignation = "Dimension C-137"; e19.dominantSpecies = "Humans (Cronenbergs)"; e19.populationBillion = 7.0; e19.isHabitable = false; e19.techLevel = 5; e19.magicExists = false; e19.majorThreat = "Rick Sanchez"; e19.protectorName = "None"; e19.atmosphereType = "Toxic"; e19.waterPercentage = 71.0;
        u19.earth = e19; u19.getUniverseDetails();

        Universe u20 = new Universe();
        u20.universeName = "Avatar Universe"; u20.creatorEntity = "James Cameron";
        Earth e20 = new Earth();
        e20.earthDesignation = "Dying Earth"; e20.dominantSpecies = "Humans"; e20.populationBillion = 20.0; e20.isHabitable = false; e20.techLevel = 9; e20.magicExists = false; e20.majorThreat = "Resource Depletion"; e20.protectorName = "RDA Corporation"; e20.atmosphereType = "Polluted"; e20.waterPercentage = 65.0;
        u20.earth = e20; u20.getUniverseDetails();
    }
}