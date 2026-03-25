class State {
    String highwayNames[] = new String[9];
    int index;

    public boolean addHighwayName(String highwayName) {
        boolean isHighwayNameAdded = false;
        if (highwayName != null && !highwayName.isEmpty()) {
            highwayNames[index] = highwayName;
            index++;
            isHighwayNameAdded = true; 
        } else {
            System.out.println(highwayName + "is invalid");
        }
        return isHighwayNameAdded;
    }

    public void getHighwayNames() {
        for(String highwayName : highwayNames) {
            System.out.println(highwayName);
        }
    }
}