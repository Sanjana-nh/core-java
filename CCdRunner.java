class CCdRunner {
    public static void main(String[] args) {
        
        CCd c1 = new CCd();
        c1.storeLocation = "UB City, Bangalore"; c1.managerName = "Ravi";
        Coffee cof1 = new Coffee();
        cof1.coffeeId = "CF-01"; cof1.coffeeName = "Cafe Frappe"; cof1.size = "Regular"; cof1.priceRs = 220.0; cof1.isHot = false; cof1.milkType = "Whole Milk"; cof1.sweetnessLevel = "Normal"; cof1.calories = 350; cof1.roastType = "Medium"; cof1.hasWhippedCream = true;
        c1.coffee = cof1; c1.getCCdDetails();

        CCd c2 = new CCd();
        c2.storeLocation = "Indiranagar 100ft Road"; c2.managerName = "Priya";
        Coffee cof2 = new Coffee();
        cof2.coffeeId = "CF-02"; cof2.coffeeName = "Cappuccino"; cof2.size = "Large"; cof2.priceRs = 180.0; cof2.isHot = true; cof2.milkType = "Oat Milk"; cof2.sweetnessLevel = "Low"; cof2.calories = 120; cof2.roastType = "Dark"; cof2.hasWhippedCream = false;
        c2.coffee = cof2; c2.getCCdDetails();

        CCd c3 = new CCd();
        c3.storeLocation = "Koramangala 80ft Road"; c3.managerName = "Amit";
        Coffee cof3 = new Coffee();
        cof3.coffeeId = "CF-03"; cof3.coffeeName = "Cafe Mocha"; cof3.size = "Regular"; cof3.priceRs = 200.0; cof3.isHot = true; cof3.milkType = "Whole Milk"; cof3.sweetnessLevel = "Normal"; cof3.calories = 280; cof3.roastType = "Medium"; cof3.hasWhippedCream = true;
        c3.coffee = cof3; c3.getCCdDetails();

        CCd c4 = new CCd();
        c4.storeLocation = "Jayanagar 4th Block"; c4.managerName = "Neha";
        Coffee cof4 = new Coffee();
        cof4.coffeeId = "CF-04"; cof4.coffeeName = "Devil's Own"; cof4.size = "Large"; cof4.priceRs = 280.0; cof4.isHot = false; cof4.milkType = "Whole Milk"; cof4.sweetnessLevel = "High"; cof4.calories = 450; cof4.roastType = "Medium"; cof4.hasWhippedCream = true;
        c4.coffee = cof4; c4.getCCdDetails();

        CCd c5 = new CCd();
        c5.storeLocation = "Malleswaram"; c5.managerName = "Suresh";
        Coffee cof5 = new Coffee();
        cof5.coffeeId = "CF-05"; cof5.coffeeName = "Americano"; cof5.size = "Regular"; cof5.priceRs = 150.0; cof5.isHot = true; cof5.milkType = "None"; cof5.sweetnessLevel = "Zero"; cof5.calories = 15; cof5.roastType = "Dark"; cof5.hasWhippedCream = false;
        c5.coffee = cof5; c5.getCCdDetails();

        CCd c6 = new CCd();
        c6.storeLocation = "Whitefield"; c6.managerName = "Vikram";
        Coffee cof6 = new Coffee();
        cof6.coffeeId = "CF-06"; cof6.coffeeName = "Iced Latte"; cof6.size = "Large"; cof6.priceRs = 190.0; cof6.isHot = false; cof6.milkType = "Soy Milk"; cof6.sweetnessLevel = "Low"; cof6.calories = 90; cof6.roastType = "Medium"; cof6.hasWhippedCream = false;
        c6.coffee = cof6; c6.getCCdDetails();

        CCd c7 = new CCd();
        c7.storeLocation = "BTM Layout"; c7.managerName = "Sneha";
        Coffee cof7 = new Coffee();
        cof7.coffeeId = "CF-07"; cof7.coffeeName = "Macchiato"; cof7.size = "Small"; cof7.priceRs = 160.0; cof7.isHot = true; cof7.milkType = "Whole Milk"; cof7.sweetnessLevel = "Low"; cof7.calories = 70; cof7.roastType = "Espresso"; cof7.hasWhippedCream = false;
        c7.coffee = cof7; c7.getCCdDetails();

        CCd c8 = new CCd();
        c8.storeLocation = "HSR Layout"; c8.managerName = "Karthik";
        Coffee cof8 = new Coffee();
        cof8.coffeeId = "CF-08"; cof8.coffeeName = "Vanilla Frappe"; cof8.size = "Regular"; cof8.priceRs = 230.0; cof8.isHot = false; cof8.milkType = "Whole Milk"; cof8.sweetnessLevel = "High"; cof8.calories = 380; cof8.roastType = "Medium"; cof8.hasWhippedCream = true;
        c8.coffee = cof8; c8.getCCdDetails();

        CCd c9 = new CCd();
        c9.storeLocation = "Electronic City"; c9.managerName = "Gowda";
        Coffee cof9 = new Coffee();
        cof9.coffeeId = "CF-09"; cof9.coffeeName = "Filter Coffee"; cof9.size = "Small"; cof9.priceRs = 100.0; cof9.isHot = true; cof9.milkType = "Whole Milk"; cof9.sweetnessLevel = "Normal"; cof9.calories = 80; cof9.roastType = "Chicory Blend"; cof9.hasWhippedCream = false;
        c9.coffee = cof9; c9.getCCdDetails();

        CCd c10 = new CCd();
        c10.storeLocation = "MG Road"; c10.managerName = "Aditi";
        Coffee cof10 = new Coffee();
        cof10.coffeeId = "CF-10"; cof10.coffeeName = "Caramel Macchiato"; cof10.size = "Large"; cof10.priceRs = 240.0; cof10.isHot = true; cof10.milkType = "Almond Milk"; cof10.sweetnessLevel = "Normal"; cof10.calories = 210; cof10.roastType = "Medium"; cof10.hasWhippedCream = false;
        c10.coffee = cof10; c10.getCCdDetails();

        CCd c11 = new CCd();
        c11.storeLocation = "Brigade Road"; c11.managerName = "Rohan";
        Coffee cof11 = new Coffee();
        cof11.coffeeId = "CF-11"; cof11.coffeeName = "Crunchy Frappe"; cof11.size = "Large"; cof11.priceRs = 260.0; cof11.isHot = false; cof11.milkType = "Whole Milk"; cof11.sweetnessLevel = "High"; cof11.calories = 420; cof11.roastType = "Medium"; cof11.hasWhippedCream = true;
        c11.coffee = cof11; c11.getCCdDetails();

        CCd c12 = new CCd();
        c12.storeLocation = "JP Nagar"; c12.managerName = "Meera";
        Coffee cof12 = new Coffee();
        cof12.coffeeId = "CF-12"; cof12.coffeeName = "Flat White"; cof12.size = "Regular"; cof12.priceRs = 190.0; cof12.isHot = true; cof12.milkType = "Whole Milk"; cof12.sweetnessLevel = "Zero"; cof12.calories = 110; cof12.roastType = "Medium"; cof12.hasWhippedCream = false;
        c12.coffee = cof12; c12.getCCdDetails();

        CCd c13 = new CCd();
        c13.storeLocation = "Bannerghatta Road"; c13.managerName = "Anil";
        Coffee cof13 = new Coffee();
        cof13.coffeeId = "CF-13"; cof13.coffeeName = "Hazelnut Latte"; cof13.size = "Regular"; cof13.priceRs = 210.0; cof13.isHot = true; cof13.milkType = "Skim Milk"; cof13.sweetnessLevel = "Normal"; cof13.calories = 160; cof13.roastType = "Dark"; cof13.hasWhippedCream = false;
        c13.coffee = cof13; c13.getCCdDetails();

        CCd c14 = new CCd();
        c14.storeLocation = "Marathahalli"; c14.managerName = "Pooja";
        Coffee cof14 = new Coffee();
        cof14.coffeeId = "CF-14"; cof14.coffeeName = "Cold Coffee with Ice Cream"; cof14.size = "Large"; cof14.priceRs = 250.0; cof14.isHot = false; cof14.milkType = "Whole Milk"; cof14.sweetnessLevel = "High"; cof14.calories = 390; cof14.roastType = "Medium"; cof14.hasWhippedCream = false;
        c14.coffee = cof14; c14.getCCdDetails();

        CCd c15 = new CCd();
        c15.storeLocation = "Bellandur"; c15.managerName = "Deepak";
        Coffee cof15 = new Coffee();
        cof15.coffeeId = "CF-15"; cof15.coffeeName = "Espresso Shot"; cof15.size = "Small"; cof15.priceRs = 120.0; cof15.isHot = true; cof15.milkType = "None"; cof15.sweetnessLevel = "Zero"; cof15.calories = 5; cof15.roastType = "Espresso"; cof15.hasWhippedCream = false;
        c15.coffee = cof15; c15.getCCdDetails();

        CCd c16 = new CCd();
        c16.storeLocation = "Yelahanka"; c16.managerName = "Sanjay";
        Coffee cof16 = new Coffee();
        cof16.coffeeId = "CF-16"; cof16.coffeeName = "Irish Coffee (Non-Alc)"; cof16.size = "Regular"; cof16.priceRs = 220.0; cof16.isHot = true; cof16.milkType = "Whole Milk"; cof16.sweetnessLevel = "Normal"; cof16.calories = 180; cof16.roastType = "Dark"; cof16.hasWhippedCream = true;
        c16.coffee = cof16; c16.getCCdDetails();

        CCd c17 = new CCd();
        c17.storeLocation = "Sahakar Nagar"; c17.managerName = "Anjali";
        Coffee cof17 = new Coffee();
        cof17.coffeeId = "CF-17"; cof17.coffeeName = "Choco Frappe"; cof17.size = "Large"; cof17.priceRs = 240.0; cof17.isHot = false; cof17.milkType = "Whole Milk"; cof17.sweetnessLevel = "Normal"; cof17.calories = 360; cof17.roastType = "Medium"; cof17.hasWhippedCream = true;
        c17.coffee = cof17; c17.getCCdDetails();

        CCd c18 = new CCd();
        c18.storeLocation = "Kalyan Nagar"; c18.managerName = "Vinay";
        Coffee cof18 = new Coffee();
        cof18.coffeeId = "CF-18"; cof18.coffeeName = "Almond Milk Latte"; cof18.size = "Regular"; cof18.priceRs = 230.0; cof18.isHot = true; cof18.milkType = "Almond Milk"; cof18.sweetnessLevel = "Low"; cof18.calories = 90; cof18.roastType = "Medium"; cof18.hasWhippedCream = false;
        c18.coffee = cof18; c18.getCCdDetails();

        CCd c19 = new CCd();
        c19.storeLocation = "Banashankari"; c19.managerName = "Arjun";
        Coffee cof19 = new Coffee();
        cof19.coffeeId = "CF-19"; cof19.coffeeName = "Nitro Cold Brew"; cof19.size = "Regular"; cof19.priceRs = 210.0; cof19.isHot = false; cof19.milkType = "None"; cof19.sweetnessLevel = "Zero"; cof19.calories = 10; cof19.roastType = "Medium"; cof19.hasWhippedCream = false;
        c19.coffee = cof19; c19.getCCdDetails();

        CCd c20 = new CCd();
        c20.storeLocation = "RR Nagar"; c20.managerName = "Kavya";
        Coffee cof20 = new Coffee();
        cof20.coffeeId = "CF-20"; cof20.coffeeName = "Vegan Frappe"; cof20.size = "Large"; cof20.priceRs = 270.0; cof20.isHot = false; cof20.milkType = "Soy Milk"; cof20.sweetnessLevel = "Low"; cof20.calories = 200; cof20.roastType = "Dark"; cof20.hasWhippedCream = false;
        c20.coffee = cof20; c20.getCCdDetails();
    }
}