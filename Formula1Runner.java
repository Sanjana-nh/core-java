class Formula1Runner {
    public static void main(String[] args) {
        
        Formula1 f1 = new Formula1();
        f1.raceCategory = "Grand Prix";
        f1.seasonYear = 2024;
        
        Franchise fr1 = new Franchise();
        fr1.franchiseName = "Red Bull Racing";
        fr1.teamPrincipal = "Christian Horner";
        fr1.baseLocation = "Milton Keynes, UK";
        fr1.championshipsWon = 6;
        fr1.engineSupplier = "Honda RBPT";
        fr1.leadDriver = "Max Verstappen";
        fr1.yearEstablished = 2005;
        fr1.budgetCapMillions = 135.0;
        fr1.isActive = true;
        fr1.mainSponsor = "Oracle";
        
        f1.franchise = fr1;
        f1.getFormula1Details();

        Formula1 f2 = new Formula1();
        f2.raceCategory = "Grand Prix";
        f2.seasonYear = 2024;
        
        Franchise fr2 = new Franchise();
        fr2.franchiseName = "Mercedes-AMG Petronas";
        fr2.teamPrincipal = "Toto Wolff";
        fr2.baseLocation = "Brackley, UK";
        fr2.championshipsWon = 8;
        fr2.engineSupplier = "Mercedes";
        fr2.leadDriver = "Lewis Hamilton";
        fr2.yearEstablished = 2010;
        fr2.budgetCapMillions = 135.0;
        fr2.isActive = true;
        fr2.mainSponsor = "Petronas";
        
        f2.franchise = fr2;
        f2.getFormula1Details();

        Formula1 f3 = new Formula1();
        f3.raceCategory = "Grand Prix";
        f3.seasonYear = 2024;
        
        Franchise fr3 = new Franchise();
        fr3.franchiseName = "Scuderia Ferrari";
        fr3.teamPrincipal = "Fred Vasseur";
        fr3.baseLocation = "Maranello, Italy";
        fr3.championshipsWon = 16;
        fr3.engineSupplier = "Ferrari";
        fr3.leadDriver = "Charles Leclerc";
        fr3.yearEstablished = 1950;
        fr3.budgetCapMillions = 135.0;
        fr3.isActive = true;
        fr3.mainSponsor = "Shell";
        
        f3.franchise = fr3;
        f3.getFormula1Details();

        Formula1 f4 = new Formula1();
        f4.raceCategory = "Grand Prix";
        f4.seasonYear = 2024;
        
        Franchise fr4 = new Franchise();
        fr4.franchiseName = "McLaren F1 Team";
        fr4.teamPrincipal = "Andrea Stella";
        fr4.baseLocation = "Woking, UK";
        fr4.championshipsWon = 8;
        fr4.engineSupplier = "Mercedes";
        fr4.leadDriver = "Lando Norris";
        fr4.yearEstablished = 1966;
        fr4.budgetCapMillions = 135.0;
        fr4.isActive = true;
        fr4.mainSponsor = "OKX";
        
        f4.franchise = fr4;
        f4.getFormula1Details();

        Formula1 f5 = new Formula1();
        f5.raceCategory = "Grand Prix";
        f5.seasonYear = 2024;
        
        Franchise fr5 = new Franchise();
        fr5.franchiseName = "Aston Martin Aramco";
        fr5.teamPrincipal = "Mike Krack";
        fr5.baseLocation = "Silverstone, UK";
        fr5.championshipsWon = 0;
        fr5.engineSupplier = "Mercedes";
        fr5.leadDriver = "Fernando Alonso";
        fr5.yearEstablished = 2021;
        fr5.budgetCapMillions = 135.0;
        fr5.isActive = true;
        fr5.mainSponsor = "Aramco";
        
        f5.franchise = fr5;
        f5.getFormula1Details();

        // Instance 6
        Formula1 f6 = new Formula1();
        f6.raceCategory = "Grand Prix";
        f6.seasonYear = 2024;
        
        Franchise fr6 = new Franchise();
        fr6.franchiseName = "Alpine F1 Team";
        fr6.teamPrincipal = "Bruno Famin";
        fr6.baseLocation = "Enstone, UK";
        fr6.championshipsWon = 2;
        fr6.engineSupplier = "Renault";
        fr6.leadDriver = "Pierre Gasly";
        fr6.yearEstablished = 2021;
        fr6.budgetCapMillions = 135.0;
        fr6.isActive = true;
        fr6.mainSponsor = "BWT";
        
        f6.franchise = fr6;
        f6.getFormula1Details();

        // Instance 7
        Formula1 f7 = new Formula1();
        f7.raceCategory = "Grand Prix";
        f7.seasonYear = 2024;
        
        Franchise fr7 = new Franchise();
        fr7.franchiseName = "Williams Racing";
        fr7.teamPrincipal = "James Vowles";
        fr7.baseLocation = "Grove, UK";
        fr7.championshipsWon = 9;
        fr7.engineSupplier = "Mercedes";
        fr7.leadDriver = "Alexander Albon";
        fr7.yearEstablished = 1977;
        fr7.budgetCapMillions = 135.0;
        fr7.isActive = true;
        fr7.mainSponsor = "Komatsu";
        
        f7.franchise = fr7;
        f7.getFormula1Details();

        // Instance 8
        Formula1 f8 = new Formula1();
        f8.raceCategory = "Grand Prix";
        f8.seasonYear = 2024;
        
        Franchise fr8 = new Franchise();
        fr8.franchiseName = "Visa Cash App RB";
        fr8.teamPrincipal = "Laurent Mekies";
        fr8.baseLocation = "Faenza, Italy";
        fr8.championshipsWon = 0;
        fr8.engineSupplier = "Honda RBPT";
        fr8.leadDriver = "Yuki Tsunoda";
        fr8.yearEstablished = 2006;
        fr8.budgetCapMillions = 135.0;
        fr8.isActive = true;
        fr8.mainSponsor = "Visa";
        
        f8.franchise = fr8;
        f8.getFormula1Details();

        // Instance 9
        Formula1 f9 = new Formula1();
        f9.raceCategory = "Grand Prix";
        f9.seasonYear = 2024;
        
        Franchise fr9 = new Franchise();
        fr9.franchiseName = "Stake F1 Team Kick Sauber";
        fr9.teamPrincipal = "Alessandro Alunni Bravi";
        fr9.baseLocation = "Hinwil, Switzerland";
        fr9.championshipsWon = 0;
        fr9.engineSupplier = "Ferrari";
        fr9.leadDriver = "Valtteri Bottas";
        fr9.yearEstablished = 1993;
        fr9.budgetCapMillions = 135.0;
        fr9.isActive = true;
        fr9.mainSponsor = "Stake";
        
        f9.franchise = fr9;
        f9.getFormula1Details();

        // Instance 10
        Formula1 f10 = new Formula1();
        f10.raceCategory = "Grand Prix";
        f10.seasonYear = 2024;
        
        Franchise fr10 = new Franchise();
        fr10.franchiseName = "Haas F1 Team";
        fr10.teamPrincipal = "Ayao Komatsu";
        fr10.baseLocation = "Kannapolis, USA";
        fr10.championshipsWon = 0;
        fr10.engineSupplier = "Ferrari";
        fr10.leadDriver = "Nico Hulkenberg";
        fr10.yearEstablished = 2016;
        fr10.budgetCapMillions = 135.0;
        fr10.isActive = true;
        fr10.mainSponsor = "MoneyGram";
        
        f10.franchise = fr10;
        f10.getFormula1Details();

        // Instance 11
        Formula1 f11 = new Formula1();
        f11.raceCategory = "Classic Grand Prix";
        f11.seasonYear = 2009;
        
        Franchise fr11 = new Franchise();
        fr11.franchiseName = "Brawn GP";
        fr11.teamPrincipal = "Ross Brawn";
        fr11.baseLocation = "Brackley, UK";
        fr11.championshipsWon = 1;
        fr11.engineSupplier = "Mercedes";
        fr11.leadDriver = "Jenson Button";
        fr11.yearEstablished = 2009;
        fr11.budgetCapMillions = 120.0;
        fr11.isActive = false;
        fr11.mainSponsor = "Virgin";
        
        f11.franchise = fr11;
        f11.getFormula1Details();

        // Instance 12
        Formula1 f12 = new Formula1();
        f12.raceCategory = "Classic Grand Prix";
        f12.seasonYear = 2005;
        
        Franchise fr12 = new Franchise();
        fr12.franchiseName = "Renault F1 Team";
        fr12.teamPrincipal = "Flavio Briatore";
        fr12.baseLocation = "Enstone, UK";
        fr12.championshipsWon = 2;
        fr12.engineSupplier = "Renault";
        fr12.leadDriver = "Fernando Alonso";
        fr12.yearEstablished = 1977;
        fr12.budgetCapMillions = 150.0;
        fr12.isActive = false;
        fr12.mainSponsor = "Mild Seven";
        
        f12.franchise = fr12;
        f12.getFormula1Details();

        // Instance 13
        Formula1 f13 = new Formula1();
        f13.raceCategory = "Classic Grand Prix";
        f13.seasonYear = 1978;
        
        Franchise fr13 = new Franchise();
        fr13.franchiseName = "Team Lotus";
        fr13.teamPrincipal = "Colin Chapman";
        fr13.baseLocation = "Hethel, UK";
        fr13.championshipsWon = 7;
        fr13.engineSupplier = "Ford Cosworth";
        fr13.leadDriver = "Mario Andretti";
        fr13.yearEstablished = 1954;
        fr13.budgetCapMillions = 20.0;
        fr13.isActive = false;
        fr13.mainSponsor = "John Player Special";
        
        f13.franchise = fr13;
        f13.getFormula1Details();

        // Instance 14
        Formula1 f14 = new Formula1();
        f14.raceCategory = "Classic Grand Prix";
        f14.seasonYear = 2017;
        
        Franchise fr14 = new Franchise();
        fr14.franchiseName = "Force India";
        fr14.teamPrincipal = "Vijay Mallya";
        fr14.baseLocation = "Silverstone, UK";
        fr14.championshipsWon = 0;
        fr14.engineSupplier = "Mercedes";
        fr14.leadDriver = "Sergio Perez";
        fr14.yearEstablished = 2008;
        fr14.budgetCapMillions = 110.0;
        fr14.isActive = false;
        fr14.mainSponsor = "Sahara";
        
        f14.franchise = fr14;
        f14.getFormula1Details();

        // Instance 15
        Formula1 f15 = new Formula1();
        f15.raceCategory = "Classic Grand Prix";
        f15.seasonYear = 1995;
        
        Franchise fr15 = new Franchise();
        fr15.franchiseName = "Benetton Formula";
        fr15.teamPrincipal = "Flavio Briatore";
        fr15.baseLocation = "Enstone, UK";
        fr15.championshipsWon = 1;
        fr15.engineSupplier = "Renault";
        fr15.leadDriver = "Michael Schumacher";
        fr15.yearEstablished = 1986;
        fr15.budgetCapMillions = 80.0;
        fr15.isActive = false;
        fr15.mainSponsor = "Mild Seven";
        
        f15.franchise = fr15;
        f15.getFormula1Details();

        // Instance 16
        Formula1 f16 = new Formula1();
        f16.raceCategory = "Classic Grand Prix";
        f16.seasonYear = 1999;
        
        Franchise fr16 = new Franchise();
        fr16.franchiseName = "Jordan Grand Prix";
        fr16.teamPrincipal = "Eddie Jordan";
        fr16.baseLocation = "Silverstone, UK";
        fr16.championshipsWon = 0;
        fr16.engineSupplier = "Mugen-Honda";
        fr16.leadDriver = "Heinz-Harald Frentzen";
        fr16.yearEstablished = 1991;
        fr16.budgetCapMillions = 65.0;
        fr16.isActive = false;
        fr16.mainSponsor = "Benson & Hedges";
        
        f16.franchise = fr16;
        f16.getFormula1Details();

        // Instance 17
        Formula1 f17 = new Formula1();
        f17.raceCategory = "Classic Grand Prix";
        f17.seasonYear = 1971;
        
        Franchise fr17 = new Franchise();
        fr17.franchiseName = "Tyrrell Racing";
        fr17.teamPrincipal = "Ken Tyrrell";
        fr17.baseLocation = "Ockham, UK";
        fr17.championshipsWon = 1;
        fr17.engineSupplier = "Ford Cosworth";
        fr17.leadDriver = "Jackie Stewart";
        fr17.yearEstablished = 1958;
        fr17.budgetCapMillions = 5.0;
        fr17.isActive = false;
        fr17.mainSponsor = "Elf";
        
        f17.franchise = fr17;
        f17.getFormula1Details();

        // Instance 18
        Formula1 f18 = new Formula1();
        f18.raceCategory = "Classic Grand Prix";
        f18.seasonYear = 2005;
        
        Franchise fr18 = new Franchise();
        fr18.franchiseName = "Minardi";
        fr18.teamPrincipal = "Paul Stoddart";
        fr18.baseLocation = "Faenza, Italy";
        fr18.championshipsWon = 0;
        fr18.engineSupplier = "Cosworth";
        fr18.leadDriver = "Christijan Albers";
        fr18.yearEstablished = 1979;
        fr18.budgetCapMillions = 40.0;
        fr18.isActive = false;
        fr18.mainSponsor = "Ozjet";
        
        f18.franchise = fr18;
        f18.getFormula1Details();

        // Instance 19
        Formula1 f19 = new Formula1();
        f19.raceCategory = "Classic Grand Prix";
        f19.seasonYear = 1983;
        
        Franchise fr19 = new Franchise();
        fr19.franchiseName = "Brabham";
        fr19.teamPrincipal = "Bernie Ecclestone";
        fr19.baseLocation = "Milton Keynes, UK";
        fr19.championshipsWon = 2;
        fr19.engineSupplier = "BMW";
        fr19.leadDriver = "Nelson Piquet";
        fr19.yearEstablished = 1960;
        fr19.budgetCapMillions = 15.0;
        fr19.isActive = false;
        fr19.mainSponsor = "Parmalat";
        
        f19.franchise = fr19;
        f19.getFormula1Details();

        // Instance 20
        Formula1 f20 = new Formula1();
        f20.raceCategory = "Classic Grand Prix";
        f20.seasonYear = 2020;
        
        Franchise fr20 = new Franchise();
        fr20.franchiseName = "Racing Point";
        fr20.teamPrincipal = "Otmar Szafnauer";
        fr20.baseLocation = "Silverstone, UK";
        fr20.championshipsWon = 0;
        fr20.engineSupplier = "Mercedes";
        fr20.leadDriver = "Sergio Perez";
        fr20.yearEstablished = 2018;
        fr20.budgetCapMillions = 125.0;
        fr20.isActive = false;
        fr20.mainSponsor = "BWT";
        
        f20.franchise = fr20;
        f20.getFormula1Details();
    }
}