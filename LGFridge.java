class LGFridge {
    static String modelName;
    static String capacity;
    static String doorType;
    static String compressorType;
    static String energyRating;
    static String color;
    static String defrostSystem;
    static String dimensions;
    static String warranty;
    static String price;
    
    public static boolean initializeFridge(String model, String cap, String door, 
                                           String comp, String rating, String clr, 
                                           String defrost, String dim, String warr, String prc)
        {
            boolean isFridgeInitialized = false;
            boolean isModelValid = false;
            boolean isCapValid = false;
            boolean isDoorValid = false;
            boolean isCompValid = false;
            boolean isRatingValid = false;
            boolean isClrValid = false;
            boolean isDefrostValid = false;
            boolean isDimValid = false;
            boolean isWarrValid = false;
            boolean isPrcValid = false;
            
            if(model != null && !model.isEmpty())
            {
                System.out.println("model is validated");    
                modelName = model ;
            }
            else {
                System.out.println("model not found");
            }

            if(cap != null && !cap.isEmpty())
            {
                System.out.println("cap is validated");    
                capacity = cap ;
            }
            else {
                System.out.println("cap not found");
            }

            if(door != null && !door.isEmpty())
            {
                System.out.println("door is validated");    
                doorType = door ;
            }
            else {
                System.out.println("door not found");
            }

            if(comp != null && !comp.isEmpty())
            {
                System.out.println("comp is validated");    
                compressorType = comp ;
            }
            else {
                System.out.println("comp not found");
            }

            if(rating != null && !rating.isEmpty())
            {
                System.out.println("rating is validated");    
                energyRating = rating ;
            }
            else {
                System.out.println("rating not found");
            }

            if(clr != null && !clr.isEmpty())
            {
                System.out.println("clr is validated");    
                color = clr ;
            }
            else {
                System.out.println("clr not found");
            }

            if(defrost != null && !defrost.isEmpty())
            {
                System.out.println("defrost is validated");    
                defrostSystem = defrost ;
            }
            else {
                System.out.println("defrost not found");
            }

            if(dim != null && !dim.isEmpty())
            {
                System.out.println("dim is validated");    
                dimensions = dim ;
            }
            else {
                System.out.println("dim not found");
            }

            if(warr != null && !warr.isEmpty())
            {
                System.out.println("warr is validated");    
                warranty = warr ;
            }
            else {
                System.out.println("warr not found");
            }

            if(prc != null && !prc.isEmpty())
            {
                System.out.println("prc is validated");    
                price = prc ;
            }
            else {
                System.out.println("prc not found");
            }

            if(isModelValid == true && isCapValid == true && isDoorValid == true && isCompValid == true && isRatingValid == true && isClrValid == true && isDefrostValid == true && isDimValid == true && isWarrValid == true && isPrcValid == true )
                isFridgeInitialized = true;
                return isFridgeInitialized;
        }

        public static void getFridgeDetails(){
            System.out.println("The fridge details are:");
            System.out.println("Model Name :" + modelName);
            System.out.println("Capacity :" + capacity);
            System.out.println("Door Type :" + doorType);
            System.out.println("Compressor Type :" + compressorType);
            System.out.println("Energy Rating :" + energyRating);
            System.out.println("Color :" + color);
            System.out.println("Defrost System :" + defrostSystem);
            System.out.println("Dimensions :" + dimensions);
            System.out.println("Warranty :" + warranty);
            System.out.println("Price :" + price);
            System.out.println("--------------------------------------------------");
        }
}