class Wonderla {
    String waterGames[] = new String[25];
    int index;

    public boolean addWaterGame(String waterGame) {
        boolean isWaterGameAdded = false;
        if (waterGame != null && !waterGame.isEmpty()) {
            waterGames[index] = waterGame;
            index++;
            isWaterGameAdded = true; 
        } else {
            System.out.println(waterGame + "is invalid");
        }
        return isWaterGameAdded;
    }

    public void getWaterGames() {
        for(String waterGame : waterGames) {
            System.out.println(waterGame);
        }
    }
	public String getWaterGamesByIndex (int index){
	String waterGame = null ;
	if (index < waterGames .length){
		waterGame  = waterGames [index];
		System.out.println("The waterGame  at index " + index  +" is: " + waterGame );
	}
	else {
		System.out.println("In valid value " + index);
	}
	return waterGame ;
}

	public int getIndexByWaterGames(String waterGame ){
	int index = 0;
    for (String cwaterGame  : waterGames ) {
        if (cwaterGame  == waterGame  ) {
			System.out.println("The index of " + cwaterGame  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}
public boolean updateWaterGames(String existingWaterGame , String updateWaterGame){
    boolean isWaterGameUpdated = false;
    for(int index = 0 ; index< waterGames.length;index++){
        if (waterGames[index] == existingWaterGame){
            waterGames[index] = updateWaterGame ;
            isWaterGameUpdated = true;
            System.out.println("The updated name of " + existingWaterGame + " is :" + updateWaterGame);
        }
    }
    if (isWaterGameUpdated == false){
        System.out.println("Faild to Update the Data");
    }
    return isWaterGameUpdated;
}

public boolean deleteWaterGames(String waterGame){
    boolean isWaterGameDeleted = false;

    for(int index = 0; index < waterGames.length; index++){
        if(waterGames[index] != null && waterGames[index].equals(waterGame)){
            waterGames[index] = null;
            isWaterGameDeleted = true;
            System.out.println(waterGame+ " is deleted");
            break;
        }
    }

    if(isWaterGameDeleted == false){
        System.out.println(waterGame + " not found");
    }

    return isWaterGameDeleted;
}
}