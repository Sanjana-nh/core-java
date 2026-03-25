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
}