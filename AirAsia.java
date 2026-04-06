class AirAsia{
    String passengers[] = new String[30];
    int index;

    public boolean addPassenger(String passenger) {
        boolean isPassengerAdded = false;
        if (passenger != null && !passenger.isEmpty()) {
            passengers[index] = passenger;
            index++;
            isPassengerAdded = true; 
        } else {
            System.out.println(passenger + "is invalid");
        }
        return isPassengerAdded;
    }

    public void getPassengers() {
        for(String passenger : passengers) {
            System.out.println(passenger);
        }
    }

public String getPassengersByIndex (int index){
	String passenger = null ;
	if (index < passengers .length){
		passenger  = passengers [index];
		System.out.println("The passenger  at index " + index  +" is: " + passenger );
	}
	else {
		System.out.println("In valid value " + index);
	}
	return passenger ;
}

	public int getIndexByPassengers(String passenger ){
	int index = 0;
    for (String cpassenger  : passengers ) {
        if (cpassenger  == passenger  ) {
			System.out.println("The index of " + cpassenger  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}

public boolean updatePassengers(String existingPassenger , String updatePassenger){
	boolean isPassengerUpdated = false;
	for(int index = 0 ; index< passengers.length;index++){
		if (passengers[index] == existingPassenger){
			passengers[index] = updatePassenger ;
			isPassengerUpdated = true;
			System.out.println("The updated name of " + existingPassenger + " is :" + updatePassenger);
		}
		
	}
	if (isPassengerUpdated == false){
		System.out.println("Faild to Update the Data");
	}
	return isPassengerUpdated;
}

public boolean deletePassenger(String Passenger){
    boolean isPassengerDeleted = false;

    for(int index = 0; index < passengers.length; index++){
        if(passengers[index] != null && passengers[index].equals(Passenger)){
            passengers[index] = null;
            isPassengerDeleted = true;
            System.out.println(Passenger + " is deleted");
            break;
        }
    }

    if(isPassengerDeleted == false){
        System.out.println(Passenger + " not found");
    }

    return isPassengerDeleted;
}
}