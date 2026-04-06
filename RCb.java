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
	public String getPlayerNamesByIndex (int index){
	String playerName = null ;
	if (index < playerNames .length){
		playerName  = playerNames [index];
		System.out.println("The playerName  at index " + index  +" is: " + playerName );
	}
	else {
		System.out.println("In valid value " + index);
	}
	return playerName ;
}

	public int getIndexByPlayerNames(String playerName ){
	int index = 0;
    for (String cplayerName  : playerNames ) {
        if (cplayerName  == playerName  ) {
			System.out.println("The index of " + cplayerName  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}
public boolean updatePlayerNames(String existingPlayerName , String updatePlayerName){
    boolean isPlayerNameUpdated = false;
    for(int index = 0 ; index< playerNames.length;index++){
        if (playerNames[index] == existingPlayerName){
            playerNames[index] = updatePlayerName ;
            isPlayerNameUpdated = true;
            System.out.println("The updated name of " + existingPlayerName + " is :" + updatePlayerName);
        }
    }
    if (isPlayerNameUpdated == false){
        System.out.println("Faild to Update the Data");
    }
    return isPlayerNameUpdated;
}

public boolean deletePlayerNames(String playerName){
    boolean isPlayerNameDeleted = false;

    for(int index = 0; index < playerNames.length; index++){
        if(playerNames[index] != null && playerNames[index].equals(playerName)){
            playerNames[index] = null;
            isPlayerNameDeleted = true;
            System.out.println(playerName+ " is deleted");
            break;
        }
    }

    if(isPlayerNameDeleted == false){
        System.out.println(playerName + " not found");
    }

    return isPlayerNameDeleted;
}
}