class Government {
    String competitiveExamNames[] = new String[9];
    int index;

    public boolean addCompetitiveExamName(String competitiveExamName) {
        boolean isCompetitiveExamNameAdded = false;
        if (competitiveExamName != null && !competitiveExamName.isEmpty()) {
            competitiveExamNames[index] = competitiveExamName;
            index++;
            isCompetitiveExamNameAdded = true; 
        } else {
            System.out.println(competitiveExamName + "is invalid");
        }
        return isCompetitiveExamNameAdded;
    }

    public void getCompetitiveExamNames() {
        for(String competitiveExamName : competitiveExamNames) {
            System.out.println(competitiveExamName);
        }
    }
public String getCompetitiveExamNamesByIndex (int index){
	String competitiveExamName = null ;
	if (index < competitiveExamNames .length){
		competitiveExamName  = competitiveExamNames [index];
		System.out.println("The competitiveExamName  at index " + index  +" is: " + competitiveExamName );
	}
	else {
		System.out.println("Invalid value " + index);
	}
	return competitiveExamName ;
}

	public int getIndexByCompetitiveExamNames(String competitiveExamName ){
	int index = 0;
    for (String ccompetitiveExamName  : competitiveExamNames ) {
        if (ccompetitiveExamName  == competitiveExamName  ) {
			System.out.println("The index of " + ccompetitiveExamName  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}

public boolean updateCompetitiveExamNames(String existingCompetitiveExamName , String updateCompetitiveExamName){
    boolean isCompetitiveExamNameUpdated = false;
    for(int index = 0 ; index< competitiveExamNames.length;index++){
        if (competitiveExamNames[index] == existingCompetitiveExamName){
            competitiveExamNames[index] = updateCompetitiveExamName ;
            isCompetitiveExamNameUpdated = true;
            System.out.println("The updated name of " + existingCompetitiveExamName + " is :" + updateCompetitiveExamName);
        }
    }
    if (isCompetitiveExamNameUpdated == false){
        System.out.println("Faild to Update the Data");
    }
    return isCompetitiveExamNameUpdated;
}

public boolean deleteCompetitiveExamNames(String competitiveExamName){
    boolean isCompetitiveExamNameDeleted = false;

    for(int index = 0; index < competitiveExamNames.length; index++){
        if(competitiveExamNames[index] != null && competitiveExamNames[index].equals(competitiveExamName)){
            competitiveExamNames[index] = null;
            isCompetitiveExamNameDeleted = true;
            System.out.println(competitiveExamName+ " is deleted");
            break;
        }
    }

    if(isCompetitiveExamNameDeleted == false){
        System.out.println(competitiveExamName + " not found");
    }

    return isCompetitiveExamNameDeleted;
}
}