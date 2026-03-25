class RCb {
    String playerNames[] = new String[15];
    int index;

    public boolean addPlayerName(String playerName) {
        boolean isPlayerNameAdded = false;
        if (playerName != null && !playerName.isEmpty()) {
            playerNames[index] = playerName;
            index++;
            isPlayerNameAdded = true; 
        } else {
            System.out.println(playerName + "is invalid");
        }
        return isPlayerNameAdded;
    }

    public void getPlayerNames() {
        for(String playerName : playerNames) {
            System.out.println(playerName);
        }
    }
}