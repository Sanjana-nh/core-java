class Television {
    String channelNames[] = new String[17];
    int index;

    public boolean addChannelName(String channelName) {
        boolean isChannelNameAdded = false;
        if (channelName != null && !channelName.isEmpty()) {
            channelNames[index] = channelName;
            index++;
            isChannelNameAdded = true; 
        } else {
            System.out.println(channelName + "is invalid");
        }
        return isChannelNameAdded;
    }

    public void getChannelNames() {
        for(String channelName : channelNames) {
            System.out.println(channelName);
        }
    }
	public String getChannelNamesByIndex (int index){
	String channelName = null ;
	if (index < channelNames .length){
		channelName  = channelNames [index];
		System.out.println("The channelName  at index " + index  +" is: " + channelName );
	}
	else {
		System.out.println("In valid value " + index);
	}
	return channelName ;
}

	public int getIndexByChannelNames(String channelName ){
	int index = 0;
    for (String cchannelName  : channelNames ) {
        if (cchannelName  == channelName  ) {
			System.out.println("The index of " + cchannelName  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}
public boolean updateChannelNames(String existingChannelName , String updateChannelName){
    boolean isChannelNameUpdated = false;
    for(int index = 0 ; index< channelNames.length;index++){
        if (channelNames[index] == existingChannelName){
            channelNames[index] = updateChannelName ;
            isChannelNameUpdated = true;
            System.out.println("The updated name of " + existingChannelName + " is :" + updateChannelName);
        }
    }
    if (isChannelNameUpdated == false){
        System.out.println("Faild to Update the Data");
    }
    return isChannelNameUpdated;
}

public boolean deleteChannelNames(String channelName){
    boolean isChannelNameDeleted = false;

    for(int index = 0; index < channelNames.length; index++){
        if(channelNames[index] != null && channelNames[index].equals(channelName)){
            channelNames[index] = null;
            isChannelNameDeleted = true;
            System.out.println(channelName+ " is deleted");
            break;
        }
    }

    if(isChannelNameDeleted == false){
        System.out.println(channelName + " not found");
    }

    return isChannelNameDeleted;
}
}