class AirAsia {
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
}