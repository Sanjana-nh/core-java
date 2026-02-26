class InternationalClothingBrand {
    static String brandName;
    static String founder;
    static String headquarters;
    static String foundedYear;
    static String parentCompany;
    static String styleCategory;
    static String priceRange;
    static String targetAudience;
    static String website;
    
    public static boolean initializeBrand(String name, String fndr, String hq, 
                                          String year, String parent, String style, 
                                          String price, String audience, String web)
        {
            boolean isBrandInitialized = false;
            boolean isNameValid = false;
            boolean isFndrValid = false;
            boolean isHqValid = false;
            boolean isYearValid = false;
            boolean isParentValid = false;
            boolean isStyleValid = false;
            boolean isPriceValid = false;
            boolean isAudienceValid = false;
            boolean isWebValid = false;
            
            if(name != null && !name.isEmpty())
            {
                System.out.println("name is validated");    
                brandName = name ;
            }
            else {
                System.out.println("name not found");
            }

            if(fndr != null && !fndr.isEmpty())
            {
                System.out.println("fndr is validated");    
                founder = fndr ;
            }
            else {
                System.out.println("fndr not found");
            }

            if(hq != null && !hq.isEmpty())
            {
                System.out.println("hq is validated");    
                headquarters = hq ;
            }
            else {
                System.out.println("hq not found");
            }

            if(year != null && !year.isEmpty())
            {
                System.out.println("year is validated");    
                foundedYear = year ;
            }
            else {
                System.out.println("year not found");
            }

            if(parent != null && !parent.isEmpty())
            {
                System.out.println("parent is validated");    
                parentCompany = parent ;
            }
            else {
                System.out.println("parent not found");
            }

            if(style != null && !style.isEmpty())
            {
                System.out.println("style is validated");    
                styleCategory = style ;
            }
            else {
                System.out.println("style not found");
            }

            if(price != null && !price.isEmpty())
            {
                System.out.println("price is validated");    
                priceRange = price ;
            }
            else {
                System.out.println("price not found");
            }

            if(audience != null && !audience.isEmpty())
            {
                System.out.println("audience is validated");    
                targetAudience = audience ;
            }
            else {
                System.out.println("audience not found");
            }

            if(web != null && !web.isEmpty())
            {
                System.out.println("web is validated");    
                website = web ;
            }
            else {
                System.out.println("web not found");
            }

            if(isNameValid == true && isFndrValid == true && isHqValid == true && isYearValid == true && isParentValid == true && isStyleValid == true && isPriceValid == true && isAudienceValid == true && isWebValid == true )
                isBrandInitialized = true;
                return isBrandInitialized;
        }

        public static void getBrandDetails(){
            System.out.println("The brand details are:");
            System.out.println("Brand Name :" + brandName);
            System.out.println("Founder :" + founder);
            System.out.println("Headquarters :" + headquarters);
            System.out.println("Founded Year :" + foundedYear);
            System.out.println("Parent Company :" + parentCompany);
            System.out.println("Style Category :" + styleCategory);
            System.out.println("Price Range :" + priceRange);
            System.out.println("Target Audience :" + targetAudience);
            System.out.println("Website :" + website);
            System.out.println("--------------------------------------------------");
        }
}