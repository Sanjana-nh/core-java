class LuluElectronics {
    static String productName;
    static String brand;
    static String category;
    static String modelNumber;
    static String warranty;
    static String powerConsumption;
    static String color;
    static String weight;
    static String availability;
    static String price;
    
    public static boolean initializeProduct(String name, String brnd, String cat, 
                                            String model, String warr, String power, 
                                            String clr, String wgt, String avail, String prc)
        {
            boolean isProductInitialized = false;
            boolean isNameValid = false;
            boolean isBrandValid = false;
            boolean isCatValid = false;
            boolean isModelValid = false;
            boolean isWarrValid = false;
            boolean isPowerValid = false;
            boolean isClrValid = false;
            boolean isWgtValid = false;
            boolean isAvailValid = false;
            boolean isPrcValid = false;
            
            if(name != null && !name.isEmpty())
            {
                System.out.println("name is validated");    
                productName = name ;
            }
            else {
                System.out.println("name not found");
            }

            if(brnd != null && !brnd.isEmpty())
            {
                System.out.println("brnd is validated");    
                brand = brnd ;
            }
            else {
                System.out.println("brnd not found");
            }

            if(cat != null && !cat.isEmpty())
            {
                System.out.println("cat is validated");    
                category = cat ;
            }
            else {
                System.out.println("cat not found");
            }

            if(model != null && !model.isEmpty())
            {
                System.out.println("model is validated");    
                modelNumber = model ;
            }
            else {
                System.out.println("model not found");
            }

            if(warr != null && !warr.isEmpty())
            {
                System.out.println("warr is validated");    
                warranty = warr ;
            }
            else {
                System.out.println("warr not found");
            }

            if(power != null && !power.isEmpty())
            {
                System.out.println("power is validated");    
                powerConsumption = power ;
            }
            else {
                System.out.println("power not found");
            }

            if(clr != null && !clr.isEmpty())
            {
                System.out.println("clr is validated");    
                color = clr ;
            }
            else {
                System.out.println("clr not found");
            }

            if(wgt != null && !wgt.isEmpty())
            {
                System.out.println("wgt is validated");    
                weight = wgt ;
            }
            else {
                System.out.println("wgt not found");
            }

            if(avail != null && !avail.isEmpty())
            {
                System.out.println("avail is validated");    
                availability = avail ;
            }
            else {
                System.out.println("avail not found");
            }

            if(prc != null && !prc.isEmpty())
            {
                System.out.println("prc is validated");    
                price = prc ;
            }
            else {
                System.out.println("prc not found");
            }

            if(isNameValid == true && isBrandValid == true && isCatValid == true && isModelValid == true && isWarrValid == true && isPowerValid == true && isClrValid == true && isWgtValid == true && isAvailValid == true && isPrcValid == true )
                isProductInitialized = true;
                return isProductInitialized;
        }

        public static void getProductDetails(){
            System.out.println("The product details are:");
            System.out.println("Product Name :" + productName);
            System.out.println("Brand :" + brand);
            System.out.println("Category :" + category);
            System.out.println("Model Number :" + modelNumber);
            System.out.println("Warranty :" + warranty);
            System.out.println("Power Consumption :" + powerConsumption);
            System.out.println("Color :" + color);
            System.out.println("Weight :" + weight);
            System.out.println("Availability :" + availability);
            System.out.println("Price :" + price);
            System.out.println("--------------------------------------------------");
        }
}