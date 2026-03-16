class CCd {
    String storeLocation;
    String managerName;
    Coffee coffee;

    public void getCCdDetails() {
        System.out.println("========================");
        System.out.println("Store Location : " + storeLocation);
        System.out.println("Manager : " + managerName);
        this.coffee.getCoffeeDetails();
    }
}