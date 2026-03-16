class Cassino {
    String gameName;
    int tableNumber;
    String gameType;
    double minimumBet;
    double maximumBet;
    String dealerName;
    boolean isVIP;
    int maxPlayers;
    int currentPlayers;
    boolean isOpen;

    public void getCassinoDetails() {
        System.out.println("------------------------");
        System.out.println("The Cassino Table Details are:");
        System.out.println("Game Name : " + gameName);
        System.out.println("Table Number : " + tableNumber);
        System.out.println("Game Type : " + gameType);
        System.out.println("Minimum Bet : " + minimumBet);
        System.out.println("Maximum Bet : " + maximumBet);
        System.out.println("Dealer Name : " + dealerName);
        System.out.println("Is VIP Table : " + isVIP);
        System.out.println("Max Players : " + maxPlayers);
        System.out.println("Current Players : " + currentPlayers);
        System.out.println("Is Open : " + isOpen);
    }
}