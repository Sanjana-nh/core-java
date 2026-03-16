class BigDaddy {
    String shipLocation;
    int totalFloors;
    Cassino cassino;

    public void getBigDaddyDetails() {
        System.out.println("========================");
        System.out.println("Ship Location : " + shipLocation);
        System.out.println("Total Floors : " + totalFloors);
        this.cassino.getCassinoDetails();
    }
}