class Government {
    String rulingParty;
    int termYear;
    Policy policy;

    public void getGovernmentDetails() {
        System.out.println("========================");
        System.out.println("Ruling Party : " + rulingParty);
        System.out.println("Term Year : " + termYear);
        this.policy.getPolicyDetails();
    }
}