class Pc {
    String pcName; String buildType; Hardware hardware;

    public Pc(String pcName, String buildType, Hardware hardware) {
        this.pcName = pcName; this.buildType = buildType; this.hardware = hardware;
    }

    public void displayDetails() {
        System.out.println("========================");
        System.out.println("PC Name : " + pcName + " | Build : " + buildType);
        this.hardware.displayDetails();
    }
}