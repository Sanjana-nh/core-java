class Museum {
    String historicalMonuments[] = new String[16];
    int index;

    public boolean addHistoricalMonument(String historicalMonument) {
        boolean isHistoricalMonumentAdded = false;
        if (historicalMonument != null && !historicalMonument.isEmpty()) {
            historicalMonuments[index] = historicalMonument;
            index++;
            isHistoricalMonumentAdded = true; 
        } else {
            System.out.println(historicalMonument + "is invalid");
        }
        return isHistoricalMonumentAdded;
    }

    public void getHistoricalMonuments() {
        for(String historicalMonument : historicalMonuments) {
            System.out.println(historicalMonument);
        }
    }
	public String getHistoricalMonumentsByIndex (int index){
	String historicalMonument = null ;
	if (index < historicalMonuments .length){
		historicalMonument  = historicalMonuments [index];
		System.out.println("The historicalMonument  at index " + index  +" is: " + historicalMonument );
	}
	else {
		System.out.println("Invalid value " + index);
	}
	return historicalMonument ;
}

	public int getIndexByHistoricalMonuments(String historicalMonument ){
	int index = 0;
    for (String chistoricalMonument  : historicalMonuments ) {
        if (chistoricalMonument  == historicalMonument  ) {
			System.out.println("The index of " + chistoricalMonument  + " is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}

public boolean updateHistoricalMonuments(String existingHistoricalMonument , String updateHistoricalMonument){
    boolean isHistoricalMonumentUpdated = false;
    for(int index = 0 ; index< historicalMonuments.length;index++){
        if (historicalMonuments[index] == existingHistoricalMonument){
            historicalMonuments[index] = updateHistoricalMonument ;
            isHistoricalMonumentUpdated = true;
            System.out.println("The updated name of " + existingHistoricalMonument + " is :" + updateHistoricalMonument);
        }
    }
    if (isHistoricalMonumentUpdated == false){
        System.out.println("Faild to Update the Data");
    }
    return isHistoricalMonumentUpdated;
}

public boolean deleteHistoricalMonuments(String historicalMonument){
    boolean isHistoricalMonumentDeleted = false;

    for(int index = 0; index < historicalMonuments.length; index++){
        if(historicalMonuments[index] != null && historicalMonuments[index].equals(historicalMonument)){
            historicalMonuments[index] = null;
            isHistoricalMonumentDeleted = true;
            System.out.println(historicalMonument+ " is deleted");
            break;
        }
    }

    if(isHistoricalMonumentDeleted == false){
        System.out.println(historicalMonument + " not found");
    }

    return isHistoricalMonumentDeleted;
}
}