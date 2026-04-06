class Architect {
    String interiorDesignNames[] = new String[11];
    int index;

    public boolean addInteriorDesignName(String interiorDesignName) {
        boolean isInteriorDesignNameAdded = false;
        if (interiorDesignName != null && !interiorDesignName.isEmpty()) {
            interiorDesignNames[index] = interiorDesignName;
            index++;
            isInteriorDesignNameAdded = true; 
        } else {
            System.out.println(interiorDesignName + "is invalid");
        }
        return isInteriorDesignNameAdded;
    }

    public void getInteriorDesignNames() {
        for(String interiorDesignName : interiorDesignNames) {
            System.out.println(interiorDesignName);
        }
    }
	public String getInteriorDesignNamesByIndex (int index){
	String interiorDesignName = null ;
	if (index < interiorDesignNames .length){
		interiorDesignName  = interiorDesignNames [index];
		System.out.println("The interiorDesignName  at index " + index  +" is: " + interiorDesignName );
	}
	else {
		System.out.println("In valid value " + index);
	}
	return interiorDesignName ;
}

	public int getIndexByInteriorDesignNames(String interiorDesignName ){
	int index = 0;
    for (String cinteriorDesignName  : interiorDesignNames ) {
        if (cinteriorDesignName  == interiorDesignName  ) {
			System.out.println("The index of " + cinteriorDesignName  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}

public boolean updateInteriorDesignNames(String existingInteriorDesignName , String updateInteriorDesignName){
	boolean isInteriorDesignNameUpdated = false;
	for(int index = 0 ; index< interiorDesignNames.length;index++){
		if (interiorDesignNames[index] == existingInteriorDesignName){
			interiorDesignNames[index] = updateInteriorDesignName ;
			isInteriorDesignNameUpdated = true;
			System.out.println("The updated name of " + existingInteriorDesignName + " is :" + updateInteriorDesignName);
		}
		
	}
	if (isInteriorDesignNameUpdated == false){
		System.out.println("Faild to Update the Data");
	}
	return isInteriorDesignNameUpdated;
}

public boolean deleteInteriorDesignNames(String interiorDesignName){
    boolean isInteriorDesignNameDeleted = false;

    for(int index = 0; index < interiorDesignNames.length; index++){
        if(interiorDesignNames[index] != null && interiorDesignNames[index].equals(interiorDesignName)){
            interiorDesignNames[index] = null;
            isInteriorDesignNameDeleted = true;
            System.out.println(interiorDesignName+ " is deleted");
            break;
        }
    }

    if(isInteriorDesignNameDeleted == false){
        System.out.println(interiorDesignName + " not found");
    }

    return isInteriorDesignNameDeleted;
}
}