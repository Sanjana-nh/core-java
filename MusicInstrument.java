class MusicInstrument {
    String instrumentId;
    String instrumentName;
    String familyType;
    String brand;
    double price;
    double weightKg;
    boolean isAcoustic;
    String material;
    int numberOfStringsOrKeys;
    int warrantyYears;

    public void getInstrumentDetails() {
        System.out.println("------------------------");
        System.out.println("The Instrument Details are:");
        System.out.println("ID : " + instrumentId);
        System.out.println("Name : " + instrumentName);
        System.out.println("Family : " + familyType);
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Weight (Kg) : " + weightKg);
        System.out.println("Is Acoustic : " + isAcoustic);
        System.out.println("Material : " + material);
        System.out.println("Strings/Keys : " + numberOfStringsOrKeys);
        System.out.println("Warranty (Yrs): " + warrantyYears);
    }
}



