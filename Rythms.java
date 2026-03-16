class Rythms {
    String branchLocation;
    int establishedYear;
    MusicInstrument musicInstrument;

    public void getRythmsDetails() {
        System.out.println("========================");
        System.out.println("Branch Location : " + branchLocation);
        System.out.println("Established Year : " + establishedYear);
        this.musicInstrument.getInstrumentDetails();
    }
}