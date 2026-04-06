class RCbRunner {
    public static void main(String[] args) {
        RCb team = new RCb();

        team.addPlayerName("Virat ");
        team.addPlayerName("Faf du Plessis");
        team.addPlayerName("Glenn Maxwell");
        team.addPlayerName("Mohammed Siraj");
        team.addPlayerName("Cameron Green");
        team.addPlayerName("Rajat Patidar");
        team.addPlayerName("Dinesh Karthik");
        team.addPlayerName("Will Jacks");
        team.addPlayerName("Lockie Ferguson");
        team.addPlayerName("Reece Topley");
        team.addPlayerName("Mahipal Lomror");
        team.addPlayerName("Karn Sharma");
        team.addPlayerName("Yash Dayal");
        team.addPlayerName("Vijaykumar Vyshak");
        team.addPlayerName("Alzarri Joseph");

        team.getPlayerNames();
		team.getPlayerNamesByIndex(20);
		team.getIndexByPlayerNames("Faf du Plessis");
		team.updatePlayerNames("Virat", "Virat Kohli");
team.getPlayerNames();
team.deletePlayerNames("Glenn Maxwell");
team.getPlayerNames();
    }
}