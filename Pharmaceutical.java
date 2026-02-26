class Pharmaceutical {
    static String drugName;
    static String activeIngredient;
    static String manufacturer;
    static String dosageForm;
    static String strength;
    static String routeOfAdministration;
    static String therapeuticClass;
    static String storageCondition;
    static String price;
    
    public static boolean initializeDrug(String name, String ingredient, String mfg, 
                                         String form, String str, String route, 
                                         String tClass, String storage, String prc)
        {
            boolean isDrugInitialized = false;
            boolean isNameValid = false;
            boolean isIngredientValid = false;
            boolean isMfgValid = false;
            boolean isFormValid = false;
            boolean isStrValid = false;
            boolean isRouteValid = false;
            boolean isClassValid = false;
            boolean isStorageValid = false;
            boolean isPrcValid = false;
            
            if(name != null && !name.isEmpty())
            {
                System.out.println("name is validated");    
                drugName = name ;
            }
            else {
                System.out.println("name not found");
            }

            if(ingredient != null && !ingredient.isEmpty())
            {
                System.out.println("ingredient is validated");    
                activeIngredient = ingredient ;
            }
            else {
                System.out.println("ingredient not found");
            }

            if(mfg != null && !mfg.isEmpty())
            {
                System.out.println("mfg is validated");    
                manufacturer = mfg ;
            }
            else {
                System.out.println("mfg not found");
            }

            if(form != null && !form.isEmpty())
            {
                System.out.println("form is validated");    
                dosageForm = form ;
            }
            else {
                System.out.println("form not found");
            }

            if(str != null && !str.isEmpty())
            {
                System.out.println("str is validated");    
                strength = str ;
            }
            else {
                System.out.println("str not found");
            }

            if(route != null && !route.isEmpty())
            {
                System.out.println("route is validated");    
                routeOfAdministration = route ;
            }
            else {
                System.out.println("route not found");
            }

            if(tClass != null && !tClass.isEmpty())
            {
                System.out.println("tClass is validated");    
                therapeuticClass = tClass ;
            }
            else {
                System.out.println("tClass not found");
            }

            if(storage != null && !storage.isEmpty())
            {
                System.out.println("storage is validated");    
                storageCondition = storage ;
            }
            else {
                System.out.println("storage not found");
            }

            if(prc != null && !prc.isEmpty())
            {
                System.out.println("prc is validated");    
                price = prc ;
            }
            else {
                System.out.println("prc not found");
            }

            if(isNameValid == true && isIngredientValid == true && isMfgValid == true && isFormValid == true && isStrValid == true && isRouteValid == true && isClassValid == true && isStorageValid == true && isPrcValid == true )
                isDrugInitialized = true;
                return isDrugInitialized;
        }

        public static void getDrugDetails(){
            System.out.println("The pharmaceutical details are:");
            System.out.println("Drug Name :" + drugName);
            System.out.println("Active Ingredient :" + activeIngredient);
            System.out.println("Manufacturer :" + manufacturer);
            System.out.println("Dosage Form :" + dosageForm);
            System.out.println("Strength :" + strength);
            System.out.println("Route of Administration :" + routeOfAdministration);
            System.out.println("Therapeutic Class :" + therapeuticClass);
            System.out.println("Storage Condition :" + storageCondition);
            System.out.println("Price :" + price);
            System.out.println("--------------------------------------------------");
        }
}