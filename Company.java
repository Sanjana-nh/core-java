class Company {
    String companyName;
    String headquarters;
    Project project;

    public void getCompanyDetails() {
        System.out.println("========================");
        System.out.println("Company Name : " + companyName);
        System.out.println("Headquarters : " + headquarters);
        this.project.getProjectDetails();
    }
}