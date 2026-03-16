class Policy {
    String policyId;
    String policyName;
    String sector;
    double budgetAllocatedCr;
    int launchYear;
    boolean isActive;
    String targetBeneficiary;
    String ministerInCharge;
    int durationYears;
    boolean isNationwide;

    public void getPolicyDetails() {
        System.out.println("------------------------");
        System.out.println("The Policy Details are:");
        System.out.println("Policy ID : " + policyId);
        System.out.println("Name : " + policyName);
        System.out.println("Sector : " + sector);
        System.out.println("Budget (Cr) : " + budgetAllocatedCr);
        System.out.println("Launch Year : " + launchYear);
        System.out.println("Is Active : " + isActive);
        System.out.println("Beneficiary : " + targetBeneficiary);
        System.out.println("Minister : " + ministerInCharge);
        System.out.println("Duration (Yrs): " + durationYears);
        System.out.println("Nationwide : " + isNationwide);
    }
}



