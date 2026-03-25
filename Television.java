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
}