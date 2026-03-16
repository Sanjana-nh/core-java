class LinkedIn {
    String accountEmail;
    String subscriptionTier;
    Profile profile;

    public void getLinkedInDetails() {
        System.out.println("========================");
        System.out.println("Account Email : " + accountEmail);
        System.out.println("Subscription : " + subscriptionTier);
        this.profile.getProfileDetails();
    }
}