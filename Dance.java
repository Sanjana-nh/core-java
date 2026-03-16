class Dance {
    String eventName;
    String venue;
    Form form;
    public void getDanceDetails() {
        System.out.println("------------------------------");
        System.out.println("The Event Name is : " + eventName);
        System.out.println("The Venue is : " + venue);
        this.form.getFormDetails();
    }
}