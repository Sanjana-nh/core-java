class Ipl {
    String teamName;
    int seasonYear;
    Player player;

    public void getIplDetails() {
        System.out.println("========================");
        System.out.println("Team Name : " + teamName);
        System.out.println("Season : " + seasonYear);
        this.player.getPlayerDetails();
    }
}