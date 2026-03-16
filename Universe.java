class Universe {
    String universeName;
    String creatorEntity;
    Earth earth;

    public void getUniverseDetails() {
        System.out.println("========================");
        System.out.println("Universe Name : " + universeName);
        System.out.println("Creator : " + creatorEntity);
        this.earth.getEarthDetails();
    }
}