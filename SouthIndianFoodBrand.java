class SouthIndianFoodBrand {
    static String brandName;
    static String founder;
    static String headquarters;
    static String specialty;
    static String foundedYear;
    static String availability;
    static String rating;
    
    public static boolean initializeBrand(String name, String fndr, String hq, 
                                          String spec, String year, String avail, String rate)
        {
            boolean isBrandInitialized = false;
            boolean isNameValid = false;
            boolean isFndrValid = false;
            boolean isHqValid = false;
            boolean isSpecValid = false;
            boolean isYearValid = false;
            boolean isAvailValid = false;
            boolean isRateValid = false;
            
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

            if(spec != null && !spec.isEmpty())
            {
                System.out.println("spec is validated");    
                specialty = spec ;
            }
            else {
                System.out.println("spec not found");
            }

            if(year != null && !year.isEmpty())
            {
                System.out.println("year is validated");    
                foundedYear = year ;
            }
            else {
                System.out.println("year not found");
            }

            if(avail != null && !avail.isEmpty())
            {
                System.out.println("avail is validated");    
                availability = avail ;
            }
            else {
                System.out.println("avail not found");
            }

            if(rate != null && !rate.isEmpty())
            {
                System.out.println("rate is validated");    
                rating = rate ;
            }
            else {
                System.out.println("rate not found");
            }

            if(isNameValid == true && isFndrValid == true && isHqValid == true && isSpecValid == true && isYearValid == true && isAvailValid == true && isRateValid == true )
                isBrandInitialized = true;
                return isBrandInitialized;
        }

        public static void getBrandDetails(){
            System.out.println("The brand details are:");
            System.out.println("Brand Name :" + brandName);
            System.out.println("Founder :" + founder);
            System.out.println("Headquarters :" + headquarters);
            System.out.println("Specialty :" + specialty);
            System.out.println("Founded Year :" + foundedYear);
            System.out.println("Availability :" + availability);
            System.out.println("Rating :" + rating);
            System.out.println("--------------------------------------------------");
        }
}