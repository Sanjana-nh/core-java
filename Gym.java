class Gym {
    String equipments[] = new String[16];
    int index;

    public boolean addEquipment(String equipment) {
        boolean isEquipmentAdded = false;
        if (equipment != null && !equipment.isEmpty()) {
            equipments[index] = equipment;
            index++;
            isEquipmentAdded = true; 
        } else {
            System.out.println(equipment + "is invalid");
        }
        return isEquipmentAdded;
    }

    public void getEquipments() {
        for(String equipment : equipments) {
            System.out.println(equipment);
        }
    }
public String getEquipmentsByIndex (int index){
	String equipment = null ;
	if (index < equipments .length){
		equipment  = equipments [index];
		System.out.println("The equipment  at index " + index  +" is: " + equipment );
	}
	else {
		System.out.println("In valid value " + index);
	}
	return equipment ;
}

	public int getIndexByEquipments(String equipment ){
	int index = 0;
    for (String cequipment  : equipments ) {
        if (cequipment  == equipment  ) {
			System.out.println("The index of " + cequipment  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}

public boolean updateEquipments(String existingEquipment , String updateEquipment){
    boolean isEquipmentUpdated = false;
    for(int index = 0 ; index< equipments.length;index++){
        if (equipments[index] == existingEquipment){
            equipments[index] = updateEquipment ;
            isEquipmentUpdated = true;
            System.out.println("The updated name of " + existingEquipment + " is :" + updateEquipment);
        }
    }
    if (isEquipmentUpdated == false){
        System.out.println("Faild to Update the Data");
    }
    return isEquipmentUpdated;
}

public boolean deleteEquipments(String equipment){
    boolean isEquipmentDeleted = false;

    for(int index = 0; index < equipments.length; index++){
        if(equipments[index] != null && equipments[index].equals(equipment)){
            equipments[index] = null;
            isEquipmentDeleted = true;
            System.out.println(equipment+ " is deleted");
            break;
        }
    }

    if(isEquipmentDeleted == false){
        System.out.println(equipment + " not found");
    }

    return isEquipmentDeleted;
}
}