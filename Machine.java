class Machine {
    String machineId;
    String machineName;
    String manufacturer;
    int installationYear;
    double powerDrawKW;
    double operatingTempC;
    boolean isAutomated;
    int maintenanceIntervalDays;
    String operatorRole;
    double weightTons;

    public void getMachineDetails() {
        System.out.println("------------------------");
        System.out.println("The Machine Details are:");
        System.out.println("Machine ID : " + machineId);
        System.out.println("Name : " + machineName);
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Installed : " + installationYear);
        System.out.println("Power (KW) : " + powerDrawKW);
        System.out.println("Temp (C) : " + operatingTempC);
        System.out.println("Automated : " + isAutomated);
        System.out.println("Maintenance (Days) : " + maintenanceIntervalDays);
        System.out.println("Operator : " + operatorRole);
        System.out.println("Weight (Tons) : " + weightTons);
    }
}

