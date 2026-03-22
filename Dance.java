class Dance {
    String eventName; String venue; Form form;

    public Dance(String eventName, String venue, Form form) {
        this.eventName = eventName; this.venue = venue; this.form = form;
    }

    public void displayDetails() {
        System.out.println("========================");
        System.out.println("Event : " + eventName + " | Venue : " + venue);
        this.form.displayDetails();
    }
}