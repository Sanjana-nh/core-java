class Factory {
    String factoryName;
    String industrialSector;
    Machine machine;

    public void getFactoryDetails() {
        System.out.println("========================");
        System.out.println("Factory Name : " + factoryName);
        System.out.println("Industrial Sector : " + industrialSector);
        this.machine.getMachineDetails();
    }
}