class Stock {
    String stockSymbol;
    String companyName;
    double currentPrice;
    double marketCapCr;
    double peRatio;
    double dividendYield;
    String sector;
    boolean isNifty50;
    double week52High;
    double week52Low;

    public void getStockDetails() {
        System.out.println("------------------------");
        System.out.println("The Stock Details are:");
        System.out.println("Symbol : " + stockSymbol);
        System.out.println("Company : " + companyName);
        System.out.println("Price (Rs) : " + currentPrice);
        System.out.println("Market Cap (Cr) : " + marketCapCr);
        System.out.println("P/E Ratio : " + peRatio);
        System.out.println("Div Yield (%) : " + dividendYield);
        System.out.println("Sector : " + sector);
        System.out.println("Is Nifty50 : " + isNifty50);
        System.out.println("52W High : " + week52High);
        System.out.println("52W Low : " + week52Low);
    }
}



