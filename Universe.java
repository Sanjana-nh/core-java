class Universe {
    String galaxies[] = new String[17];
    int index;

    public boolean addGalaxy(String galaxy) {
        boolean isGalaxyAdded = false;
        if (galaxy != null && !galaxy.isEmpty()) {
            galaxies[index] = galaxy;
            index++;
            isGalaxyAdded = true; 
        } else {
            System.out.println(galaxy + "is invalid");
        }
        return isGalaxyAdded;
    }

    public void getGalaxies() {
        for(String galaxy : galaxies) {
            System.out.println(galaxy);
        }
    }
	
	public String getGalaxiesByIndex (int index){
	String galaxy = null ;
	if (index < galaxies .length){
		galaxy  = galaxies [index];
		System.out.println("The galaxy  at index " + index  +" is: " + galaxy );
	}
	else {
		System.out.println("In valid value " + index);
	}
	return galaxy ;
}

public int getIndexByGalaxies (String galaxy ){
	int index = 0;
    for (String cgalaxy  : galaxies ) {
        if (cgalaxy  == galaxy  ) {
			System.out.println("The index of " + cgalaxy  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}
public boolean updateGalaxies(String existingGalaxy , String updateGalaxy){
    boolean isGalaxyUpdated = false;
    for(int index = 0 ; index< galaxies.length;index++){
        if (galaxies[index] == existingGalaxy){
            galaxies[index] = updateGalaxy ;
            isGalaxyUpdated = true;
            System.out.println("The updated name of " + existingGalaxy + " is :" + updateGalaxy);
        }
    }
    if (isGalaxyUpdated == false){
        System.out.println("Faild to Update the Data");
    }
    return isGalaxyUpdated;
}

public boolean deleteGalaxies(String galaxy){
    boolean isGalaxyDeleted = false;

    for(int index = 0; index < galaxies.length; index++){
        if(galaxies[index] != null && galaxies[index].equals(galaxy)){
            galaxies[index] = null;
            isGalaxyDeleted = true;
            System.out.println(galaxy+ " is deleted");
            break;
        }
    }

    if(isGalaxyDeleted == false){
        System.out.println(galaxy + " not found");
    }

    return isGalaxyDeleted;
}
}