class PetShopRunner {
    public static void main(String[] args) {
        PetShop shop = new PetShop();

        shop.addPetAccessory("Dog Collar");
        shop.addPetAccessory("Retractable Leash");
        shop.addPetAccessory("Cat Tree");
        shop.addPetAccessory("Chew Toy");
        shop.addPetAccessory("Hamster Wheel");
        shop.addPetAccessory("Bird Cage");
        shop.addPetAccessory("Fish Tank");
        shop.addPetAccessory("Orthopedic Pet Bed");
        shop.addPetAccessory("Grooming Brush");
        shop.addPetAccessory("Nail Clippers");
        shop.addPetAccessory("Stainless Steel Water Bowl");
        shop.addPetAccessory("Automatic Food Dispenser");
        shop.addPetAccessory("Self-Cleaning Litter Box");
        shop.addPetAccessory("Scratching Post");
        shop.addPetAccessory("Aquarium Filter");
        shop.addPetAccessory("Dog Sweater");
        shop.addPetAccessory("Catnip");
        shop.addPetAccessory("Bird Feeder");
        shop.addPetAccessory("Reptile Heat Lamp");
        shop.addPetAccessory("Flea and Tick Collar");

        shop.getPetAccessories();
		shop.getPetAccessoriesByIndex(7);
		shop.getIndexByPetAccessories("Catnip");
		shop.updatePetAccessories("Dog Collar", "Dog Leash");
shop.getPetAccessories();
shop.deletePetAccessories("Cat Tree");
shop.getPetAccessories();
    }
}