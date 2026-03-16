class Player {
    int jerseyNumber;
    String playerName;
    String role;
    String battingStyle;
    String bowlingStyle;
    double auctionPriceCr;
    int matchesPlayed;
    int totalRuns;
    int totalWickets;
    boolean isOverseas;

    public void getPlayerDetails() {
        System.out.println("------------------------");
        System.out.println("The Player Details are:");
        System.out.println("Jersey : " + jerseyNumber);
        System.out.println("Name : " + playerName);
        System.out.println("Role : " + role);
        System.out.println("Batting : " + battingStyle);
        System.out.println("Bowling : " + bowlingStyle);
        System.out.println("Price (Cr) : " + auctionPriceCr);
        System.out.println("Matches : " + matchesPlayed);
        System.out.println("Runs : " + totalRuns);
        System.out.println("Wickets : " + totalWickets);
        System.out.println("Overseas : " + isOverseas);
    }
}



