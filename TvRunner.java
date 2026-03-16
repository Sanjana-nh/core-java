class TvRunner {
    public static void main(String[] args) {
        
        Tv t1 = new Tv();
        t1.tvBrand = "Samsung"; t1.screenSizeInches = 55;
        Channel c1 = new Channel();
        c1.channelNumber = 101; c1.channelName = "Star Sports 1 HD"; c1.category = "Sports"; c1.language = "English"; c1.monthlySubscriptionFee = 19.0; c1.isHD = true; c1.broadcaster = "Star India"; c1.popularityRating = 4.8; c1.countryOfOrigin = "India"; c1.isFreeToAir = false;
        t1.channel = c1; t1.getTvDetails();

        Tv t2 = new Tv();
        t2.tvBrand = "LG"; t2.screenSizeInches = 65;
        Channel c2 = new Channel();
        c2.channelNumber = 205; c2.channelName = "Colors Kannada"; c2.category = "General Entertainment"; c2.language = "Kannada"; c2.monthlySubscriptionFee = 15.0; c2.isHD = false; c2.broadcaster = "Viacom18"; c2.popularityRating = 4.5; c2.countryOfOrigin = "India"; c2.isFreeToAir = false;
        t2.channel = c2; t2.getTvDetails();

        Tv t3 = new Tv();
        t3.tvBrand = "Sony"; t3.screenSizeInches = 43;
        Channel c3 = new Channel();
        c3.channelNumber = 302; c3.channelName = "HBO HD"; c3.category = "Movies"; c3.language = "English"; c3.monthlySubscriptionFee = 25.0; c3.isHD = true; c3.broadcaster = "Warner Bros"; c3.popularityRating = 4.6; c3.countryOfOrigin = "USA"; c3.isFreeToAir = false;
        t3.channel = c3; t3.getTvDetails();

        Tv t4 = new Tv();
        t4.tvBrand = "TCL"; t4.screenSizeInches = 32;
        Channel c4 = new Channel();
        c4.channelNumber = 410; c4.channelName = "Cartoon Network"; c4.category = "Kids"; c4.language = "Hindi/English"; c4.monthlySubscriptionFee = 12.0; c4.isHD = false; c4.broadcaster = "Turner"; c4.popularityRating = 4.3; c4.countryOfOrigin = "USA"; c4.isFreeToAir = false;
        t4.channel = c4; t4.getTvDetails();

        Tv t5 = new Tv();
        t5.tvBrand = "OnePlus"; t5.screenSizeInches = 50;
        Channel c5 = new Channel();
        c5.channelNumber = 505; c5.channelName = "Aaj Tak"; c5.category = "News"; c5.language = "Hindi"; c5.monthlySubscriptionFee = 0.0; c5.isHD = false; c5.broadcaster = "TV Today Network"; c5.popularityRating = 4.1; c5.countryOfOrigin = "India"; c5.isFreeToAir = true;
        t5.channel = c5; t5.getTvDetails();

        Tv t6 = new Tv();
        t6.tvBrand = "Xiaomi"; t6.screenSizeInches = 43;
        Channel c6 = new Channel();
        c6.channelNumber = 115; c6.channelName = "Sony Ten 2 HD"; c6.category = "Sports"; c6.language = "English"; c6.monthlySubscriptionFee = 20.0; c6.isHD = true; c6.broadcaster = "Sony Pictures Networks"; c6.popularityRating = 4.4; c6.countryOfOrigin = "India"; c6.isFreeToAir = false;
        t6.channel = c6; t6.getTvDetails();

        Tv t7 = new Tv();
        t7.tvBrand = "Panasonic"; t7.screenSizeInches = 55;
        Channel c7 = new Channel();
        c7.channelNumber = 601; c7.channelName = "National Geographic"; c7.category = "Infotainment"; c7.language = "English"; c7.monthlySubscriptionFee = 10.0; c7.isHD = false; c7.broadcaster = "Disney"; c7.popularityRating = 4.7; c7.countryOfOrigin = "USA"; c7.isFreeToAir = false;
        t7.channel = c7; t7.getTvDetails();

        Tv t8 = new Tv();
        t8.tvBrand = "Vu"; t8.screenSizeInches = 65;
        Channel c8 = new Channel();
        c8.channelNumber = 701; c8.channelName = "MTV India"; c8.category = "Music"; c8.language = "Hindi"; c8.monthlySubscriptionFee = 8.0; c8.isHD = false; c8.broadcaster = "Viacom18"; c8.popularityRating = 4.0; c8.countryOfOrigin = "India"; c8.isFreeToAir = false;
        t8.channel = c8; t8.getTvDetails();

        Tv t9 = new Tv();
        t9.tvBrand = "Hisense"; t9.screenSizeInches = 40;
        Channel c9 = new Channel();
        c9.channelNumber = 210; c9.channelName = "Zee Kannada HD"; c9.category = "General Entertainment"; c9.language = "Kannada"; c9.monthlySubscriptionFee = 19.0; c9.isHD = true; c9.broadcaster = "Zee Network"; c9.popularityRating = 4.6; c9.countryOfOrigin = "India"; c9.isFreeToAir = false;
        t9.channel = c9; t9.getTvDetails();

        Tv t10 = new Tv();
        t10.tvBrand = "Philips"; t10.screenSizeInches = 50;
        Channel c10 = new Channel();
        c10.channelNumber = 801; c10.channelName = "TLC"; c10.category = "Lifestyle"; c10.language = "English"; c10.monthlySubscriptionFee = 10.0; c10.isHD = false; c10.broadcaster = "Discovery"; c10.popularityRating = 4.2; c10.countryOfOrigin = "USA"; c10.isFreeToAir = false;
        t10.channel = c10; t10.getTvDetails();

        Tv t11 = new Tv();
        t11.tvBrand = "Samsung"; t11.screenSizeInches = 75;
        Channel c11 = new Channel();
        c11.channelNumber = 315; c11.channelName = "Star Movies HD"; c11.category = "Movies"; c11.language = "English"; c11.monthlySubscriptionFee = 22.0; c11.isHD = true; c11.broadcaster = "Star India"; c11.popularityRating = 4.5; c11.countryOfOrigin = "India"; c11.isFreeToAir = false;
        t11.channel = c11; t11.getTvDetails();

        Tv t12 = new Tv();
        t12.tvBrand = "Sony"; t12.screenSizeInches = 55;
        Channel c12 = new Channel();
        c12.channelNumber = 901; c12.channelName = "DD National"; c12.category = "General Entertainment"; c12.language = "Hindi"; c12.monthlySubscriptionFee = 0.0; c12.isHD = false; c12.broadcaster = "Prasar Bharati"; c12.popularityRating = 3.5; c12.countryOfOrigin = "India"; c12.isFreeToAir = true;
        t12.channel = c12; t12.getTvDetails();

        Tv t13 = new Tv();
        t13.tvBrand = "LG"; t13.screenSizeInches = 43;
        Channel c13 = new Channel();
        c13.channelNumber = 220; c13.channelName = "Sun TV"; c13.category = "General Entertainment"; c13.language = "Tamil"; c13.monthlySubscriptionFee = 19.0; c13.isHD = false; c13.broadcaster = "Sun Network"; c13.popularityRating = 4.9; c13.countryOfOrigin = "India"; c13.isFreeToAir = false;
        t13.channel = c13; t13.getTvDetails();

        Tv t14 = new Tv();
        t14.tvBrand = "Xiaomi"; t14.screenSizeInches = 32;
        Channel c14 = new Channel();
        c14.channelNumber = 550; c14.channelName = "BBC World News"; c14.category = "News"; c14.language = "English"; c14.monthlySubscriptionFee = 15.0; c14.isHD = false; c14.broadcaster = "BBC"; c14.popularityRating = 4.4; c14.countryOfOrigin = "UK"; c14.isFreeToAir = false;
        t14.channel = c14; t14.getTvDetails();

        Tv t15 = new Tv();
        t15.tvBrand = "TCL"; t15.screenSizeInches = 55;
        Channel c15 = new Channel();
        c15.channelNumber = 420; c15.channelName = "Pogo"; c15.category = "Kids"; c15.language = "Hindi"; c15.monthlySubscriptionFee = 10.0; c15.isHD = false; c15.broadcaster = "Warner Bros"; c15.popularityRating = 4.1; c15.countryOfOrigin = "India"; c15.isFreeToAir = false;
        t15.channel = c15; t15.getTvDetails();

        Tv t16 = new Tv();
        t16.tvBrand = "OnePlus"; t16.screenSizeInches = 65;
        Channel c16 = new Channel();
        c16.channelNumber = 610; c16.channelName = "Discovery Channel HD"; c16.category = "Infotainment"; c16.language = "English/Hindi"; c16.monthlySubscriptionFee = 18.0; c16.isHD = true; c16.broadcaster = "Discovery"; c16.popularityRating = 4.8; c16.countryOfOrigin = "USA"; c16.isFreeToAir = false;
        t16.channel = c16; t16.getTvDetails();

        Tv t17 = new Tv();
        t17.tvBrand = "Vu"; t17.screenSizeInches = 43;
        Channel c17 = new Channel();
        c17.channelNumber = 715; c17.channelName = "9XM"; c17.category = "Music"; c17.language = "Hindi"; c17.monthlySubscriptionFee = 0.0; c17.isHD = false; c17.broadcaster = "9X Media"; c17.popularityRating = 3.9; c17.countryOfOrigin = "India"; c17.isFreeToAir = true;
        t17.channel = c17; t17.getTvDetails();

        Tv t18 = new Tv();
        t18.tvBrand = "Panasonic"; t18.screenSizeInches = 50;
        Channel c18 = new Channel();
        c18.channelNumber = 350; c18.channelName = "Sony MAX"; c18.category = "Movies"; c18.language = "Hindi"; c18.monthlySubscriptionFee = 15.0; c18.isHD = false; c18.broadcaster = "Sony Pictures Networks"; c18.popularityRating = 4.7; c18.countryOfOrigin = "India"; c18.isFreeToAir = false;
        t18.channel = c18; t18.getTvDetails();

        Tv t19 = new Tv();
        t19.tvBrand = "Samsung"; t19.screenSizeInches = 32;
        Channel c19 = new Channel();
        c19.channelNumber = 230; c19.channelName = "Star Plus"; c19.category = "General Entertainment"; c19.language = "Hindi"; c19.monthlySubscriptionFee = 19.0; c19.isHD = false; c19.broadcaster = "Star India"; c19.popularityRating = 4.8; c19.countryOfOrigin = "India"; c19.isFreeToAir = false;
        t19.channel = c19; t19.getTvDetails();

        Tv t20 = new Tv();
        t20.tvBrand = "LG"; t20.screenSizeInches = 55;
        Channel c20 = new Channel();
        c20.channelNumber = 125; c20.channelName = "Eurosport"; c20.category = "Sports"; c20.language = "English"; c20.monthlySubscriptionFee = 15.0; c20.isHD = false; c20.broadcaster = "Warner Bros. Discovery"; c20.popularityRating = 4.0; c20.countryOfOrigin = "France"; c20.isFreeToAir = false;
        t20.channel = c20; t20.getTvDetails();
    }
}