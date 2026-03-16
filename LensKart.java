class LensKart {
    String storeLocation;
    String contactNumber;
    Frame frame;

    public void getLensKartDetails() {
        System.out.println("========================");
        System.out.println("Store Location : " + storeLocation);
        System.out.println("Contact Number : " + contactNumber);
        this.frame.getFrameDetails();
    }
}
