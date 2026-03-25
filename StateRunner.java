class StateRunner {
    public static void main(String[] args) {
        State karnataka = new State();

        karnataka.addHighwayName("NH 44 (Srinagar to Kanyakumari)");
        karnataka.addHighwayName("NH 48 (Delhi to Chennai)");
        karnataka.addHighwayName("NH 50 (Bidar to Joida)");
        karnataka.addHighwayName("NH 66 (Panvel to Kanyakumari)");
        karnataka.addHighwayName("NH 69 (Honnavar to Chittoor)");
        karnataka.addHighwayName("NH 73 (Mangaluru to Tumakuru)");
        karnataka.addHighwayName("NH 75 (Bantwal to Vellore)");
        karnataka.addHighwayName("NH 150A (Jewargi to Chamarajanagar)");
        karnataka.addHighwayName("NH 275 (Bengaluru to Bantwal)");

        karnataka.getHighwayNames();
    }
}