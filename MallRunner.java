class MallRunner {
    public static void main(String[] args) {
        Shop s1 = new Shop("G-12", "Zara", "Apparel", 0, 5500.0, 250000.0, 25, true, "Rahul", "9876543210");
        Mall m1 = new Mall("Phoenix Marketcity", "Whitefield", s1); m1.displayDetails();

        Shop s2 = new Shop("F-45", "Westside", "Dept Store", 1, 4200.0, 180000.0, 15, true, "Sneha", "9876543211");
        Mall m2 = new Mall("Orion Mall", "Rajajinagar", s2); m2.displayDetails();

        Shop s3 = new Shop("S-10", "Shoppers Stop", "Retail", 2, 8000.0, 400000.0, 40, true, "Karthik", "9876543212");
        Mall m3 = new Mall("Mantri Square", "Malleshwaram", s3); m3.displayDetails();

        Shop s4 = new Shop("G-01", "Louis Vuitton", "Luxury", 0, 2000.0, 500000.0, 8, true, "Aditi", "9876543213");
        Mall m4 = new Mall("UB City", "Vittal Mallya Road", s4); m4.displayDetails();

        Shop s5 = new Shop("T-05", "Landmark", "Books", 3, 3500.0, 150000.0, 12, true, "Vikram", "9876543214");
        Mall m5 = new Mall("Forum Mall", "Koramangala", s5); m5.displayDetails();

        Shop s6 = new Shop("G-22", "H&M", "Apparel", 0, 6000.0, 300000.0, 30, true, "Pooja", "9876543215");
        Mall m6 = new Mall("Garuda Mall", "Magrath Road", s6); m6.displayDetails();

        Shop s7 = new Shop("F-11", "MAC", "Beauty", 1, 800.0, 90000.0, 4, true, "Nisha", "9876543216");
        Mall m7 = new Mall("Vega City", "JP Nagar", s7); m7.displayDetails();

        Shop s8 = new Shop("LG-01", "Lulu Hypermarket", "Grocery", -1, 15000.0, 800000.0, 100, true, "Anil", "9876543217");
        Mall m8 = new Mall("Lulu Mall", "Rajajinagar", s8); m8.displayDetails();

        Shop s9 = new Shop("S-23", "Puma", "Sports", 2, 1500.0, 120000.0, 6, true, "Deepak", "9876543218");
        Mall m9 = new Mall("VR Bengaluru", "Whitefield", s9); m9.displayDetails();

        Shop s10 = new Shop("G-08", "Starbucks", "Cafe", 0, 1200.0, 150000.0, 10, true, "Suresh", "9876543219");
        Mall m10 = new Mall("Nexus Shantiniketan", "Whitefield", s10); m10.displayDetails();

        Shop s11 = new Shop("F-02", "Reliance Trends", "Clothing", 1, 3000.0, 110000.0, 12, true, "Manoj", "9876543220");
        Mall m11 = new Mall("Gopalan Arcade", "RR Nagar", s11); m11.displayDetails();

        Shop s12 = new Shop("S-14", "Max Fashion", "Apparel", 2, 4000.0, 140000.0, 18, true, "Ravi", "9876543221");
        Mall m12 = new Mall("Elements Mall", "Nagavara", s12); m12.displayDetails();

        Shop s13 = new Shop("G-33", "Levi's", "Denim", 0, 1800.0, 130000.0, 7, true, "Arjun", "9876543222");
        Mall m13 = new Mall("Inorbit", "Whitefield", s13); m13.displayDetails();

        Shop s14 = new Shop("T-01", "Croma", "Electronics", 3, 6500.0, 280000.0, 22, true, "Vinay", "9876543223");
        Mall m14 = new Mall("Royal Meenakshi", "Bannerghatta Rd", s14); m14.displayDetails();

        Shop s15 = new Shop("F-25", "Bata", "Footwear", 1, 1000.0, 80000.0, 5, true, "Neha", "9876543224");
        Mall m15 = new Mall("Bangalore Central", "Bellandur", s15); m15.displayDetails();

        Shop s16 = new Shop("G-19", "Pantaloons", "Clothing", 0, 5000.0, 200000.0, 20, true, "Prakash", "9876543225");
        Mall m16 = new Mall("GT World", "Magadi Road", s16); m16.displayDetails();

        Shop s17 = new Shop("S-08", "Lifestyle", "Dept Store", 2, 7000.0, 320000.0, 35, true, "Kiran", "9876543226");
        Mall m17 = new Mall("Bharatiya City", "Thanisandra", s17); m17.displayDetails();

        Shop s18 = new Shop("LG-05", "Spar", "Supermarket", -1, 10000.0, 450000.0, 50, true, "Ramesh", "9876543227");
        Mall m18 = new Mall("Oasis Centre", "Koramangala", s18); m18.displayDetails();

        Shop s19 = new Shop("F-15", "Woodland", "Shoes", 1, 1200.0, 95000.0, 6, true, "Sanjay", "9876543228");
        Mall m19 = new Mall("Esteem Mall", "Hebbal", s19); m19.displayDetails();

        Shop s20 = new Shop("G-07", "Body Shop", "Skincare", 0, 600.0, 85000.0, 3, true, "Kavya", "9876543229");
        Mall m20 = new Mall("1MG Lido", "Trinity Circle", s20); m20.displayDetails();
    }
}