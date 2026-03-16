class Wonderla {
    String parkLocation;
    double ticketPrice;
    LazyPool lazyPool;

    public void getWonderlaDetails() {
        System.out.println("========================");
        System.out.println("Park Location : " + parkLocation);
        System.out.println("Ticket Price : " + ticketPrice);
        this.lazyPool.getLazyPoolDetails();
    }
}