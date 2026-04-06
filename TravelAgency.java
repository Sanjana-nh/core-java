class TravelAgency {
    String places[] = new String[17];
    int index;

    public boolean addPlace(String place) {
        boolean isPlaceAdded = false;
        if (place != null && !place.isEmpty()) {
            places[index] = place;
            index++;
            isPlaceAdded = true; 
        } else {
            System.out.println(place + "is invalid");
        }
        return isPlaceAdded;
    }

    public void getPlaces() {
        for(String place : places) {
            System.out.println(place);
        }
    }
	public String getPlacesByIndex (int index){
	String place = null ;
	if (index < places.length){
		place = places[index];
		System.out.println("The Place at index " + index  +" is: " + place);
	}
	else {
		System.out.println("In valid value " + index);
	}
	return place;
}

public int getIndexByPlaces(String place){
	int index = 0;
    for (String cplace : places) {
        if (cplace == place ) {
			System.out.println("The index of " + cplace + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}
public boolean updatePlaces(String existingPlace , String updatePlace){
    boolean isPlaceUpdated = false;
    for(int index = 0 ; index< places.length;index++){
        if (places[index] == existingPlace){
            places[index] = updatePlace ;
            isPlaceUpdated = true;
            System.out.println("The updated name of " + existingPlace + " is :" + updatePlace);
        }
    }
    if (isPlaceUpdated == false){
        System.out.println("Faild to Update the Data");
    }
    return isPlaceUpdated;
}

public boolean deletePlaces(String place){
    boolean isPlaceDeleted = false;

    for(int index = 0; index < places.length; index++){
        if(places[index] != null && places[index].equals(place)){
            places[index] = null;
            isPlaceDeleted = true;
            System.out.println(place+ " is deleted");
            break;
        }
    }

    if(isPlaceDeleted == false){
        System.out.println(place + " not found");
    }

    return isPlaceDeleted;
}
}