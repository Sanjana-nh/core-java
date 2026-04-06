class PetShop {
    String petAccessories[] = new String[20];
    int index;

    public boolean addPetAccessory(String petAccessory) {
        boolean isPetAccessoryAdded = false;
        if (petAccessory != null && !petAccessory.isEmpty()) {
            petAccessories[index] = petAccessory;
            index++;
            isPetAccessoryAdded = true; 
        } else {
            System.out.println(petAccessory + "is invalid");
        }
        return isPetAccessoryAdded;
    }

    public void getPetAccessories() {
        for(String petAccessory : petAccessories) {
            System.out.println(petAccessory);
        }
    }
	public String getPetAccessoriesByIndex (int index){
	String Accessory = null ;
	if (index < Accessories .length){
		Accessory  = Accessories [index];
		System.out.println("The Accessory  at index " + index  +" is: " + Accessory );
	}
	else {
		System.out.println("In valid value " + index);
	}
	return Accessory ;
}

	public int getIndexByPetAccessories(String Accessory ){
	int index = 0;
    for (String cAccessory  : Accessories ) {
        if (cAccessory  == Accessory  ) {
			System.out.println("The index of " + cAccessory  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}
public boolean updatePetAccessories(String existingPetAccessory , String updatePetAccessory){
    boolean isPetAccessoryUpdated = false;
    for(int index = 0 ; index< petAccessories.length;index++){
        if (petAccessories[index] == existingPetAccessory){
            petAccessories[index] = updatePetAccessory ;
            isPetAccessoryUpdated = true;
            System.out.println("The updated name of " + existingPetAccessory + " is :" + updatePetAccessory);
        }
    }
    if (isPetAccessoryUpdated == false){
        System.out.println("Faild to Update the Data");
    }
    return isPetAccessoryUpdated;
}

public boolean deletePetAccessories(String petAccessory){
    boolean isPetAccessoryDeleted = false;

    for(int index = 0; index < petAccessories.length; index++){
        if(petAccessories[index] != null && petAccessories[index].equals(petAccessory)){
            petAccessories[index] = null;
            isPetAccessoryDeleted = true;
            System.out.println(petAccessory+ " is deleted");
            break;
        }
    }

    if(isPetAccessoryDeleted == false){
        System.out.println(petAccessory + " not found");
    }

    return isPetAccessoryDeleted;
}
}