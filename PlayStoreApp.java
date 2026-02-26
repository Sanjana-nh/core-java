class PlayStoreApp {
    static String appName;
    static String developer;
    static String category;
    static String version;
    static String size;
    static String rating;
    static String downloads;
    static String contentRating;
    static String price;
    
    public static boolean initializeApp(String name, String dev, String cat, 
                                        String ver, String appSize, String rate, 
                                        String down, String content, String prc)
        {
            boolean isAppInitialized = false;
            boolean isNameValid = false;
            boolean isDevValid = false;
            boolean isCatValid = false;
            boolean isVerValid = false;
            boolean isAppSizeValid = false;
            boolean isRateValid = false;
            boolean isDownValid = false;
            boolean isContentValid = false;
            boolean isPrcValid = false;
            
            if(name != null && !name.isEmpty())
            {
                System.out.println("name is validated");    
                appName = name ;
            }
            else {
                System.out.println("name not found");
            }

            if(dev != null && !dev.isEmpty())
            {
                System.out.println("dev is validated");    
                developer = dev ;
            }
            else {
                System.out.println("dev not found");
            }

            if(cat != null && !cat.isEmpty())
            {
                System.out.println("cat is validated");    
                category = cat ;
            }
            else {
                System.out.println("cat not found");
            }

            if(ver != null && !ver.isEmpty())
            {
                System.out.println("ver is validated");    
                version = ver ;
            }
            else {
                System.out.println("ver not found");
            }

            if(appSize != null && !appSize.isEmpty())
            {
                System.out.println("appSize is validated");    
                size = appSize ;
            }
            else {
                System.out.println("appSize not found");
            }

            if(rate != null && !rate.isEmpty())
            {
                System.out.println("rate is validated");    
                rating = rate ;
            }
            else {
                System.out.println("rate not found");
            }

            if(down != null && !down.isEmpty())
            {
                System.out.println("down is validated");    
                downloads = down ;
            }
            else {
                System.out.println("down not found");
            }

            if(content != null && !content.isEmpty())
            {
                System.out.println("content is validated");    
                contentRating = content ;
            }
            else {
                System.out.println("content not found");
            }

            if(prc != null && !prc.isEmpty())
            {
                System.out.println("prc is validated");    
                price = prc ;
            }
            else {
                System.out.println("prc not found");
            }

            if(isNameValid == true && isDevValid == true && isCatValid == true && isVerValid == true && isAppSizeValid == true && isRateValid == true && isDownValid == true && isContentValid == true && isPrcValid == true )
                isAppInitialized = true;
                return isAppInitialized;
        }

        public static void getAppDetails(){
            System.out.println("The app details are:");
            System.out.println("App Name :" + appName);
            System.out.println("Developer :" + developer);
            System.out.println("Category :" + category);
            System.out.println("Version :" + version);
            System.out.println("Size :" + size);
            System.out.println("Rating :" + rating);
            System.out.println("Downloads :" + downloads);
            System.out.println("Content Rating :" + contentRating);
            System.out.println("Price :" + price);
            System.out.println("--------------------------------------------------");
        }
}