class VVPuramRunner {
    public static void main(String[] args) {
        
        VVPuram v1 = new VVPuram();
        v1.zoneName = "Thindi Beedi Main"; v1.parkingAvailable = false;
        FoodStreet f1 = new FoodStreet();
        f1.stallNumber = 1; f1.stallName = "VB Bakery"; f1.signatureDish = "Congress Bun"; f1.priceRs = 45.0; f1.isPureVeg = true; f1.rating = 4.8; f1.ownerName = "Thirumalachar"; f1.openingTimePM = "3:00 PM"; f1.closingTimePM = "10:30 PM"; f1.isCrowded = true;
        v1.foodStreet = f1; v1.getVVPuramDetails();

        VVPuram v2 = new VVPuram();
        v2.zoneName = "Thindi Beedi Main"; v2.parkingAvailable = false;
        FoodStreet f2 = new FoodStreet();
        f2.stallNumber = 2; f2.stallName = "Shivanna Gulkand Center"; f2.signatureDish = "Gulkand with Ice Cream"; f2.priceRs = 80.0; f2.isPureVeg = true; f2.rating = 4.9; f2.ownerName = "Shivanna"; f2.openingTimePM = "6:00 PM"; f2.closingTimePM = "11:30 PM"; f2.isCrowded = true;
        v2.foodStreet = f2; v2.getVVPuramDetails();

        VVPuram v3 = new VVPuram();
        v3.zoneName = "Dosa Corner"; v3.parkingAvailable = false;
        FoodStreet f3 = new FoodStreet();
        f3.stallNumber = 3; f3.stallName = "Ramakrishna Lodge Area"; f3.signatureDish = "Bath Masala Dosa"; f3.priceRs = 70.0; f3.isPureVeg = true; f3.rating = 4.7; f3.ownerName = "Ramesh"; f3.openingTimePM = "5:30 PM"; f3.closingTimePM = "11:00 PM"; f3.isCrowded = true;
        v3.foodStreet = f3; v3.getVVPuramDetails();

        VVPuram v4 = new VVPuram();
        v4.zoneName = "Chat Section"; v4.parkingAvailable = false;
        FoodStreet f4 = new FoodStreet();
        f4.stallNumber = 4; f4.stallName = "Sri Vasavi Condiments"; f4.signatureDish = "Avarekalu Mixture"; f4.priceRs = 150.0; f4.isPureVeg = true; f4.rating = 4.6; f4.ownerName = "Srinivas"; f4.openingTimePM = "4:00 PM"; f4.closingTimePM = "10:00 PM"; f4.isCrowded = true;
        v4.foodStreet = f4; v4.getVVPuramDetails();

        VVPuram v5 = new VVPuram();
        v5.zoneName = "Thindi Beedi Main"; v5.parkingAvailable = false;
        FoodStreet f5 = new FoodStreet();
        f5.stallNumber = 5; f5.stallName = "Dev Sagar"; f5.signatureDish = "Rasgulla Chaat"; f5.priceRs = 60.0; f5.isPureVeg = true; f5.rating = 4.5; f5.ownerName = "Dev"; f5.openingTimePM = "6:00 PM"; f5.closingTimePM = "11:30 PM"; f5.isCrowded = true;
        v5.foodStreet = f5; v5.getVVPuramDetails();

        VVPuram v6 = new VVPuram();
        v6.zoneName = "South End"; v6.parkingAvailable = false;
        FoodStreet f6 = new FoodStreet();
        f6.stallNumber = 6; f6.stallName = "Idli Mane"; f6.signatureDish = "Thatte Idli"; f6.priceRs = 40.0; f6.isPureVeg = true; f6.rating = 4.4; f6.ownerName = "Kumar"; f6.openingTimePM = "5:00 PM"; f6.closingTimePM = "11:00 PM"; f6.isCrowded = false;
        v6.foodStreet = f6; v6.getVVPuramDetails();

        VVPuram v7 = new VVPuram();
        v7.zoneName = "Thindi Beedi Main"; v7.parkingAvailable = false;
        FoodStreet f7 = new FoodStreet();
        f7.stallNumber = 7; f7.stallName = "Bhajji Shop"; f7.signatureDish = "Capsicum Bhajji"; f7.priceRs = 30.0; f7.isPureVeg = true; f7.rating = 4.7; f7.ownerName = "Raju"; f7.openingTimePM = "5:30 PM"; f7.closingTimePM = "11:00 PM"; f7.isCrowded = true;
        v7.foodStreet = f7; v7.getVVPuramDetails();

        VVPuram v8 = new VVPuram();
        v8.zoneName = "Sweet Lane"; v8.parkingAvailable = false;
        FoodStreet f8 = new FoodStreet();
        f8.stallNumber = 8; f8.stallName = "Jalebi Center"; f8.signatureDish = "Hot Jalebi with Rabdi"; f8.priceRs = 50.0; f8.isPureVeg = true; f8.rating = 4.8; f8.ownerName = "Sharma"; f8.openingTimePM = "6:00 PM"; f8.closingTimePM = "11:30 PM"; f8.isCrowded = true;
        v8.foodStreet = f8; v8.getVVPuramDetails();

        VVPuram v9 = new VVPuram();
        v9.zoneName = "Chat Section"; v9.parkingAvailable = false;
        FoodStreet f9 = new FoodStreet();
        f9.stallNumber = 9; f9.stallName = "Bangarpet Chats"; f9.signatureDish = "Pani Puri"; f9.priceRs = 40.0; f9.isPureVeg = true; f9.rating = 4.5; f9.ownerName = "Venkat"; f9.openingTimePM = "5:00 PM"; f9.closingTimePM = "11:00 PM"; f9.isCrowded = true;
        v9.foodStreet = f9; v9.getVVPuramDetails();

        VVPuram v10 = new VVPuram();
        v10.zoneName = "Thindi Beedi Main"; v10.parkingAvailable = false;
        FoodStreet f10 = new FoodStreet();
        f10.stallNumber = 10; f10.stallName = "Ramu Tiffin Centre"; f10.signatureDish = "Ghee Masala Dosa"; f10.priceRs = 80.0; f10.isPureVeg = true; f10.rating = 4.9; f10.ownerName = "Ramu"; f10.openingTimePM = "6:30 PM"; f10.closingTimePM = "11:30 PM"; f10.isCrowded = true;
        v10.foodStreet = f10; v10.getVVPuramDetails();

        VVPuram v11 = new VVPuram();
        v11.zoneName = "Beverage Corner"; v11.parkingAvailable = false;
        FoodStreet f11 = new FoodStreet();
        f11.stallNumber = 11; f11.stallName = "Badam Milk Stall"; f11.signatureDish = "Hot Badam Milk"; f11.priceRs = 35.0; f11.isPureVeg = true; f11.rating = 4.6; f11.ownerName = "Gowda"; f11.openingTimePM = "6:00 PM"; f11.closingTimePM = "11:00 PM"; f11.isCrowded = true;
        v11.foodStreet = f11; v11.getVVPuramDetails();

        VVPuram v12 = new VVPuram();
        v12.zoneName = "North Indian Corner"; v12.parkingAvailable = false;
        FoodStreet f12 = new FoodStreet();
        f12.stallNumber = 12; f12.stallName = "Paratha Plaza"; f12.signatureDish = "Aloo Paratha"; f12.priceRs = 60.0; f12.isPureVeg = true; f12.rating = 4.3; f12.ownerName = "Singh"; f12.openingTimePM = "6:00 PM"; f12.closingTimePM = "11:00 PM"; f12.isCrowded = false;
        v12.foodStreet = f12; v12.getVVPuramDetails();

        VVPuram v13 = new VVPuram();
        v13.zoneName = "Thindi Beedi Main"; v13.parkingAvailable = false;
        FoodStreet f13 = new FoodStreet();
        f13.stallNumber = 13; f13.stallName = "Paddus Cart"; f13.signatureDish = "Kuzhi Paniyaram (Paddu)"; f13.priceRs = 40.0; f13.isPureVeg = true; f13.rating = 4.7; f13.ownerName = "Laxmi"; f13.openingTimePM = "5:30 PM"; f13.closingTimePM = "10:30 PM"; f13.isCrowded = true;
        v13.foodStreet = f13; v13.getVVPuramDetails();

        VVPuram v14 = new VVPuram();
        v14.zoneName = "Sweet Lane"; v14.parkingAvailable = false;
        FoodStreet f14 = new FoodStreet();
        f14.stallNumber = 14; f14.stallName = "Holige Mane"; f14.signatureDish = "Obbattu (Holige)"; f14.priceRs = 25.0; f14.isPureVeg = true; f14.rating = 4.8; f14.ownerName = "Narasimha"; f14.openingTimePM = "4:00 PM"; f14.closingTimePM = "10:30 PM"; f14.isCrowded = true;
        v14.foodStreet = f14; v14.getVVPuramDetails();

        VVPuram v15 = new VVPuram();
        v15.zoneName = "Snack Area"; v15.parkingAvailable = false;
        FoodStreet f15 = new FoodStreet();
        f15.stallNumber = 15; f15.stallName = "Twister Potato"; f15.signatureDish = "Peri Peri Potato Twister"; f15.priceRs = 60.0; f15.isPureVeg = true; f15.rating = 4.2; f15.ownerName = "Arjun"; f15.openingTimePM = "6:00 PM"; f15.closingTimePM = "11:00 PM"; f15.isCrowded = true;
        v15.foodStreet = f15; v15.getVVPuramDetails();

        VVPuram v16 = new VVPuram();
        v16.zoneName = "Thindi Beedi Main"; v16.parkingAvailable = false;
        FoodStreet f16 = new FoodStreet();
        f16.stallNumber = 16; f16.stallName = "Akki Rotti Stall"; f16.signatureDish = "Akki Rotti with Chutney"; f16.priceRs = 45.0; f16.isPureVeg = true; f16.rating = 4.6; f16.ownerName = "Shankar"; f16.openingTimePM = "6:00 PM"; f16.closingTimePM = "11:00 PM"; f16.isCrowded = true;
        v16.foodStreet = f16; v16.getVVPuramDetails();

        VVPuram v17 = new VVPuram();
        v17.zoneName = "Dessert Section"; v17.parkingAvailable = false;
        FoodStreet f17 = new FoodStreet();
        f17.stallNumber = 17; f17.stallName = "Fruit Salad Point"; f17.signatureDish = "Mixed Fruit Salad with Ice Cream"; f17.priceRs = 70.0; f17.isPureVeg = true; f17.rating = 4.5; f17.ownerName = "Vinay"; f17.openingTimePM = "7:00 PM"; f17.closingTimePM = "11:30 PM"; f17.isCrowded = false;
        v17.foodStreet = f17; v17.getVVPuramDetails();

        VVPuram v18 = new VVPuram();
        v18.zoneName = "Thindi Beedi Main"; v18.parkingAvailable = false;
        FoodStreet f18 = new FoodStreet();
        f18.stallNumber = 18; f18.stallName = "Sweet Corn Corner"; f18.signatureDish = "Masala Sweet Corn"; f18.priceRs = 40.0; f18.isPureVeg = true; f18.rating = 4.1; f18.ownerName = "Manju"; f18.openingTimePM = "5:00 PM"; f18.closingTimePM = "10:30 PM"; f18.isCrowded = false;
        v18.foodStreet = f18; v18.getVVPuramDetails();

        VVPuram v19 = new VVPuram();
        v19.zoneName = "Chinese Cart Area"; v19.parkingAvailable = false;
        FoodStreet f19 = new FoodStreet();
        f19.stallNumber = 19; f19.stallName = "Desi Chinese"; f19.signatureDish = "Gobi Manchurian"; f19.priceRs = 70.0; f19.isPureVeg = true; f19.rating = 4.4; f19.ownerName = "Kiran"; f19.openingTimePM = "6:00 PM"; f19.closingTimePM = "11:30 PM"; f19.isCrowded = true;
        v19.foodStreet = f19; v19.getVVPuramDetails();

        VVPuram v20 = new VVPuram();
        v20.zoneName = "Thindi Beedi Main"; v20.parkingAvailable = false;
        FoodStreet f20 = new FoodStreet();
        f20.stallNumber = 20; f20.stallName = "Avarekalu Mela Stall"; f20.signatureDish = "Avarekalu Dosa"; f20.priceRs = 60.0; f20.isPureVeg = true; f20.rating = 4.9; f20.ownerName = "Vasavi Group"; f20.openingTimePM = "5:00 PM"; f20.closingTimePM = "11:00 PM"; f20.isCrowded = true;
        v20.foodStreet = f20; v20.getVVPuramDetails();
    }
}