class PlayList {
    String songNames[] = new String[15];
    int index;

    public boolean addSongName(String songName) {
        boolean isSongNameAdded = false;
        if (songName != null && !songName.isEmpty()) {
            songNames[index] = songName;
            index++;
            isSongNameAdded = true; 
        } else {
            System.out.println(songName + "is invalid");
        }
        return isSongNameAdded;
    }

    public void getSongNames() {
        for(String songName : songNames) {
            System.out.println(songName);
        }
    }
}