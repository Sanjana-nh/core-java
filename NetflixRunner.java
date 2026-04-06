class NetflixRunner{
public static void main(String[] args){
Netflix net=new Netflix();
net.addWebSeries("RAW");
net.addWebSeries("One Piece");
net.addWebSeries("Friends");
net.addWebSeries("Big Bang Theory");
net.addWebSeries("Young Sheldon");
net.addWebSeries("Gilmore Girls");
net.addWebSeries("Gossip Girl");
net.addWebSeries("Stranger Thing");
net.addWebSeries("Hello Baccho");
net.addWebSeries("Taskare");
net.addWebSeries("Breaking Bad");
net.addWebSeries("Good Doctor");
net.addWebSeries("XOXO Kitty");
net.addWebSeries("Finding Her Edge");
net.addWebSeries("The Rookie");
net.addWebSeries("Suits");
net.addWebSeries("Night Agent");

net.getWebSeries();
net.getWebSeriesByIndex(8);
net.getIndexByWebSeries("RAW");
net.updateWebSeries("Stranger Thing", "Stranger Things");
net.getWebSeries();
net.deleteWebSeries("Suits");
net.getWebSeries();
}

}