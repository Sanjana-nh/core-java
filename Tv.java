class Tv {
    String tvBrand;
    int screenSizeInches;
    Channel channel;

    public void getTvDetails() {
        System.out.println("========================");
        System.out.println("TV Brand : " + tvBrand);
        System.out.println("Screen Size : " + screenSizeInches + " inches");
        this.channel.getChannelDetails();
    }
}