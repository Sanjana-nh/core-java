class MuseumRunner {
    public static void main(String[] args) {
        Museum museum = new Museum();

        museum.addHistoricalMonument("Taj Mahal");
        museum.addHistoricalMonument("Qutub Minar");
        museum.addHistoricalMonument("Red Fort");
        museum.addHistoricalMonument("Hawa Mahal");
        museum.addHistoricalMonument("Colosseum");
        museum.addHistoricalMonument("Eiffel Tower");
        museum.addHistoricalMonument("Machu Picchu");
        museum.addHistoricalMonument("Great Wall of China");
        museum.addHistoricalMonument("Statue of Liberty");
        museum.addHistoricalMonument("Stonehenge");
        museum.addHistoricalMonument("Pyramids of Giza");
        museum.addHistoricalMonument("Acropolis of Athens");
        museum.addHistoricalMonument("Chichen Itza");
        museum.addHistoricalMonument("Petra");
        museum.addHistoricalMonument("Angkor Wat");
        museum.addHistoricalMonument("Alhambra");

        museum.getHistoricalMonuments();
    }
}