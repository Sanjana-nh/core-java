class Train {
    String trainName; int trainNumber; Bogie bogie;

    public Train(String trainName, int trainNumber, Bogie bogie) {
        this.trainName = trainName; this.trainNumber = trainNumber; this.bogie = bogie;
    }

    public void displayDetails() {
        System.out.println("========================");
        System.out.println("Train Name : " + trainName);
        System.out.println("Train Number : " + trainNumber);
        this.bogie.displayDetails();
    }
}