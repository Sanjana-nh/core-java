class CricBuz {
    String teamNames[] = new String[8];
    int index;

    public boolean addTeamName(String teamName) {
        boolean isTeamNameAdded = false;
        if (teamName != null && !teamName.isEmpty()) {
            teamNames[index] = teamName;
            index++;
            isTeamNameAdded = true; 
        } else {
            System.out.println(teamName + "is invalid");
        }
        return isTeamNameAdded;
    }

    public void getTeamNames() {
        for(String teamName : teamNames) {
            System.out.println(teamName);
        }
    }
public String getTeamNamesByIndex (int index){
	String teamName = null ;
	if (index < teamNames .length){
		teamName  = teamNames [index];
		System.out.println("The teamName  at index " + index  +" is: " + teamName );
	}
	else {
		System.out.println("In valid value " + index);
	}
	return teamName ;
}

	public int getIndexByTeamNames(String teamName ){
	int index = 0;
    for (String cteamName  : teamNames ) {
        if (cteamName  == teamName  ) {
			System.out.println("The index of " + cteamName  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}

public boolean updateTeamNames(String existingTeamName , String updateTeamName){
	boolean isTeamNameUpdated = false;
	for(int index = 0 ; index< teamNames.length;index++){
		if (teamNames[index] == existingTeamName){
			teamNames[index] = updateTeamName ;
			isTeamNameUpdated = true;
			System.out.println("The updated name of " + existingTeamName + " is :" + updateTeamName);
		}
		
	}
	if (isTeamNameUpdated == false){
		System.out.println("Faild to Update the Data");
	}
	return isTeamNameUpdated;
}

public boolean deleteTeamNames(String teamName){
    boolean isTeamNameDeleted = false;

    for(int index = 0; index < teamNames.length; index++){
        if(teamNames[index] != null && teamNames[index].equals(teamName)){
            teamNames[index] = null;
            isTeamNameDeleted = true;
            System.out.println(teamName+ " is deleted");
            break;
        }
    }

    if(isTeamNameDeleted == false){
        System.out.println(teamName + " not found");
    }

    return isTeamNameDeleted;
}
}