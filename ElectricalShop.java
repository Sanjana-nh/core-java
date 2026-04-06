class ElectricalShop {
    String appliances[] = new String[20];
    int index;

    public boolean addAppliance(String appliance) {
        boolean isApplianceAdded = false;
        if (appliance != null && !appliance.isEmpty()) {
            appliances[index] = appliance;
            index++;
            isApplianceAdded = true; 
        } else {
            System.out.println(appliance + "is invalid");
        }
        return isApplianceAdded;
    }

    public void getAppliances() {
        for(String appliance : appliances) {
            System.out.println(appliance);
        }
    }
public String getAppliancesByIndex (int index){
	String appliance = null ;
	if (index < appliances .length){
		appliance  = appliances [index];
		System.out.println("The appliance  at index " + index  +" is: " + appliance );
	}
	else {
		System.out.println("In valid value " + index);
	}
	return appliance ;
}

	public int getIndexByAppliances(String appliance ){
	int index = 0;
    for (String cappliance  : appliances ) {
        if (cappliance  == appliance  ) {
			System.out.println("The index of " + cappliance  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}

public boolean updateAppliances(String existingAppliance , String updateAppliance){
	boolean isApplianceUpdated = false;
	for(int index = 0 ; index< appliances.length;index++){
		if (appliances[index] == existingAppliance){
			appliances[index] = updateAppliance ;
			isApplianceUpdated = true;
			System.out.println("The updated name of " + existingAppliance + " is :" + updateAppliance);
		}
		
	}
	if (isApplianceUpdated == false){
		System.out.println("Faild to Update the Data");
	}
	return isApplianceUpdated;
}

public boolean deleteAppliances(String appliance){
    boolean isApplianceDeleted = false;

    for(int index = 0; index < appliances.length; index++){
        if(appliances[index] != null && appliances[index].equals(appliance)){
            appliances[index] = null;
            isApplianceDeleted = true;
            System.out.println(appliance+ " is deleted");
            break;
        }
    }

    if(isApplianceDeleted == false){
        System.out.println(appliance + " not found");
    }

    return isApplianceDeleted;
}
}