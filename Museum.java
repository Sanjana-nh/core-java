class Museum {
    String historicalMonuments[] = new String[16];
    int index;

    public boolean addHistoricalMonument(String historicalMonument) {
        boolean isHistoricalMonumentAdded = false;
        if (historicalMonument != null && !historicalMonument.isEmpty()) {
            historicalMonuments[index] = historicalMonument;
            index++;
            isHistoricalMonumentAdded = true; 
        } else {
            System.out.println(historicalMonument + "is invalid");
        }
        return isHistoricalMonumentAdded;
    }

    public void getHistoricalMonuments() {
        for(String historicalMonument : historicalMonuments) {
            System.out.println(historicalMonument);
        }
    }
}