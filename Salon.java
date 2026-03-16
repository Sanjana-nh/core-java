class Salon {
    String salonName;
    String location;
    Service service;

    public void getSalonDetails() {
        System.out.println("========================");
        System.out.println("Salon Name : " + salonName);
        System.out.println("Location : " + location);
        this.service.getServiceDetails();
    }
}