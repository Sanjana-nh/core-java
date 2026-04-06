class Goa {
    String beachNames[] = new String[19];
    int index;

    public boolean addBeachName(String beachName) {
        boolean isBeachNameAdded = false;
        if (beachName != null && !beachName.isEmpty()) {
            beachNames[index] = beachName;
            index++;
            isBeachNameAdded = true; 
        } else {
            System.out.println(beachName + "is invalid");
        }
        return isBeachNameAdded;
    }

    public void getBeachNames() {
        for(String beachName : beachNames) {
            System.out.println(beachName);
        }
    }
public String getBeachNamesByIndex (int index){
	String beachName = null ;
	if (index < beachNames .length){
		beachName  = beachNames [index];
		System.out.println("The beachName  at index " + index  +" is: " + beachName );
	}
	else {
		System.out.println("In valid value " + index);
	}
	return beachName ;
}

	public int getIndexByBeachNames(String beachName ){
	int index = 0;
    for (String cbeachName  : beachNames ) {
        if (cbeachName  == beachName  ) {
			System.out.println("The index of " + cbeachName  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}

public boolean updateBeachNames(String existingBeachName , String updateBeachName){
    boolean isBeachNameUpdated = false;
    for(int index = 0 ; index< beachNames.length;index++){
        if (beachNames[index] == existingBeachName){
            beachNames[index] = updateBeachName ;
            isBeachNameUpdated = true;
            System.out.println("The updated name of " + existingBeachName + " is :" + updateBeachName);
        }
    }
    if (isBeachNameUpdated == false){
        System.out.println("Faild to Update the Data");
    }
    return isBeachNameUpdated;
}

public boolean deleteBeachNames(String beachName){
    boolean isBeachNameDeleted = false;

    for(int index = 0; index < beachNames.length; index++){
        if(beachNames[index] != null && beachNames[index].equals(beachName)){
            beachNames[index] = null;
            isBeachNameDeleted = true;
            System.out.println(beachName+ " is deleted");
            break;
        }
    }

    if(isBeachNameDeleted == false){
        System.out.println(beachName + " not found");
    }

    return isBeachNameDeleted;
}
}