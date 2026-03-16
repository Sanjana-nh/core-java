class PlayStore {
    String region;
    String osPlatform;
    Application application;

    public void getPlayStoreDetails() {
        System.out.println("========================");
        System.out.println("Store Region : " + region);
        System.out.println("Platform : " + osPlatform);
        this.application.getApplicationDetails();
    }
}
