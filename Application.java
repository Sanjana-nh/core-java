class Application {
    String appId;
    String appName;
    String category;
    String developer;
    double sizeMB;
    double rating;
    int downloadsMillions;
    boolean isFree;
    String contentRating;
    boolean containsAds;

    public void getApplicationDetails() {
        System.out.println("------------------------");
        System.out.println("The Application Details are:");
        System.out.println("App ID : " + appId);
        System.out.println("Name : " + appName);
        System.out.println("Category : " + category);
        System.out.println("Developer : " + developer);
        System.out.println("Size (MB) : " + sizeMB);
        System.out.println("Rating : " + rating);
        System.out.println("Downloads (M) : " + downloadsMillions);
        System.out.println("Is Free : " + isFree);
        System.out.println("Content Rating : " + contentRating);
        System.out.println("Contains Ads : " + containsAds);
    }
}


