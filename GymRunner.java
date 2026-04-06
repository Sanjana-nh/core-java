class GymRunner {
    public static void main(String[] args) {
        Gym gym = new Gym();

        gym.addEquipment("Treadmill");
        gym.addEquipment("Dumbbell");
        gym.addEquipment("Barbell");
        gym.addEquipment("Kettlebell");
        gym.addEquipment("Bench Press");
        gym.addEquipment("Squat Rack");
        gym.addEquipment("Leg Press Machine");
        gym.addEquipment("Elliptical");
        gym.addEquipment("Rowing Machine");
        gym.addEquipment("Pull-up Bar");
        gym.addEquipment("Lat Pulldown Machine");
        gym.addEquipment("Cable Crossover");
        gym.addEquipment("Smith Machine");
        gym.addEquipment("Pec Deck Machine");
        gym.addEquipment("Leg Extension Machine");
        gym.addEquipment("Yoga Mat");

        gym.getEquipments();
		gym.getEquipmentsByIndex(7);
		gym.getIndexByEquipments("Dumbbell");
		gym.updateEquipments("Dumbell", "Dumbbells");
gym.getEquipments();
gym.deleteEquipments("Treadmill");
gym.getEquipments();
    }
}