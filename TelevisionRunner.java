class TelevisionRunner {
    public static void main(String[] args) {
        Television television = new Television();

        television.addChannelName("Colors Kannada");
        television.addChannelName("Udaya TV");
        television.addChannelName("Star Suvarna");
        television.addChannelName("Zee Kannada");
        television.addChannelName("DD Chandana");
        television.addChannelName("Star Plus");
        television.addChannelName("Sony Entertainment Television");
        television.addChannelName("Zee TV");
        television.addChannelName("Colors TV");
        television.addChannelName("Star Sports 1");
        television.addChannelName("Sony Sports Ten 1");
        television.addChannelName("Cartoon Network");
        television.addChannelName("Pogo");
        television.addChannelName("Discovery Channel");
        television.addChannelName("National Geographic");
        television.addChannelName("MTV India");
        television.addChannelName("HBO");

        television.getChannelNames();
    }
}