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
}