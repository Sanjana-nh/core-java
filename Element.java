class Element {
    int atomicNumber;
    String symbol;
    String elementName;
    double atomicMass;
    String stateAtRoomTemp;
    boolean isMetal;
    String groupBlock;
    int discoveryYear;
    double electronegativity;
    double meltingPointCelsius;

    public void getElementDetails() {
        System.out.println("------------------------");
        System.out.println("The Element Details are:");
        System.out.println("Atomic Number : " + atomicNumber);
        System.out.println("Symbol : " + symbol);
        System.out.println("Name : " + elementName);
        System.out.println("Atomic Mass : " + atomicMass);
        System.out.println("State : " + stateAtRoomTemp);
        System.out.println("Is Metal : " + isMetal);
        System.out.println("Group Block : " + groupBlock);
        System.out.println("Discovery Year : " + discoveryYear);
        System.out.println("Electronegativity : " + electronegativity);
        System.out.println("Melting Point (C): " + meltingPointCelsius);
    }
}


