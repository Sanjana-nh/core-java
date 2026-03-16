class PlayStoreRunner {
    public static void main(String[] args) {
        
        PlayStore ps1 = new PlayStore();
        ps1.region = "India"; ps1.osPlatform = "Android";
        Application a1 = new Application();
        a1.appId = "com.whatsapp"; a1.appName = "WhatsApp Messenger"; a1.category = "Communication"; a1.developer = "Meta"; a1.sizeMB = 45.2; a1.rating = 4.3; a1.downloadsMillions = 5000; a1.isFree = true; a1.contentRating = "Everyone"; a1.containsAds = false;
        ps1.application = a1; ps1.getPlayStoreDetails();

        PlayStore ps2 = new PlayStore();
        ps2.region = "India"; ps2.osPlatform = "Android";
        Application a2 = new Application();
        a2.appId = "com.instagram.android"; a2.appName = "Instagram"; a2.category = "Social"; a2.developer = "Meta"; a2.sizeMB = 55.0; a2.rating = 4.0; a2.downloadsMillions = 1000; a2.isFree = true; a2.contentRating = "Teen"; a2.containsAds = true;
        ps2.application = a2; ps2.getPlayStoreDetails();

        PlayStore ps3 = new PlayStore();
        ps3.region = "India"; ps3.osPlatform = "Android";
        Application a3 = new Application();
        a3.appId = "com.spotify.music"; a3.appName = "Spotify"; a3.category = "Music & Audio"; a3.developer = "Spotify AB"; a3.sizeMB = 35.8; a3.rating = 4.4; a3.downloadsMillions = 1000; a3.isFree = true; a3.contentRating = "Teen"; a3.containsAds = true;
        ps3.application = a3; ps3.getPlayStoreDetails();

        PlayStore ps4 = new PlayStore();
        ps4.region = "India"; ps4.osPlatform = "Android";
        Application a4 = new Application();
        a4.appId = "com.kiloo.subwaysurf"; a4.appName = "Subway Surfers"; a4.category = "Arcade"; a4.developer = "SYBO Games"; a4.sizeMB = 135.0; a4.rating = 4.6; a4.downloadsMillions = 1000; a4.isFree = true; a4.contentRating = "Everyone 10+"; a4.containsAds = true;
        ps4.application = a4; ps4.getPlayStoreDetails();

        PlayStore ps5 = new PlayStore();
        ps5.region = "India"; ps5.osPlatform = "Android";
        Application a5 = new Application();
        a5.appId = "com.netflix.mediaclient"; a5.appName = "Netflix"; a5.category = "Entertainment"; a5.developer = "Netflix, Inc."; a5.sizeMB = 25.0; a5.rating = 4.4; a5.downloadsMillions = 1000; a5.isFree = true; a5.contentRating = "Teen"; a5.containsAds = false;
        ps5.application = a5; ps5.getPlayStoreDetails();

        PlayStore ps6 = new PlayStore();
        ps6.region = "India"; ps6.osPlatform = "Android";
        Application a6 = new Application();
        a6.appId = "com.google.android.youtube"; a6.appName = "YouTube"; a6.category = "Video Players"; a6.developer = "Google LLC"; a6.sizeMB = 120.0; a6.rating = 4.1; a6.downloadsMillions = 10000; a6.isFree = true; a6.contentRating = "Teen"; a6.containsAds = true;
        ps6.application = a6; ps6.getPlayStoreDetails();

        PlayStore ps7 = new PlayStore();
        ps7.region = "India"; ps7.osPlatform = "Android";
        Application a7 = new Application();
        a7.appId = "com.zhiliaoapp.musically"; a7.appName = "TikTok"; a7.category = "Social"; a7.developer = "TikTok Pte. Ltd."; a7.sizeMB = 95.0; a7.rating = 4.4; a7.downloadsMillions = 1000; a7.isFree = true; a7.contentRating = "Teen"; a7.containsAds = true;
        ps7.application = a7; ps7.getPlayStoreDetails();

        PlayStore ps8 = new PlayStore();
        ps8.region = "India"; ps8.osPlatform = "Android";
        Application a8 = new Application();
        a8.appId = "com.nianticlabs.pokemongo"; a8.appName = "Pokémon GO"; a8.category = "Adventure"; a8.developer = "Niantic, Inc."; a8.sizeMB = 115.0; a8.rating = 4.1; a8.downloadsMillions = 100; a8.isFree = true; a8.contentRating = "Everyone"; a8.containsAds = false;
        ps8.application = a8; ps8.getPlayStoreDetails();

        PlayStore ps9 = new PlayStore();
        ps9.region = "India"; ps9.osPlatform = "Android";
        Application a9 = new Application();
        a9.appId = "com.tencent.ig"; a9.appName = "PUBG MOBILE"; a9.category = "Action"; a9.developer = "Level Infinite"; a9.sizeMB = 750.0; a9.rating = 4.2; a9.downloadsMillions = 500; a9.isFree = true; a9.contentRating = "Teen"; a9.containsAds = true;
        ps9.application = a9; ps9.getPlayStoreDetails();

        PlayStore ps10 = new PlayStore();
        ps10.region = "India"; ps10.osPlatform = "Android";
        Application a10 = new Application();
        a10.appId = "com.google.android.apps.maps"; a10.appName = "Google Maps"; a10.category = "Travel & Local"; a10.developer = "Google LLC"; a10.sizeMB = 65.0; a10.rating = 4.1; a10.downloadsMillions = 10000; a10.isFree = true; a10.contentRating = "Everyone"; a10.containsAds = false;
        ps10.application = a10; ps10.getPlayStoreDetails();

        PlayStore ps11 = new PlayStore();
        ps11.region = "India"; ps11.osPlatform = "Android";
        Application a11 = new Application();
        a11.appId = "com.amazon.mShop.android.shopping"; a11.appName = "Amazon Shopping"; a11.category = "Shopping"; a11.developer = "Amazon Mobile LLC"; a11.sizeMB = 55.0; a11.rating = 4.2; a11.downloadsMillions = 500; a11.isFree = true; a11.contentRating = "Teen"; a11.containsAds = true;
        ps11.application = a11; ps11.getPlayStoreDetails();

        PlayStore ps12 = new PlayStore();
        ps12.region = "India"; ps12.osPlatform = "Android";
        Application a12 = new Application();
        a12.appId = "com.snapchat.android"; a12.appName = "Snapchat"; a12.category = "Communication"; a12.developer = "Snap Inc"; a12.sizeMB = 70.0; a12.rating = 4.1; a12.downloadsMillions = 1000; a12.isFree = true; a12.contentRating = "Teen"; a12.containsAds = true;
        ps12.application = a12; ps12.getPlayStoreDetails();

        PlayStore ps13 = new PlayStore();
        ps13.region = "India"; ps13.osPlatform = "Android";
        Application a13 = new Application();
        a13.appId = "com.microsoft.teams"; a13.appName = "Microsoft Teams"; a13.category = "Business"; a13.developer = "Microsoft Corporation"; a13.sizeMB = 85.0; a13.rating = 4.6; a13.downloadsMillions = 100; a13.isFree = true; a13.contentRating = "Everyone"; a13.containsAds = false;
        ps13.application = a13; ps13.getPlayStoreDetails();

        PlayStore ps14 = new PlayStore();
        ps14.region = "India"; ps14.osPlatform = "Android";
        Application a14 = new Application();
        a14.appId = "com.duolingo"; a14.appName = "Duolingo: Language Lessons"; a14.category = "Education"; a14.developer = "Duolingo"; a14.sizeMB = 40.0; a14.rating = 4.7; a14.downloadsMillions = 100; a14.isFree = true; a14.contentRating = "Everyone"; a14.containsAds = true;
        ps14.application = a14; ps14.getPlayStoreDetails();

        PlayStore ps15 = new PlayStore();
        ps15.region = "India"; ps15.osPlatform = "Android";
        Application a15 = new Application();
        a15.appId = "com.mojang.minecraftpe"; a15.appName = "Minecraft"; a15.category = "Arcade"; a15.developer = "Mojang"; a15.sizeMB = 150.0; a15.rating = 4.5; a15.downloadsMillions = 10; a15.isFree = false; a15.contentRating = "Everyone 10+"; a15.containsAds = false;
        ps15.application = a15; ps15.getPlayStoreDetails();

        PlayStore ps16 = new PlayStore();
        ps16.region = "India"; ps16.osPlatform = "Android";
        Application a16 = new Application();
        a16.appId = "com.canva.editor"; a16.appName = "Canva: Design, Photo & Video"; a16.category = "Art & Design"; a16.developer = "Canva"; a16.sizeMB = 30.0; a16.rating = 4.7; a16.downloadsMillions = 100; a16.isFree = true; a16.contentRating = "Everyone"; a16.containsAds = false;
        ps16.application = a16; ps16.getPlayStoreDetails();

        PlayStore ps17 = new PlayStore();
        ps17.region = "India"; ps17.osPlatform = "Android";
        Application a17 = new Application();
        a17.appId = "com.ubercab"; a17.appName = "Uber"; a17.category = "Maps & Navigation"; a17.developer = "Uber Technologies"; a17.sizeMB = 60.0; a17.rating = 4.5; a17.downloadsMillions = 500; a17.isFree = true; a17.contentRating = "Everyone"; a17.containsAds = false;
        ps17.application = a17; ps17.getPlayStoreDetails();

        PlayStore ps18 = new PlayStore();
        ps18.region = "India"; ps18.osPlatform = "Android";
        Application a18 = new Application();
        a18.appId = "com.roblox.client"; a18.appName = "Roblox"; a18.category = "Adventure"; a18.developer = "Roblox Corporation"; a18.sizeMB = 145.0; a18.rating = 4.4; a18.downloadsMillions = 500; a18.isFree = true; a18.contentRating = "Teen"; a18.containsAds = true;
        ps18.application = a18; ps18.getPlayStoreDetails();

        PlayStore ps19 = new PlayStore();
        ps19.region = "India"; ps19.osPlatform = "Android";
        Application a19 = new Application();
        a19.appId = "com.linkedin.android"; a19.appName = "LinkedIn"; a19.category = "Business"; a19.developer = "LinkedIn"; a19.sizeMB = 80.0; a19.rating = 4.3; a19.downloadsMillions = 500; a19.isFree = true; a19.contentRating = "Everyone"; a19.containsAds = true;
        ps19.application = a19; ps19.getPlayStoreDetails();

        PlayStore ps20 = new PlayStore();
        ps20.region = "India"; ps20.osPlatform = "Android";
        Application a20 = new Application();
        a20.appId = "com.pinterest"; a20.appName = "Pinterest"; a20.category = "Lifestyle"; a20.developer = "Pinterest"; a20.sizeMB = 22.0; a20.rating = 4.6; a20.downloadsMillions = 500; a20.isFree = true; a20.contentRating = "Teen"; a20.containsAds = true;
        ps20.application = a20; ps20.getPlayStoreDetails();
    }
}