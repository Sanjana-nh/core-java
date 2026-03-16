class Train {
    String trainName;
    int trainNumber;
    Bogie bogie;

    public void getTrainDetails() {
        System.out.println("------------------------");
        System.out.println("The Train Name is :" + trainName);
        System.out.println("The Train Number is :" + trainNumber);
        this.bogie.getBogieDetails();
    }
}