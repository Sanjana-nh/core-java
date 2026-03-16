class Channel {
    int channelNumber;
    String channelName;
    String category;
    String language;
    double monthlySubscriptionFee;
    boolean isHD;
    String broadcaster;
    double popularityRating;
    String countryOfOrigin;
    boolean isFreeToAir;

    public void getChannelDetails() {
        System.out.println("------------------------");
        System.out.println("The Channel Details are:");
        System.out.println("Channel Number : " + channelNumber);
        System.out.println("Name : " + channelName);
        System.out.println("Category : " + category);
        System.out.println("Language : " + language);
        System.out.println("Fee (Rs) : " + monthlySubscriptionFee);
        System.out.println("Is HD : " + isHD);
        System.out.println("Broadcaster : " + broadcaster);
        System.out.println("Rating : " + popularityRating);
        System.out.println("Country : " + countryOfOrigin);
        System.out.println("Free to Air : " + isFreeToAir);
    }
}



