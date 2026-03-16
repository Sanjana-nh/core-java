class Museum {
    String museumName;
    String cityLocation;
    Diamond diamond;

    public void getMuseumDetails() {
        System.out.println("========================");
        System.out.println("Museum Name : " + museumName);
        System.out.println("City : " + cityLocation);
        this.diamond.getDiamondDetails();
    }
}