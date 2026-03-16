class TrainRunner{
	public static void main(String[] args){
		Train train = new Train();
		train.trainName = "Jan-Shatabdi";
		train.trainNumber = 612571; 
		
		
		Bogie bogie = new Bogie();
        bogie.bogieNumber = "D1";
        bogie.bogieType = "Sleeper Class";
        bogie.capacity = 70 ;                
        bogie.color = "Blue";
        bogie.weightInTons = 40.0;                 
		bogie.manufacturer = "ICF Chennai";
        bogie.yearOfManufacture = 2000;     
        bogie.hasBioToilets = true;
        bogie.numberOfDoors = 4;
        bogie.isAC = false;
		
		train.bogie=bogie;
		train.getTrainDetails();
		
		
		Train train1 = new Train();
		train1.trainName = "Rajdhani";
		train1.trainNumber = 471276; 
		
		
		Bogie bogie1 = new Bogie();
        bogie1.bogieNumber = "A1";
        bogie1.bogieType = "Sleeper Class";
        bogie1.capacity = 60 ;                
        bogie1.color = "Blue";
        bogie1.weightInTons = 40.0;                 
		bogie1.manufacturer = "ICF Chennai";
        bogie1.yearOfManufacture = 2000;     
        bogie1.hasBioToilets = true;
        bogie1.numberOfDoors = 4;
        bogie1.isAC = false;
		
		train1.bogie=bogie1;
		train1.getTrainDetails();
		
		Train train2 = new Train();
        train2.trainName = "Mysuru Vande Bharat";
        train2.trainNumber = 20608; 
        
        Bogie bogie2 = new Bogie();
        bogie2.bogieNumber = "C1";
        bogie2.bogieType = "AC Chair Car";
        bogie2.capacity = 78;                
        bogie2.color = "White and Blue";
        bogie2.weightInTons = 39.5;                 
        bogie2.manufacturer = "ICF Chennai";
        bogie2.yearOfManufacture = 2023;     
        bogie2.hasBioToilets = true;
        bogie2.numberOfDoors = 4;
        bogie2.isAC = true;
        
        train2.bogie = bogie2;
        train2.getTrainDetails();

        Train train3 = new Train();
        train3.trainName = "SBC Double Decker";
        train3.trainNumber = 22625; 
        
        Bogie bogie3 = new Bogie();
        bogie3.bogieNumber = "C5";
        bogie3.bogieType = "AC Chair Car";
        bogie3.capacity = 120;                
        bogie3.color = "Yellow and Red";
        bogie3.weightInTons = 45.0;                 
        bogie3.manufacturer = "RCF Kapurthala";
        bogie3.yearOfManufacture = 2015;     
        bogie3.hasBioToilets = true;
        bogie3.numberOfDoors = 4;
        bogie3.isAC = true;
        
        train3.bogie = bogie3;
        train3.getTrainDetails();

        Train train4 = new Train();
        train4.trainName = "Duronto Express";
        train4.trainNumber = 12213; 
        
        Bogie bogie4 = new Bogie();
        bogie4.bogieNumber = "H1";
        bogie4.bogieType = "AC First Class";
        bogie4.capacity = 24;                
        bogie4.color = "Yellow and Green";
        bogie4.weightInTons = 42.1;                 
        bogie4.manufacturer = "MCF Raebareli";
        bogie4.yearOfManufacture = 2018;     
        bogie4.hasBioToilets = true;
        bogie4.numberOfDoors = 4;
        bogie4.isAC = true;
        
        train4.bogie = bogie4;
        train4.getTrainDetails();

        Train train5 = new Train();
        train5.trainName = "Garib Rath";
        train5.trainNumber = 12204; 
        
        Bogie bogie5 = new Bogie();
        bogie5.bogieNumber = "G4";
        bogie5.bogieType = "AC 3-Tier";
        bogie5.capacity = 78;                
        bogie5.color = "Green and Yellow";
        bogie5.weightInTons = 41.0;                 
        bogie5.manufacturer = "RCF Kapurthala";
        bogie5.yearOfManufacture = 2012;     
        bogie5.hasBioToilets = true;
        bogie5.numberOfDoors = 4;
        bogie5.isAC = true;
        
        train5.bogie = bogie5;
        train5.getTrainDetails();

        Train train6 = new Train();
        train6.trainName = "Tejas Express";
        train6.trainNumber = 82902; 
        
        Bogie bogie6 = new Bogie();
        bogie6.bogieNumber = "E1";
        bogie6.bogieType = "Executive Chair Car";
        bogie6.capacity = 56;                
        bogie6.color = "Yellow and Orange";
        bogie6.weightInTons = 40.5;                 
        bogie6.manufacturer = "ICF Chennai";
        bogie6.yearOfManufacture = 2019;     
        bogie6.hasBioToilets = true;
        bogie6.numberOfDoors = 4;
        bogie6.isAC = true;
        
        train6.bogie = bogie6;
        train6.getTrainDetails();

        Train train7 = new Train();
        train7.trainName = "Humsafar Express";
        train7.trainNumber = 22317; 
        
        Bogie bogie7 = new Bogie();
        bogie7.bogieNumber = "B5";
        bogie7.bogieType = "AC 3-Tier";
        bogie7.capacity = 72;                
        bogie7.color = "Blue and Orange";
        bogie7.weightInTons = 41.8;                 
        bogie7.manufacturer = "MCF Raebareli";
        bogie7.yearOfManufacture = 2020;     
        bogie7.hasBioToilets = true;
        bogie7.numberOfDoors = 4;
        bogie7.isAC = true;
        
        train7.bogie = bogie7;
        train7.getTrainDetails();

        Train train8 = new Train();
        train8.trainName = "Sampark Kranti";
        train8.trainNumber = 12649; 
        
        Bogie bogie8 = new Bogie();
        bogie8.bogieNumber = "S4";
        bogie8.bogieType = "Sleeper Class";
        bogie8.capacity = 72;                
        bogie8.color = "Red";
        bogie8.weightInTons = 38.5;                 
        bogie8.manufacturer = "ICF Chennai";
        bogie8.yearOfManufacture = 2016;     
        bogie8.hasBioToilets = true;
        bogie8.numberOfDoors = 4;
        bogie8.isAC = false;
        
        train8.bogie = bogie8;
        train8.getTrainDetails();

        Train train9 = new Train();
        train9.trainName = "Gatimaan Express";
        train9.trainNumber = 12049; 
        
        Bogie bogie9 = new Bogie();
        bogie9.bogieNumber = "C2";
        bogie9.bogieType = "AC Chair Car";
        bogie9.capacity = 78;                
        bogie9.color = "Blue and Grey";
        bogie9.weightInTons = 39.0;                 
        bogie9.manufacturer = "RCF Kapurthala";
        bogie9.yearOfManufacture = 2016;     
        bogie9.hasBioToilets = true;
        bogie9.numberOfDoors = 4;
        bogie9.isAC = true;
        
        train9.bogie = bogie9;
        train9.getTrainDetails();

        Train train10 = new Train();
        train10.trainName = "Coromandel Express";
        train10.trainNumber = 12841; 
        
        Bogie bogie10 = new Bogie();
        bogie10.bogieNumber = "B2";
        bogie10.bogieType = "AC 3-Tier";
        bogie10.capacity = 72;                
        bogie10.color = "LHB Red";
        bogie10.weightInTons = 41.2;                 
        bogie10.manufacturer = "MCF Raebareli";
        bogie10.yearOfManufacture = 2018;     
        bogie10.hasBioToilets = true;
        bogie10.numberOfDoors = 4;
        bogie10.isAC = true;
        
        train10.bogie = bogie10;
        train10.getTrainDetails();

        Train train11 = new Train();
        train11.trainName = "Vivek Express";
        train11.trainNumber = 15905; 
        
        Bogie bogie11 = new Bogie();
        bogie11.bogieNumber = "S10";
        bogie11.bogieType = "Sleeper Class";
        bogie11.capacity = 72;                
        bogie11.color = "Utkrisht Yellow";
        bogie11.weightInTons = 38.9;                 
        bogie11.manufacturer = "ICF Chennai";
        bogie11.yearOfManufacture = 2014;     
        bogie11.hasBioToilets = false;
        bogie11.numberOfDoors = 4;
        bogie11.isAC = false;
        
        train11.bogie = bogie11;
        train11.getTrainDetails();

        Train train12 = new Train();
        train12.trainName = "Kalka Mail";
        train12.trainNumber = 12311; 
        
        Bogie bogie12 = new Bogie();
        bogie12.bogieNumber = "A2";
        bogie12.bogieType = "AC 2-Tier";
        bogie12.capacity = 52;                
        bogie12.color = "LHB Red";
        bogie12.weightInTons = 42.0;                 
        bogie12.manufacturer = "RCF Kapurthala";
        bogie12.yearOfManufacture = 2017;     
        bogie12.hasBioToilets = true;
        bogie12.numberOfDoors = 4;
        bogie12.isAC = true;
        
        train12.bogie = bogie12;
        train12.getTrainDetails();

        Train train13 = new Train();
        train13.trainName = "Antyodaya Express";
        train13.trainNumber = 22877; 
        
        Bogie bogie13 = new Bogie();
        bogie13.bogieNumber = "UR3";
        bogie13.bogieType = "Unreserved General";
        bogie13.capacity = 100;                
        bogie13.color = "Red and Yellow";
        bogie13.weightInTons = 37.5;                 
        bogie13.manufacturer = "ICF Chennai";
        bogie13.yearOfManufacture = 2018;     
        bogie13.hasBioToilets = true;
        bogie13.numberOfDoors = 4;
        bogie13.isAC = false;
        
        train13.bogie = bogie13;
        train13.getTrainDetails();

        Train train14 = new Train();
        train14.trainName = "Goa Express";
        train14.trainNumber = 12779; 
        
        Bogie bogie14 = new Bogie();
        bogie14.bogieNumber = "PC";
        bogie14.bogieType = "Pantry Car";
        bogie14.capacity = 15;                
        bogie14.color = "Red";
        bogie14.weightInTons = 43.0;                 
        bogie14.manufacturer = "MCF Raebareli";
        bogie14.yearOfManufacture = 2015;     
        bogie14.hasBioToilets = true;
        bogie14.numberOfDoors = 2;
        bogie14.isAC = false;
        
        train14.bogie = bogie14;
        train14.getTrainDetails();

        Train train15 = new Train();
        train15.trainName = "Navjivan Express";
        train15.trainNumber = 12656; 
        
        Bogie bogie15 = new Bogie();
        bogie15.bogieNumber = "S2";
        bogie15.bogieType = "Sleeper Class";
        bogie15.capacity = 72;                
        bogie15.color = "Utkrisht Yellow";
        bogie15.weightInTons = 39.1;                 
        bogie15.manufacturer = "ICF Chennai";
        bogie15.yearOfManufacture = 2011;     
        bogie15.hasBioToilets = false;
        bogie15.numberOfDoors = 4;
        bogie15.isAC = false;
        
        train15.bogie = bogie15;
        train15.getTrainDetails();

        Train train16 = new Train();
        train16.trainName = "Kerala Express";
        train16.trainNumber = 12626; 
        
        Bogie bogie16 = new Bogie();
        bogie16.bogieNumber = "B3";
        bogie16.bogieType = "AC 3-Tier";
        bogie16.capacity = 72;                
        bogie16.color = "LHB Red";
        bogie16.weightInTons = 41.5;                 
        bogie16.manufacturer = "RCF Kapurthala";
        bogie16.yearOfManufacture = 2019;     
        bogie16.hasBioToilets = true;
        bogie16.numberOfDoors = 4;
        bogie16.isAC = true;
        
        train16.bogie = bogie16;
        train16.getTrainDetails();

        Train train17 = new Train();
        train17.trainName = "Metro Express";
        train17.trainNumber = 33001; 
        
        Bogie bogie17 = new Bogie();
        bogie17.bogieNumber = "M1";
        bogie17.bogieType = "Metro Coach";
        bogie17.capacity = 300;                
        bogie17.color = "Silver";
        bogie17.weightInTons = 42.0;                 
        bogie17.manufacturer = "BEML Bengaluru";
        bogie17.yearOfManufacture = 2021;     
        bogie17.hasBioToilets = false;
        bogie17.numberOfDoors = 8;
        bogie17.isAC = true;
        
        train17.bogie = bogie17;
        train17.getTrainDetails();

        Train train18 = new Train();
        train18.trainName = "Uday Express";
        train18.trainNumber = 22666; 
        
        Bogie bogie18 = new Bogie();
        bogie18.bogieNumber = "C3";
        bogie18.bogieType = "Double Decker AC Chair";
        bogie18.capacity = 120;                
        bogie18.color = "Orange and Yellow";
        bogie18.weightInTons = 44.5;                 
        bogie18.manufacturer = "RCF Kapurthala";
        bogie18.yearOfManufacture = 2017;     
        bogie18.hasBioToilets = true;
        bogie18.numberOfDoors = 4;
        bogie18.isAC = true;
        
        train18.bogie = bogie18;
        train18.getTrainDetails();

        Train train19 = new Train();
        train19.trainName = "Saurashtra Mail";
        train19.trainNumber = 22945; 
        
        Bogie bogie19 = new Bogie();
        bogie19.bogieNumber = "S7";
        bogie19.bogieType = "Sleeper Class";
        bogie19.capacity = 72;                
        bogie19.color = "Red";
        bogie19.weightInTons = 38.2;                 
        bogie19.manufacturer = "ICF Chennai";
        bogie19.yearOfManufacture = 2013;     
        bogie19.hasBioToilets = false;
        bogie19.numberOfDoors = 4;
        bogie19.isAC = false;
        
        train19.bogie = bogie19;
        train19.getTrainDetails();
	}
}