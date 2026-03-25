class ElectricalShop {
    String appliances[] = new String[20];
    int index;

    public boolean addAppliance(String appliance) {
        boolean isApplianceAdded = false;
        if (appliance != null && !appliance.isEmpty()) {
            appliances[index] = appliance;
            index++;
            isApplianceAdded = true; 
        } else {
            System.out.println(appliance + "is invalid");
        }
        return isApplianceAdded;
    }

    public void getAppliances() {
        for(String appliance : appliances) {
            System.out.println(appliance);
        }
    }
}