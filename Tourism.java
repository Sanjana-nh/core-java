class Tourism {
    String agencyName;
    String contactNumber;
    Package tourPackage;

    public void getTourismDetails() {
        System.out.println("========================");
        System.out.println("Agency Name : " + agencyName);
        System.out.println("Contact Number : " + contactNumber);
        this.tourPackage.getPackageDetails();
    }
}