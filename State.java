class State {
    String highwayNames[] = new String[9];
    int index;

    public boolean addHighwayName(String highwayName) {
        boolean isHighwayNameAdded = false;
        if (highwayName != null && !highwayName.isEmpty()) {
            highwayNames[index] = highwayName;
            index++;
            isHighwayNameAdded = true; 
        } else {
            System.out.println(highwayName + "is invalid");
        }
        return isHighwayNameAdded;
    }

    public void getHighwayNames() {
        for(String highwayName : highwayNames) {
            System.out.println(highwayName);
        }
    }
	public String getHighwayNamesByIndex (int index){
	String highwayName = null ;
	if (index < highwayNames .length){
		highwayName  = highwayNames [index];
		System.out.println("The highwayName  at index " + index  +" is: " + highwayName );
	}
	else {
		System.out.println("In valid value " + index);
	}
	return highwayName ;
}

	public int getIndexByHighwayNames(String highwayName ){
	int index = 0;
    for (String chighwayName  : highwayNames ) {
        if (chighwayName  == highwayName  ) {
			System.out.println("The index of " + chighwayName  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}
public boolean updateHighwayNames(String existingHighwayName , String updateHighwayName){
    boolean isHighwayNameUpdated = false;
    for(int index = 0 ; index< highwayNames.length;index++){
        if (highwayNames[index] == existingHighwayName){
            highwayNames[index] = updateHighwayName ;
            isHighwayNameUpdated = true;
            System.out.println("The updated name of " + existingHighwayName + " is :" + updateHighwayName);
        }
    }
    if (isHighwayNameUpdated == false){
        System.out.println("Faild to Update the Data");
    }
    return isHighwayNameUpdated;
}

public boolean deleteHighwayNames(String highwayName){
    boolean isHighwayNameDeleted = false;

    for(int index = 0; index < highwayNames.length; index++){
        if(highwayNames[index] != null && highwayNames[index].equals(highwayName)){
            highwayNames[index] = null;
            isHighwayNameDeleted = true;
            System.out.println(highwayName+ " is deleted");
            break;
        }
    }

    if(isHighwayNameDeleted == false){
        System.out.println(highwayName + " not found");
    }

    return isHighwayNameDeleted;
}
}