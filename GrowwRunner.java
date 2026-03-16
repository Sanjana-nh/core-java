class GrowwRunner {
    public static void main(String[] args) {
        
        Groww g1 = new Groww();
        g1.accountHolderName = "Rahul"; g1.dematAccountNumber = "12081500001";
        Stock s1 = new Stock();
        s1.stockSymbol = "RELIANCE"; s1.companyName = "Reliance Industries"; s1.currentPrice = 2950.0; s1.marketCapCr = 1980000.0; s1.peRatio = 28.5; s1.dividendYield = 0.3; s1.sector = "Energy"; s1.isNifty50 = true; s1.week52High = 3000.0; s1.week52Low = 2200.0;
        g1.stock = s1; g1.getGrowwDetails();

        Groww g2 = new Groww();
        g2.accountHolderName = "Priya"; g2.dematAccountNumber = "12081500002";
        Stock s2 = new Stock();
        s2.stockSymbol = "TCS"; s2.companyName = "Tata Consultancy Services"; s2.currentPrice = 4100.0; s2.marketCapCr = 1500000.0; s2.peRatio = 32.1; s2.dividendYield = 1.2; s2.sector = "IT"; s2.isNifty50 = true; s2.week52High = 4200.0; s2.week52Low = 3100.0;
        g2.stock = s2; g2.getGrowwDetails();

        Groww g3 = new Groww();
        g3.accountHolderName = "Amit"; g3.dematAccountNumber = "12081500003";
        Stock s3 = new Stock();
        s3.stockSymbol = "HDFCBANK"; s3.companyName = "HDFC Bank"; s3.currentPrice = 1450.0; s3.marketCapCr = 1100000.0; s3.peRatio = 15.5; s3.dividendYield = 1.0; s3.sector = "Banking"; s3.isNifty50 = true; s3.week52High = 1750.0; s3.week52Low = 1380.0;
        g3.stock = s3; g3.getGrowwDetails();

        Groww g4 = new Groww();
        g4.accountHolderName = "Neha"; g4.dematAccountNumber = "12081500004";
        Stock s4 = new Stock();
        s4.stockSymbol = "INFY"; s4.companyName = "Infosys"; s4.currentPrice = 1600.0; s4.marketCapCr = 660000.0; s4.peRatio = 25.0; s4.dividendYield = 2.1; s4.sector = "IT"; s4.isNifty50 = true; s4.week52High = 1730.0; s4.week52Low = 1215.0;
        g4.stock = s4; g4.getGrowwDetails();

        Groww g5 = new Groww();
        g5.accountHolderName = "Vikram"; g5.dematAccountNumber = "12081500005";
        Stock s5 = new Stock();
        s5.stockSymbol = "ICICIBANK"; s5.companyName = "ICICI Bank"; s5.currentPrice = 1080.0; s5.marketCapCr = 750000.0; s5.peRatio = 18.2; s5.dividendYield = 0.8; s5.sector = "Banking"; s5.isNifty50 = true; s5.week52High = 1100.0; s5.week52Low = 800.0;
        g5.stock = s5; g5.getGrowwDetails();

        Groww g6 = new Groww();
        g6.accountHolderName = "Sneha"; g6.dematAccountNumber = "12081500006";
        Stock s6 = new Stock();
        s6.stockSymbol = "SBI"; s6.companyName = "State Bank of India"; s6.currentPrice = 750.0; s6.marketCapCr = 650000.0; s6.peRatio = 10.5; s6.dividendYield = 1.5; s6.sector = "Banking"; s6.isNifty50 = true; s6.week52High = 775.0; s6.week52Low = 500.0;
        g6.stock = s6; g6.getGrowwDetails();

        Groww g7 = new Groww();
        g7.accountHolderName = "Karthik"; g7.dematAccountNumber = "12081500007";
        Stock s7 = new Stock();
        s7.stockSymbol = "BHARTIARTL"; s7.companyName = "Bharti Airtel"; s7.currentPrice = 1200.0; s7.marketCapCr = 680000.0; s7.peRatio = 55.0; s7.dividendYield = 0.4; s7.sector = "Telecom"; s7.isNifty50 = true; s7.week52High = 1250.0; s7.week52Low = 750.0;
        g7.stock = s7; g7.getGrowwDetails();

        Groww g8 = new Groww();
        g8.accountHolderName = "Manoj"; g8.dematAccountNumber = "12081500008";
        Stock s8 = new Stock();
        s8.stockSymbol = "ITC"; s8.companyName = "ITC Ltd"; s8.currentPrice = 420.0; s8.marketCapCr = 520000.0; s8.peRatio = 26.0; s8.dividendYield = 3.5; s8.sector = "FMCG"; s8.isNifty50 = true; s8.week52High = 499.0; s8.week52Low = 370.0;
        g8.stock = s8; g8.getGrowwDetails();

        Groww g9 = new Groww();
        g9.accountHolderName = "Ravi"; g9.dematAccountNumber = "12081500009";
        Stock s9 = new Stock();
        s9.stockSymbol = "LT"; s9.companyName = "Larsen & Toubro"; s9.currentPrice = 3600.0; s9.marketCapCr = 490000.0; s9.peRatio = 38.0; s9.dividendYield = 0.7; s9.sector = "Infrastructure"; s9.isNifty50 = true; s9.week52High = 3750.0; s9.week52Low = 2100.0;
        g9.stock = s9; g9.getGrowwDetails();

        Groww g10 = new Groww();
        g10.accountHolderName = "Suresh"; g10.dematAccountNumber = "12081500010";
        Stock s10 = new Stock();
        s10.stockSymbol = "BAJFINANCE"; s10.companyName = "Bajaj Finance"; s10.currentPrice = 7000.0; s10.marketCapCr = 430000.0; s10.peRatio = 30.5; s10.dividendYield = 0.5; s10.sector = "NBFC"; s10.isNifty50 = true; s10.week52High = 8192.0; s10.week52Low = 5500.0;
        g10.stock = s10; g10.getGrowwDetails();

        Groww g11 = new Groww();
        g11.accountHolderName = "Anil"; g11.dematAccountNumber = "12081500011";
        Stock s11 = new Stock();
        s11.stockSymbol = "WIPRO"; s11.companyName = "Wipro Ltd"; s11.currentPrice = 500.0; s11.marketCapCr = 260000.0; s11.peRatio = 22.0; s11.dividendYield = 0.2; s11.sector = "IT"; s11.isNifty50 = true; s11.week52High = 540.0; s11.week52Low = 350.0;
        g11.stock = s11; g11.getGrowwDetails();

        Groww g12 = new Groww();
        g12.accountHolderName = "Deepak"; g12.dematAccountNumber = "12081500012";
        Stock s12 = new Stock();
        s12.stockSymbol = "HCLTECH"; s12.companyName = "HCL Technologies"; s12.currentPrice = 1600.0; s12.marketCapCr = 430000.0; s12.peRatio = 26.5; s12.dividendYield = 2.5; s12.sector = "IT"; s12.isNifty50 = true; s12.week52High = 1680.0; s12.week52Low = 1015.0;
        g12.stock = s12; g12.getGrowwDetails();

        Groww g13 = new Groww();
        g13.accountHolderName = "Gowda"; g13.dematAccountNumber = "12081500013";
        Stock s13 = new Stock();
        s13.stockSymbol = "MARUTI"; s13.companyName = "Maruti Suzuki"; s13.currentPrice = 11500.0; s13.marketCapCr = 360000.0; s13.peRatio = 30.0; s13.dividendYield = 0.9; s13.sector = "Automobile"; s13.isNifty50 = true; s13.week52High = 12000.0; s13.week52Low = 8000.0;
        g13.stock = s13; g13.getGrowwDetails();

        Groww g14 = new Groww();
        g14.accountHolderName = "Arjun"; g14.dematAccountNumber = "12081500014";
        Stock s14 = new Stock();
        s14.stockSymbol = "ASIANPAINT"; s14.companyName = "Asian Paints"; s14.currentPrice = 2800.0; s14.marketCapCr = 270000.0; s14.peRatio = 50.0; s14.dividendYield = 0.8; s14.sector = "Consumer Goods"; s14.isNifty50 = true; s14.week52High = 3500.0; s14.week52Low = 2700.0;
        g14.stock = s14; g14.getGrowwDetails();

        Groww g15 = new Groww();
        g15.accountHolderName = "Vinay"; g15.dematAccountNumber = "12081500015";
        Stock s15 = new Stock();
        s15.stockSymbol = "TATAMOTORS"; s15.companyName = "Tata Motors"; s15.currentPrice = 950.0; s15.marketCapCr = 310000.0; s15.peRatio = 16.0; s15.dividendYield = 0.2; s15.sector = "Automobile"; s15.isNifty50 = true; s15.week52High = 1000.0; s15.week52Low = 400.0;
        g15.stock = s15; g15.getGrowwDetails();

        Groww g16 = new Groww();
        g16.accountHolderName = "Aditi"; g16.dematAccountNumber = "12081500016";
        Stock s16 = new Stock();
        s16.stockSymbol = "SUNPHARMA"; s16.companyName = "Sun Pharmaceuticals"; s16.currentPrice = 1500.0; s16.marketCapCr = 360000.0; s16.peRatio = 35.0; s16.dividendYield = 0.8; s16.sector = "Pharma"; s16.isNifty50 = true; s16.week52High = 1600.0; s16.week52Low = 950.0;
        g16.stock = s16; g16.getGrowwDetails();

        Groww g17 = new Groww();
        g17.accountHolderName = "Pooja"; g17.dematAccountNumber = "12081500017";
        Stock s17 = new Stock();
        s17.stockSymbol = "TITAN"; s17.companyName = "Titan Company"; s17.currentPrice = 3600.0; s17.marketCapCr = 320000.0; s17.peRatio = 80.0; s17.dividendYield = 0.3; s17.sector = "Consumer Durables"; s17.isNifty50 = true; s17.week52High = 3800.0; s17.week52Low = 2300.0;
        g17.stock = s17; g17.getGrowwDetails();

        Groww g18 = new Groww();
        g18.accountHolderName = "Ashok"; g18.dematAccountNumber = "12081500018";
        Stock s18 = new Stock();
        s18.stockSymbol = "ULTRACEMCO"; s18.companyName = "UltraTech Cement"; s18.currentPrice = 9800.0; s18.marketCapCr = 280000.0; s18.peRatio = 40.0; s18.dividendYield = 0.4; s18.sector = "Cement"; s18.isNifty50 = true; s18.week52High = 10500.0; s18.week52Low = 7000.0;
        g18.stock = s18; g18.getGrowwDetails();

        Groww g19 = new Groww();
        g19.accountHolderName = "Kiran"; g19.dematAccountNumber = "12081500019";
        Stock s19 = new Stock();
        s19.stockSymbol = "NTPC"; s19.companyName = "NTPC Ltd"; s19.currentPrice = 320.0; s19.marketCapCr = 310000.0; s19.peRatio = 15.0; s19.dividendYield = 2.5; s19.sector = "Power"; s19.isNifty50 = true; s19.week52High = 340.0; s19.week52Low = 160.0;
        g19.stock = s19; g19.getGrowwDetails();

        Groww g20 = new Groww();
        g20.accountHolderName = "Sanjay"; g20.dematAccountNumber = "12081500020";
        Stock s20 = new Stock();
        s20.stockSymbol = "M&M"; s20.companyName = "Mahindra & Mahindra"; s20.currentPrice = 1900.0; s20.marketCapCr = 230000.0; s20.peRatio = 20.0; s20.dividendYield = 1.0; s20.sector = "Automobile"; s20.isNifty50 = true; s20.week52High = 2000.0; s20.week52Low = 1100.0;
        g20.stock = s20; g20.getGrowwDetails();
    }
}