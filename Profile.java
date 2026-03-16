class Profile {
    String profileId;
    String fullName;
    String headline;
    String currentCompany;
    String location;
    int connectionsCount;
    boolean isOpenToWork;
    double yearsOfExperience;
    String industry;
    boolean hasPremium;

    public void getProfileDetails() {
        System.out.println("------------------------");
        System.out.println("The Profile Details are:");
        System.out.println("Profile ID : " + profileId);
        System.out.println("Full Name : " + fullName);
        System.out.println("Headline : " + headline);
        System.out.println("Company : " + currentCompany);
        System.out.println("Location : " + location);
        System.out.println("Connections: " + connectionsCount);
        System.out.println("Open to Work: " + isOpenToWork);
        System.out.println("Experience : " + yearsOfExperience + " years");
        System.out.println("Industry : " + industry);
        System.out.println("Premium : " + hasPremium);
    }
}



