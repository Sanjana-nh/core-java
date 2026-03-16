class LensKartRunner {
    public static void main(String[] args) {
        
        LensKart lk1 = new LensKart();
        lk1.storeLocation = "Indiranagar 100ft Road";
        lk1.contactNumber = "080-12345671";
        Frame f1 = new Frame();
        f1.frameId = "FR-101"; f1.brand = "Vincent Chase"; f1.shape = "Rectangle"; f1.color = "Matte Black"; f1.material = "TR90"; f1.price = 1500.0; f1.weightGrams = 15; f1.isFlexible = true; f1.size = "Medium"; f1.warrantyMonths = 12;
        lk1.frame = f1; lk1.getLensKartDetails();

        LensKart lk2 = new LensKart();
        lk2.storeLocation = "Koramangala 80ft Road";
        lk2.contactNumber = "080-12345672";
        Frame f2 = new Frame();
        f2.frameId = "FR-102"; f2.brand = "John Jacobs"; f2.shape = "Round"; f2.color = "Gold"; f2.material = "Titanium"; f2.price = 3500.0; f2.weightGrams = 12; f2.isFlexible = false; f2.size = "Small"; f2.warrantyMonths = 24;
        lk2.frame = f2; lk2.getLensKartDetails();

        LensKart lk3 = new LensKart();
        lk3.storeLocation = "Jayanagar 4th Block";
        lk3.contactNumber = "080-12345673";
        Frame f3 = new Frame();
        f3.frameId = "FR-103"; f3.brand = "Lenskart Air"; f3.shape = "Square"; f3.color = "Navy Blue"; f3.material = "Ultem"; f3.price = 2000.0; f3.weightGrams = 10; f3.isFlexible = true; f3.size = "Large"; f3.warrantyMonths = 12;
        lk3.frame = f3; lk3.getLensKartDetails();

        LensKart lk4 = new LensKart();
        lk4.storeLocation = "Malleswaram 8th Cross";
        lk4.contactNumber = "080-12345674";
        Frame f4 = new Frame();
        f4.frameId = "FR-104"; f4.brand = "Ray-Ban"; f4.shape = "Aviator"; f4.color = "Gunmetal"; f4.material = "Stainless Steel"; f4.price = 5500.0; f4.weightGrams = 20; f4.isFlexible = false; f4.size = "Medium"; f4.warrantyMonths = 24;
        lk4.frame = f4; lk4.getLensKartDetails();

        LensKart lk5 = new LensKart();
        lk5.storeLocation = "Whitefield Main Road";
        lk5.contactNumber = "080-12345675";
        Frame f5 = new Frame();
        f5.frameId = "FR-105"; f5.brand = "Oakley"; f5.shape = "Sports"; f5.color = "Neon Green"; f5.material = "O Matter"; f5.price = 6000.0; f5.weightGrams = 18; f5.isFlexible = true; f5.size = "Large"; f5.warrantyMonths = 24;
        lk5.frame = f5; lk5.getLensKartDetails();

        LensKart lk6 = new LensKart();
        lk6.storeLocation = "HSR Layout Sector 1";
        lk6.contactNumber = "080-12345676";
        Frame f6 = new Frame();
        f6.frameId = "FR-106"; f6.brand = "Vogue"; f6.shape = "Cat Eye"; f6.color = "Tortoise"; f6.material = "Acetate"; f6.price = 4200.0; f6.weightGrams = 22; f6.isFlexible = false; f6.size = "Medium"; f6.warrantyMonths = 12;
        lk6.frame = f6; lk6.getLensKartDetails();

        LensKart lk7 = new LensKart();
        lk7.storeLocation = "BTM Layout";
        lk7.contactNumber = "080-12345677";
        Frame f7 = new Frame();
        f7.frameId = "FR-107"; f7.brand = "Vincent Chase"; f7.shape = "Wayfarer"; f7.color = "Black"; f7.material = "Plastic"; f7.price = 999.0; f7.weightGrams = 25; f7.isFlexible = false; f7.size = "Large"; f7.warrantyMonths = 6;
        lk7.frame = f7; lk7.getLensKartDetails();

        LensKart lk8 = new LensKart();
        lk8.storeLocation = "Marathahalli Bridge";
        lk8.contactNumber = "080-12345678";
        Frame f8 = new Frame();
        f8.frameId = "FR-108"; f8.brand = "John Jacobs"; f8.shape = "Rectangle"; f8.color = "Silver"; f8.material = "Titanium"; f8.price = 3800.0; f8.weightGrams = 11; f8.isFlexible = true; f8.size = "Medium"; f8.warrantyMonths = 24;
        lk8.frame = f8; lk8.getLensKartDetails();

        LensKart lk9 = new LensKart();
        lk9.storeLocation = "Electronic City Phase 1";
        lk9.contactNumber = "080-12345679";
        Frame f9 = new Frame();
        f9.frameId = "FR-109"; f9.brand = "Lenskart Studio"; f9.shape = "Hexagon"; f9.color = "Rose Gold"; f9.material = "Stainless Steel"; f9.price = 2500.0; f9.weightGrams = 14; f9.isFlexible = false; f9.size = "Medium"; f9.warrantyMonths = 12;
        lk9.frame = f9; lk9.getLensKartDetails();

        LensKart lk10 = new LensKart();
        lk10.storeLocation = "Bannerghatta Road";
        lk10.contactNumber = "080-12345680";
        Frame f10 = new Frame();
        f10.frameId = "FR-110"; f10.brand = "Carrera"; f10.shape = "Aviator"; f10.color = "Black and Red"; f10.material = "Metal"; f10.price = 4800.0; f10.weightGrams = 21; f10.isFlexible = false; f10.size = "Large"; f10.warrantyMonths = 12;
        lk10.frame = f10; lk10.getLensKartDetails();

        LensKart lk11 = new LensKart();
        lk11.storeLocation = "JP Nagar 2nd Phase";
        lk11.contactNumber = "080-12345681";
        Frame f11 = new Frame();
        f11.frameId = "FR-111"; f11.brand = "Vincent Chase"; f11.shape = "Round"; f11.color = "Transparent"; f11.material = "TR90"; f11.price = 1200.0; f11.weightGrams = 13; f11.isFlexible = true; f11.size = "Small"; f11.warrantyMonths = 12;
        lk11.frame = f11; lk11.getLensKartDetails();

        LensKart lk12 = new LensKart();
        lk12.storeLocation = "Basavanagudi";
        lk12.contactNumber = "080-12345682";
        Frame f12 = new Frame();
        f12.frameId = "FR-112"; f12.brand = "Tommy Hilfiger"; f12.shape = "Square"; f12.color = "Blue"; f12.material = "Acetate"; f12.price = 5200.0; f12.weightGrams = 24; f12.isFlexible = false; f12.size = "Medium"; f12.warrantyMonths = 24;
        lk12.frame = f12; lk12.getLensKartDetails();

        LensKart lk13 = new LensKart();
        lk13.storeLocation = "Yelahanka New Town";
        lk13.contactNumber = "080-12345683";
        Frame f13 = new Frame();
        f13.frameId = "FR-113"; f13.brand = "John Jacobs"; f13.shape = "Clubmaster"; f13.color = "Brown"; f13.material = "Metal and Plastic"; f13.price = 3200.0; f13.weightGrams = 19; f13.isFlexible = false; f13.size = "Medium"; f13.warrantyMonths = 12;
        lk13.frame = f13; lk13.getLensKartDetails();

        LensKart lk14 = new LensKart();
        lk14.storeLocation = "Rajajinagar";
        lk14.contactNumber = "080-12345684";
        Frame f14 = new Frame();
        f14.frameId = "FR-114"; f14.brand = "Lenskart Air"; f14.shape = "Rimless"; f14.color = "Silver"; f14.material = "Titanium"; f14.price = 2800.0; f14.weightGrams = 8; f14.isFlexible = true; f14.size = "Medium"; f14.warrantyMonths = 24;
        lk14.frame = f14; lk14.getLensKartDetails();

        LensKart lk15 = new LensKart();
        lk15.storeLocation = "Kalyan Nagar";
        lk15.contactNumber = "080-12345685";
        Frame f15 = new Frame();
        f15.frameId = "FR-115"; f15.brand = "Fossil"; f15.shape = "Rectangle"; f15.color = "Gunmetal"; f15.material = "Metal"; f15.price = 4500.0; f15.weightGrams = 18; f15.isFlexible = false; f15.size = "Large"; f15.warrantyMonths = 12;
        lk15.frame = f15; lk15.getLensKartDetails();

        LensKart lk16 = new LensKart();
        lk16.storeLocation = "Bellandur";
        lk16.contactNumber = "080-12345686";
        Frame f16 = new Frame();
        f16.frameId = "FR-116"; f16.brand = "Vincent Chase"; f16.shape = "Oval"; f16.color = "Pink"; f16.material = "TR90"; f16.price = 1400.0; f16.weightGrams = 14; f16.isFlexible = true; f16.size = "Small"; f16.warrantyMonths = 12;
        lk16.frame = f16; lk16.getLensKartDetails();

        LensKart lk17 = new LensKart();
        lk17.storeLocation = "Sahakar Nagar";
        lk17.contactNumber = "080-12345687";
        Frame f17 = new Frame();
        f17.frameId = "FR-117"; f17.brand = "Polaroid"; f17.shape = "Wayfarer"; f17.color = "Black"; f17.material = "Plastic"; f17.price = 3000.0; f17.weightGrams = 22; f17.isFlexible = false; f17.size = "Medium"; f17.warrantyMonths = 12;
        lk17.frame = f17; lk17.getLensKartDetails();

        LensKart lk18 = new LensKart();
        lk18.storeLocation = "RR Nagar";
        lk18.contactNumber = "080-12345688";
        Frame f18 = new Frame();
        f18.frameId = "FR-118"; f18.brand = "John Jacobs"; f18.shape = "Cat Eye"; f18.color = "Burgundy"; f18.material = "Acetate"; f18.price = 3600.0; f18.weightGrams = 20; f18.isFlexible = false; f18.size = "Medium"; f18.warrantyMonths = 24;
        lk18.frame = f18; lk18.getLensKartDetails();

        LensKart lk19 = new LensKart();
        lk19.storeLocation = "Banashankari";
        lk19.contactNumber = "080-12345689";
        Frame f19 = new Frame();
        f19.frameId = "FR-119"; f19.brand = "Lenskart Blu"; f19.shape = "Square"; f19.color = "Clear"; f19.material = "TR90"; f19.price = 1800.0; f19.weightGrams = 16; f19.isFlexible = true; f19.size = "Large"; f19.warrantyMonths = 12;
        lk19.frame = f19; lk19.getLensKartDetails();

        LensKart lk20 = new LensKart();
        lk20.storeLocation = "Hebbal";
        lk20.contactNumber = "080-12345690";
        Frame f20 = new Frame();
        f20.frameId = "FR-120"; f20.brand = "Hugo Boss"; f20.shape = "Rectangle"; f20.color = "Matte Grey"; f20.material = "Titanium"; f20.price = 8500.0; f20.weightGrams = 12; f20.isFlexible = false; f20.size = "Medium"; f20.warrantyMonths = 24;
        lk20.frame = f20; lk20.getLensKartDetails();
    }
}