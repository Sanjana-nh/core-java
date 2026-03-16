class Pc {
    String pcName;
    String buildType;
    Hardware hardware;

    public void getPcDetails() {
        System.out.println("========================");
        System.out.println("The PC Name is : " + pcName);
        System.out.println("The Build Type is : " + buildType);
        this.hardware.getHardwareDetails();
    }
}