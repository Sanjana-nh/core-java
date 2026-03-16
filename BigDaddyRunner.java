class BigDaddyRunner {
    public static void main(String[] args) {
        
        BigDaddy bd1 = new BigDaddy();
        bd1.shipLocation = "Mandovi River, Goa";
        bd1.totalFloors = 5;
        
        Cassino c1 = new Cassino();
        c1.gameName = "Texas Hold'em Poker";
        c1.tableNumber = 101;
        c1.gameType = "Card Game";
        c1.minimumBet = 5000.0;
        c1.maximumBet = 50000.0;
        c1.dealerName = "Rajesh";
        c1.isVIP = true;
        c1.maxPlayers = 9;
        c1.currentPlayers = 6;
        c1.isOpen = true;
        
        bd1.cassino = c1;
        bd1.getBigDaddyDetails();

        BigDaddy bd2 = new BigDaddy();
        bd2.shipLocation = "Mandovi River, Goa";
        bd2.totalFloors = 5;
        
        Cassino c2 = new Cassino();
        c2.gameName = "Blackjack";
        c2.tableNumber = 102;
        c2.gameType = "Card Game";
        c2.minimumBet = 1000.0;
        c2.maximumBet = 10000.0;
        c2.dealerName = "Sonia";
        c2.isVIP = false;
        c2.maxPlayers = 7;
        c2.currentPlayers = 4;
        c2.isOpen = true;
        
        bd2.cassino = c2;
        bd2.getBigDaddyDetails();

        BigDaddy bd3 = new BigDaddy();
        bd3.shipLocation = "Mandovi River, Goa";
        bd3.totalFloors = 5;
        
        Cassino c3 = new Cassino();
        c3.gameName = "European Roulette";
        c3.tableNumber = 201;
        c3.gameType = "Table Game";
        c3.minimumBet = 500.0;
        c3.maximumBet = 25000.0;
        c3.dealerName = "Amit";
        c3.isVIP = false;
        c3.maxPlayers = 10;
        c3.currentPlayers = 8;
        c3.isOpen = true;
        
        bd3.cassino = c3;
        bd3.getBigDaddyDetails();

        BigDaddy bd4 = new BigDaddy();
        bd4.shipLocation = "Mandovi River, Goa";
        bd4.totalFloors = 5;
        
        Cassino c4 = new Cassino();
        c4.gameName = "Baccarat";
        c4.tableNumber = 305;
        c4.gameType = "Card Game";
        c4.minimumBet = 10000.0;
        c4.maximumBet = 100000.0;
        c4.dealerName = "Priya";
        c4.isVIP = true;
        c4.maxPlayers = 8;
        c4.currentPlayers = 5;
        c4.isOpen = true;
        
        bd4.cassino = c4;
        bd4.getBigDaddyDetails();

        BigDaddy bd5 = new BigDaddy();
        bd5.shipLocation = "Mandovi River, Goa";
        bd5.totalFloors = 5;
        
        Cassino c5 = new Cassino();
        c5.gameName = "Andar Bahar";
        c5.tableNumber = 110;
        c5.gameType = "Card Game";
        c5.minimumBet = 500.0;
        c5.maximumBet = 5000.0;
        c5.dealerName = "Vikram";
        c5.isVIP = false;
        c5.maxPlayers = 12;
        c5.currentPlayers = 10;
        c5.isOpen = true;
        
        bd5.cassino = c5;
        bd5.getBigDaddyDetails();

        BigDaddy bd6 = new BigDaddy();
        bd6.shipLocation = "Mandovi River, Goa";
        bd6.totalFloors = 5;
        
        Cassino c6 = new Cassino();
        c6.gameName = "Teen Patti";
        c6.tableNumber = 115;
        c6.gameType = "Card Game";
        c6.minimumBet = 1000.0;
        c6.maximumBet = 20000.0;
        c6.dealerName = "Neha";
        c6.isVIP = false;
        c6.maxPlayers = 6;
        c6.currentPlayers = 6;
        c6.isOpen = true;
        
        bd6.cassino = c6;
        bd6.getBigDaddyDetails();

        BigDaddy bd7 = new BigDaddy();
        bd7.shipLocation = "Mandovi River, Goa";
        bd7.totalFloors = 5;
        
        Cassino c7 = new Cassino();
        c7.gameName = "Craps";
        c7.tableNumber = 401;
        c7.gameType = "Dice Game";
        c7.minimumBet = 1000.0;
        c7.maximumBet = 15000.0;
        c7.dealerName = "Ravi";
        c7.isVIP = false;
        c7.maxPlayers = 16;
        c7.currentPlayers = 12;
        c7.isOpen = true;
        
        bd7.cassino = c7;
        bd7.getBigDaddyDetails();

        BigDaddy bd8 = new BigDaddy();
        bd8.shipLocation = "Mandovi River, Goa";
        bd8.totalFloors = 5;
        
        Cassino c8 = new Cassino();
        c8.gameName = "Sic Bo";
        c8.tableNumber = 405;
        c8.gameType = "Dice Game";
        c8.minimumBet = 500.0;
        c8.maximumBet = 10000.0;
        c8.dealerName = "Arjun";
        c8.isVIP = false;
        c8.maxPlayers = 10;
        c8.currentPlayers = 7;
        c8.isOpen = true;
        
        bd8.cassino = c8;
        bd8.getBigDaddyDetails();

        BigDaddy bd9 = new BigDaddy();
        bd9.shipLocation = "Mandovi River, Goa";
        bd9.totalFloors = 5;
        
        Cassino c9 = new Cassino();
        c9.gameName = "VIP High Roller Poker";
        c9.tableNumber = 501;
        c9.gameType = "Card Game";
        c9.minimumBet = 25000.0;
        c9.maximumBet = 500000.0;
        c9.dealerName = "Jessica";
        c9.isVIP = true;
        c9.maxPlayers = 8;
        c9.currentPlayers = 3;
        c9.isOpen = true;
        
        bd9.cassino = c9;
        bd9.getBigDaddyDetails();

        BigDaddy bd10 = new BigDaddy();
        bd10.shipLocation = "Mandovi River, Goa";
        bd10.totalFloors = 5;
        
        Cassino c10 = new Cassino();
        c10.gameName = "Slot Machine - Dragon Pearl";
        c10.tableNumber = 1001;
        c10.gameType = "Electronic";
        c10.minimumBet = 100.0;
        c10.maximumBet = 1000.0;
        c10.dealerName = "None";
        c10.isVIP = false;
        c10.maxPlayers = 1;
        c10.currentPlayers = 1;
        c10.isOpen = true;
        
        bd10.cassino = c10;
        bd10.getBigDaddyDetails();

        BigDaddy bd11 = new BigDaddy();
        bd11.shipLocation = "Mandovi River, Goa";
        bd11.totalFloors = 5;
        
        Cassino c11 = new Cassino();
        c11.gameName = "Omaha High-Low";
        c11.tableNumber = 105;
        c11.gameType = "Card Game";
        c11.minimumBet = 2000.0;
        c11.maximumBet = 30000.0;
        c11.dealerName = "Kunal";
        c11.isVIP = false;
        c11.maxPlayers = 9;
        c11.currentPlayers = 5;
        c11.isOpen = true;
        
        bd11.cassino = c11;
        bd11.getBigDaddyDetails();

        BigDaddy bd12 = new BigDaddy();
        bd12.shipLocation = "Mandovi River, Goa";
        bd12.totalFloors = 5;
        
        Cassino c12 = new Cassino();
        c12.gameName = "Mini Baccarat";
        c12.tableNumber = 310;
        c12.gameType = "Card Game";
        c12.minimumBet = 2000.0;
        c12.maximumBet = 25000.0;
        c12.dealerName = "Meera";
        c12.isVIP = false;
        c12.maxPlayers = 7;
        c12.currentPlayers = 7;
        c12.isOpen = true;
        
        bd12.cassino = c12;
        bd12.getBigDaddyDetails();

        BigDaddy bd13 = new BigDaddy();
        bd13.shipLocation = "Mandovi River, Goa";
        bd13.totalFloors = 5;
        
        Cassino c13 = new Cassino();
        c13.gameName = "Caribbean Stud Poker";
        c13.tableNumber = 118;
        c13.gameType = "Card Game";
        c13.minimumBet = 1500.0;
        c13.maximumBet = 15000.0;
        c13.dealerName = "Rahul";
        c13.isVIP = false;
        c13.maxPlayers = 7;
        c13.currentPlayers = 2;
        c13.isOpen = true;
        
        bd13.cassino = c13;
        bd13.getBigDaddyDetails();

        BigDaddy bd14 = new BigDaddy();
        bd14.shipLocation = "Mandovi River, Goa";
        bd14.totalFloors = 5;
        
        Cassino c14 = new Cassino();
        c14.gameName = "Pai Gow Poker";
        c14.tableNumber = 120;
        c14.gameType = "Card Game";
        c14.minimumBet = 3000.0;
        c14.maximumBet = 20000.0;
        c14.dealerName = "Sanjay";
        c14.isVIP = false;
        c14.maxPlayers = 6;
        c14.currentPlayers = 0;
        c14.isOpen = false;
        
        bd14.cassino = c14;
        bd14.getBigDaddyDetails();

        BigDaddy bd15 = new BigDaddy();
        bd15.shipLocation = "Mandovi River, Goa";
        bd15.totalFloors = 5;
        
        Cassino c15 = new Cassino();
        c15.gameName = "Three Card Poker";
        c15.tableNumber = 122;
        c15.gameType = "Card Game";
        c15.minimumBet = 500.0;
        c15.maximumBet = 5000.0;
        c15.dealerName = "Pooja";
        c15.isVIP = false;
        c15.maxPlayers = 7;
        c15.currentPlayers = 5;
        c15.isOpen = true;
        
        bd15.cassino = c15;
        bd15.getBigDaddyDetails();

        BigDaddy bd16 = new BigDaddy();
        bd16.shipLocation = "Mandovi River, Goa";
        bd16.totalFloors = 5;
        
        Cassino c16 = new Cassino();
        c16.gameName = "Casino War";
        c16.tableNumber = 125;
        c16.gameType = "Card Game";
        c16.minimumBet = 1000.0;
        c16.maximumBet = 10000.0;
        c16.dealerName = "Karan";
        c16.isVIP = false;
        c16.maxPlayers = 7;
        c16.currentPlayers = 3;
        c16.isOpen = true;
        
        bd16.cassino = c16;
        bd16.getBigDaddyDetails();

        BigDaddy bd17 = new BigDaddy();
        bd17.shipLocation = "Mandovi River, Goa";
        bd17.totalFloors = 5;
        
        Cassino c17 = new Cassino();
        c17.gameName = "Money Wheel";
        c17.tableNumber = 505;
        c17.gameType = "Table Game";
        c17.minimumBet = 100.0;
        c17.maximumBet = 5000.0;
        c17.dealerName = "Aditi";
        c17.isVIP = false;
        c17.maxPlayers = 20;
        c17.currentPlayers = 15;
        c17.isOpen = true;
        
        bd17.cassino = c17;
        bd17.getBigDaddyDetails();

        BigDaddy bd18 = new BigDaddy();
        bd18.shipLocation = "Mandovi River, Goa";
        bd18.totalFloors = 5;
        
        Cassino c18 = new Cassino();
        c18.gameName = "Video Poker Multi-Hand";
        c18.tableNumber = 1050;
        c18.gameType = "Electronic";
        c18.minimumBet = 50.0;
        c18.maximumBet = 500.0;
        c18.dealerName = "None";
        c18.isVIP = false;
        c18.maxPlayers = 1;
        c18.currentPlayers = 1;
        c18.isOpen = true;
        
        bd18.cassino = c18;
        bd18.getBigDaddyDetails();

        BigDaddy bd19 = new BigDaddy();
        bd19.shipLocation = "Mandovi River, Goa";
        bd19.totalFloors = 5;
        
        Cassino c19 = new Cassino();
        c19.gameName = "Punto Banco";
        c19.tableNumber = 320;
        c19.gameType = "Card Game";
        c19.minimumBet = 5000.0;
        c19.maximumBet = 50000.0;
        c19.dealerName = "Rohan";
        c19.isVIP = true;
        c19.maxPlayers = 14;
        c19.currentPlayers = 9;
        c19.isOpen = true;
        
        bd19.cassino = c19;
        bd19.getBigDaddyDetails();

        BigDaddy bd20 = new BigDaddy();
        bd20.shipLocation = "Mandovi River, Goa";
        bd20.totalFloors = 5;
        
        Cassino c20 = new Cassino();
        c20.gameName = "Indian Rummy";
        c20.tableNumber = 130;
        c20.gameType = "Card Game";
        c20.minimumBet = 1000.0;
        c20.maximumBet = 20000.0;
        c20.dealerName = "Geeta";
        c20.isVIP = false;
        c20.maxPlayers = 6;
        c20.currentPlayers = 4;
        c20.isOpen = true;
        
        bd20.cassino = c20;
        bd20.getBigDaddyDetails();
    }
}