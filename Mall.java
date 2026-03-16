class Mall {
    String mallName;
    String location;
    Shop shop;

    public void getMallDetails() {
        System.out.println("========================");
        System.out.println("The Mall Name is : " + mallName);
        System.out.println("The Mall Location is : " + location);
        this.shop.getShopDetails();
    }
}