class WonderlaRunner {
    public static void main(String[] args) {
        Wonderla wonderla = new Wonderla();

        wonderla.addWaterGame("Lazy River");
        wonderla.addWaterGame("Wavepool");
        wonderla.addWaterGame("Boomerang");
        wonderla.addWaterGame("Harakiri");
        wonderla.addWaterGame("Twisters");
        wonderla.addWaterGame("Water Pendulum");
        wonderla.addWaterGame("Rain Dance");
        wonderla.addWaterGame("Play Pools");
        wonderla.addWaterGame("Wavy & Vertical Fall");
        wonderla.addWaterGame("Jungle Lagoon");
        wonderla.addWaterGame("Fun Racers");
        wonderla.addWaterGame("Uphill Racers");
        wonderla.addWaterGame("Bandits of Sherwood");
        wonderla.addWaterGame("Mammoth");
        wonderla.addWaterGame("Splash");
        wonderla.addWaterGame("Aqua Dance");
        wonderla.addWaterGame("Tornado");
        wonderla.addWaterGame("Drop Loop");
        wonderla.addWaterGame("Rapid River");
        wonderla.addWaterGame("Screamer");
        wonderla.addWaterGame("Cyclone");
        wonderla.addWaterGame("Whirlpool");
        wonderla.addWaterGame("Aqua Tube");
        wonderla.addWaterGame("Kamikaze");
        wonderla.addWaterGame("Free Fall");

        wonderla.getWaterGames();
		wonderla.getWaterGamesByIndex(11);
		wonderla.getIndexByWaterGames("Drop Loop");
		wonderla.updateWaterGames("Wavepool", "Wave Pool");
wonderla.getWaterGames();
wonderla.deleteWaterGames("Rain Dance");
wonderla.getWaterGames();
    }
}