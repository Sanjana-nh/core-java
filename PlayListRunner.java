class PlayListRunner {
    public static void main(String[] args) {
        PlayList playList = new PlayList();

        playList.addSongName("Bohemian Rhapsody");
        playList.addSongName("Stairway to Heaven");
        playList.addSongName("Hotel California");
        playList.addSongName("Smells Like Teen Spirit");
        playList.addSongName("Sweet Child O' Mine");
        playList.addSongName("Imagine");
        playList.addSongName("Yesterday");
        playList.addSongName("Billie Jean");
        playList.addSongName("Like a Rolling Stone");
        playList.addSongName("Hey Jude");
        playList.addSongName("Purple Rain");
        playList.addSongName("Wonderwall");
        playList.addSongName("Livin' on a Prayer");
        playList.addSongName("Don't Stop Believin'");
        playList.addSongName("Hallelujah");

        playList.getSongNames();
		playList.getSongNamesByIndex(4);
		playList.getIndexBySongNames("Yesterday");
playList.updateSongNames("Yesterday", "New Song");
playList.getSongNames();
playList.deleteSongNames("Hey Jude");
playList.getSongNames();
    }
}