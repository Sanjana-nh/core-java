class MallRunner {
    public static void main(String[] args) {
        
        Mall mall1 = new Mall();
        mall1.mallName = "Phoenix Marketcity";
        mall1.location = "Whitefield";
        
        Shop shop1 = new Shop();
        shop1.shopNumber = "G-12";
        shop1.shopName = "Zara";
        shop1.category = "Apparel";
        shop1.floorNumber = 0;
        shop1.areaInSqFt = 5500.0;
        shop1.monthlyRent = 250000.0;
        shop1.numberOfEmployees = 25;
        shop1.isAirConditioned = true;
        shop1.managerName = "Rahul";
        shop1.contactNumber = "9876543210";
        
        mall1.shop = shop1;
        mall1.getMallDetails();

        Mall mall2 = new Mall();
        mall2.mallName = "Orion Mall";
        mall2.location = "Rajajinagar";
        
        Shop shop2 = new Shop();
        shop2.shopNumber = "F-45";
        shop2.shopName = "Westside";
        shop2.category = "Department Store";
        shop2.floorNumber = 1;
        shop2.areaInSqFt = 4200.0;
        shop2.monthlyRent = 180000.0;
        shop2.numberOfEmployees = 15;
        shop2.isAirConditioned = true;
        shop2.managerName = "Sneha";
        shop2.contactNumber = "9876543211";
        
        mall2.shop = shop2;
        mall2.getMallDetails();

        Mall mall3 = new Mall();
        mall3.mallName = "Mantri Square";
        mall3.location = "Malleshwaram";
        
        Shop shop3 = new Shop();
        shop3.shopNumber = "S-10";
        shop3.shopName = "Shoppers Stop";
        shop3.category = "Retail";
        shop3.floorNumber = 2;
        shop3.areaInSqFt = 8000.0;
        shop3.monthlyRent = 400000.0;
        shop3.numberOfEmployees = 40;
        shop3.isAirConditioned = true;
        shop3.managerName = "Karthik";
        shop3.contactNumber = "9876543212";
        
        mall3.shop = shop3;
        mall3.getMallDetails();

        Mall mall4 = new Mall();
        mall4.mallName = "UB City";
        mall4.location = "Vittal Mallya Road";
        
        Shop shop4 = new Shop();
        shop4.shopNumber = "G-01";
        shop4.shopName = "Louis Vuitton";
        shop4.category = "Luxury Bags";
        shop4.floorNumber = 0;
        shop4.areaInSqFt = 2000.0;
        shop4.monthlyRent = 500000.0;
        shop4.numberOfEmployees = 8;
        shop4.isAirConditioned = true;
        shop4.managerName = "Aditi";
        shop4.contactNumber = "9876543213";
        
        mall4.shop = shop4;
        mall4.getMallDetails();

        Mall mall5 = new Mall();
        mall5.mallName = "Forum Mall";
        mall5.location = "Koramangala";
        
        Shop shop5 = new Shop();
        shop5.shopNumber = "T-05";
        shop5.shopName = "Landmark";
        shop5.category = "Books & Gifts";
        shop5.floorNumber = 3;
        shop5.areaInSqFt = 3500.0;
        shop5.monthlyRent = 150000.0;
        shop5.numberOfEmployees = 12;
        shop5.isAirConditioned = true;
        shop5.managerName = "Vikram";
        shop5.contactNumber = "9876543214";
        
        mall5.shop = shop5;
        mall5.getMallDetails();

        Mall mall6 = new Mall();
        mall6.mallName = "Garuda Mall";
        mall6.location = "Magrath Road";
        
        Shop shop6 = new Shop();
        shop6.shopNumber = "G-22";
        shop6.shopName = "H&M";
        shop6.category = "Apparel";
        shop6.floorNumber = 0;
        shop6.areaInSqFt = 6000.0;
        shop6.monthlyRent = 300000.0;
        shop6.numberOfEmployees = 30;
        shop6.isAirConditioned = true;
        shop6.managerName = "Pooja";
        shop6.contactNumber = "9876543215";
        
        mall6.shop = shop6;
        mall6.getMallDetails();

        Mall mall7 = new Mall();
        mall7.mallName = "Vega City Mall";
        mall7.location = "JP Nagar";
        
        Shop shop7 = new Shop();
        shop7.shopNumber = "F-11";
        shop7.shopName = "MAC Cosmetics";
        shop7.category = "Beauty";
        shop7.floorNumber = 1;
        shop7.areaInSqFt = 800.0;
        shop7.monthlyRent = 90000.0;
        shop7.numberOfEmployees = 4;
        shop7.isAirConditioned = true;
        shop7.managerName = "Nisha";
        shop7.contactNumber = "9876543216";
        
        mall7.shop = shop7;
        mall7.getMallDetails();

        Mall mall8 = new Mall();
        mall8.mallName = "Lulu Mall";
        mall8.location = "Rajajinagar";
        
        Shop shop8 = new Shop();
        shop8.shopNumber = "LG-01";
        shop8.shopName = "Lulu Hypermarket";
        shop8.category = "Groceries";
        shop8.floorNumber = -1;
        shop8.areaInSqFt = 15000.0;
        shop8.monthlyRent = 800000.0;
        shop8.numberOfEmployees = 100;
        shop8.isAirConditioned = true;
        shop8.managerName = "Anil";
        shop8.contactNumber = "9876543217";
        
        mall8.shop = shop8;
        mall8.getMallDetails();

        Mall mall9 = new Mall();
        mall9.mallName = "VR Bengaluru";
        mall9.location = "Whitefield";
        
        Shop shop9 = new Shop();
        shop9.shopNumber = "S-23";
        shop9.shopName = "Puma";
        shop9.category = "Sports Wear";
        shop9.floorNumber = 2;
        shop9.areaInSqFt = 1500.0;
        shop9.monthlyRent = 120000.0;
        shop9.numberOfEmployees = 6;
        shop9.isAirConditioned = true;
        shop9.managerName = "Deepak";
        shop9.contactNumber = "9876543218";
        
        mall9.shop = shop9;
        mall9.getMallDetails();

        Mall mall10 = new Mall();
        mall10.mallName = "Nexus Shantiniketan";
        mall10.location = "Whitefield";
        
        Shop shop10 = new Shop();
        shop10.shopNumber = "G-08";
        shop10.shopName = "Starbucks";
        shop10.category = "Cafe";
        shop10.floorNumber = 0;
        shop10.areaInSqFt = 1200.0;
        shop10.monthlyRent = 150000.0;
        shop10.numberOfEmployees = 10;
        shop10.isAirConditioned = true;
        shop10.managerName = "Suresh";
        shop10.contactNumber = "9876543219";
        
        mall10.shop = shop10;
        mall10.getMallDetails();

        Mall mall11 = new Mall();
        mall11.mallName = "Gopalan Arcade";
        mall11.location = "RR Nagar";
        
        Shop shop11 = new Shop();
        shop11.shopNumber = "F-02";
        shop11.shopName = "Reliance Trends";
        shop11.category = "Clothing";
        shop11.floorNumber = 1;
        shop11.areaInSqFt = 3000.0;
        shop11.monthlyRent = 110000.0;
        shop11.numberOfEmployees = 12;
        shop11.isAirConditioned = true;
        shop11.managerName = "Manoj";
        shop11.contactNumber = "9876543220";
        
        mall11.shop = shop11;
        mall11.getMallDetails();

        Mall mall12 = new Mall();
        mall12.mallName = "Elements Mall";
        mall12.location = "Nagavara";
        
        Shop shop12 = new Shop();
        shop12.shopNumber = "S-14";
        shop12.shopName = "Max Fashion";
        shop12.category = "Apparel";
        shop12.floorNumber = 2;
        shop12.areaInSqFt = 4000.0;
        shop12.monthlyRent = 140000.0;
        shop12.numberOfEmployees = 18;
        shop12.isAirConditioned = true;
        shop12.managerName = "Ravi";
        shop12.contactNumber = "9876543221";
        
        mall12.shop = shop12;
        mall12.getMallDetails();

        Mall mall13 = new Mall();
        mall13.mallName = "Inorbit Mall";
        mall13.location = "Whitefield";
        
        Shop shop13 = new Shop();
        shop13.shopNumber = "G-33";
        shop13.shopName = "Levi's";
        shop13.category = "Denim Wear";
        shop13.floorNumber = 0;
        shop13.areaInSqFt = 1800.0;
        shop13.monthlyRent = 130000.0;
        shop13.numberOfEmployees = 7;
        shop13.isAirConditioned = true;
        shop13.managerName = "Arjun";
        shop13.contactNumber = "9876543222";
        
        mall13.shop = shop13;
        mall13.getMallDetails();

        Mall mall14 = new Mall();
        mall14.mallName = "Royal Meenakshi Mall";
        mall14.location = "Bannerghatta Road";
        
        Shop shop14 = new Shop();
        shop14.shopNumber = "T-01";
        shop14.shopName = "Croma";
        shop14.category = "Electronics";
        shop14.floorNumber = 3;
        shop14.areaInSqFt = 6500.0;
        shop14.monthlyRent = 280000.0;
        shop14.numberOfEmployees = 22;
        shop14.isAirConditioned = true;
        shop14.managerName = "Vinay";
        shop14.contactNumber = "9876543223";
        
        mall14.shop = shop14;
        mall14.getMallDetails();

        Mall mall15 = new Mall();
        mall15.mallName = "Bangalore Central";
        mall15.location = "Bellandur";
        
        Shop shop15 = new Shop();
        shop15.shopNumber = "F-25";
        shop15.shopName = "Bata";
        shop15.category = "Footwear";
        shop15.floorNumber = 1;
        shop15.areaInSqFt = 1000.0;
        shop15.monthlyRent = 80000.0;
        shop15.numberOfEmployees = 5;
        shop15.isAirConditioned = true;
        shop15.managerName = "Neha";
        shop15.contactNumber = "9876543224";
        
        mall15.shop = shop15;
        mall15.getMallDetails();

        Mall mall16 = new Mall();
        mall16.mallName = "GT World Mall";
        mall16.location = "Magadi Road";
        
        Shop shop16 = new Shop();
        shop16.shopNumber = "G-19";
        shop16.shopName = "Pantaloons";
        shop16.category = "Clothing";
        shop16.floorNumber = 0;
        shop16.areaInSqFt = 5000.0;
        shop16.monthlyRent = 200000.0;
        shop16.numberOfEmployees = 20;
        shop16.isAirConditioned = true;
        shop16.managerName = "Prakash";
        shop16.contactNumber = "9876543225";
        
        mall16.shop = shop16;
        mall16.getMallDetails();

        Mall mall17 = new Mall();
        mall17.mallName = "Bharatiya City Mall";
        mall17.location = "Thanisandra";
        
        Shop shop17 = new Shop();
        shop17.shopNumber = "S-08";
        shop17.shopName = "Lifestyle";
        shop17.category = "Department Store";
        shop17.floorNumber = 2;
        shop17.areaInSqFt = 7000.0;
        shop17.monthlyRent = 320000.0;
        shop17.numberOfEmployees = 35;
        shop17.isAirConditioned = true;
        shop17.managerName = "Kiran";
        shop17.contactNumber = "9876543226";
        
        mall17.shop = shop17;
        mall17.getMallDetails();

        Mall mall18 = new Mall();
        mall18.mallName = "Oasis Centre";
        mall18.location = "Koramangala";
        
        Shop shop18 = new Shop();
        shop18.shopNumber = "LG-05";
        shop18.shopName = "Spar";
        shop18.category = "Supermarket";
        shop18.floorNumber = -1;
        shop18.areaInSqFt = 10000.0;
        shop18.monthlyRent = 450000.0;
        shop18.numberOfEmployees = 50;
        shop18.isAirConditioned = true;
        shop18.managerName = "Ramesh";
        shop18.contactNumber = "9876543227";
        
        mall18.shop = shop18;
        mall18.getMallDetails();

        Mall mall19 = new Mall();
        mall19.mallName = "Esteem Mall";
        mall19.location = "Hebbal";
        
        Shop shop19 = new Shop();
        shop19.shopNumber = "F-15";
        shop19.shopName = "Woodland";
        shop19.category = "Shoes & Apparel";
        shop19.floorNumber = 1;
        shop19.areaInSqFt = 1200.0;
        shop19.monthlyRent = 95000.0;
        shop19.numberOfEmployees = 6;
        shop19.isAirConditioned = true;
        shop19.managerName = "Sanjay";
        shop19.contactNumber = "9876543228";
        
        mall19.shop = shop19;
        mall19.getMallDetails();

        Mall mall20 = new Mall();
        mall20.mallName = "1MG Lido Mall";
        mall20.location = "Trinity Circle";
        
        Shop shop20 = new Shop();
        shop20.shopNumber = "G-07";
        shop20.shopName = "The Body Shop";
        shop20.category = "Skincare";
        shop20.floorNumber = 0;
        shop20.areaInSqFt = 600.0;
        shop20.monthlyRent = 85000.0;
        shop20.numberOfEmployees = 3;
        shop20.isAirConditioned = true;
        shop20.managerName = "Kavya";
        shop20.contactNumber = "9876543229";
        
        mall20.shop = shop20;
        mall20.getMallDetails();
    }
}