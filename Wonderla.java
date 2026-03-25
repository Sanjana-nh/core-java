class Wonderla {
    String waterGames[] = new String[25];
    int index;

    public boolean addWaterGame(String waterGame) {
        boolean isWaterGameAdded = false;
        if (waterGame != null && !waterGame.isEmpty()) {
            waterGames[index] = waterGame;
            index++;
            isWaterGameAdded = true; 
        } else {
            System.out.println(waterGame + "is invalid");
        }
        return isWaterGameAdded;
    }

    public void getWaterGames() {
        for(String waterGame : waterGames) {
            System.out.println(waterGame);
        }
    }
}