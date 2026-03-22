class Mall {
    String mallName; String location; Shop shop;

    public Mall(String mallName, String location, Shop shop) {
        this.mallName = mallName; 
		this.location = location; 
		this.shop = shop;
    }

    public void displayDetails() {
        System.out.println("========================");
        System.out.println("Mall : " + mallName + " | Location : " + location);
        this.shop.displayDetails();
    }
}