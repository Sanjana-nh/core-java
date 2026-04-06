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
	public String getSongNamesByIndex (int index){
	String songName = null ;
	if (index < songNames .length){
		songName  = songNames [index];
		System.out.println("The songName  at index " + index  +" is: " + songName );
	}
	else {
		System.out.println("In valid value " + index);
	}
	return songName ;
}

	public int getIndexBySongNames(String songName ){
	int index = 0;
    for (String csongName  : songNames ) {
        if (csongName  == songName  ) {
			System.out.println("The index of " + csongName  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}
public boolean updateSongNames(String existingSongName , String updateSongName){
    boolean isSongNameUpdated = false;
    for(int index = 0 ; index< songNames.length;index++){
        if (songNames[index] == existingSongName){
            songNames[index] = updateSongName ;
            isSongNameUpdated = true;
            System.out.println("The updated name of " + existingSongName + " is :" + updateSongName);
        }
    }
    if (isSongNameUpdated == false){
        System.out.println("Faild to Update the Data");
    }
    return isSongNameUpdated;
}

public boolean deleteSongNames(String songName){
    boolean isSongNameDeleted = false;

    for(int index = 0; index < songNames.length; index++){
        if(songNames[index] != null && songNames[index].equals(songName)){
            songNames[index] = null;
            isSongNameDeleted = true;
            System.out.println(songName+ " is deleted");
            break;
        }
    }

    if(isSongNameDeleted == false){
        System.out.println(songName + " not found");
    }

    return isSongNameDeleted;
}
}