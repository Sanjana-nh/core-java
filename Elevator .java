class Elevator {
    static String manufacturer;
    static String capacity;
    static String maxSpeed;
    static String numFloors;
    static String elevatorType;
    static String status;
    
    public static boolean initializeElevator(String mfg, String cap, String spd, 
                                             String flrs, String type, String stat)
        {
            boolean isElevatorInitialized = false;
            boolean isMfgValid = false;
            boolean isCapValid = false;
            boolean isSpdValid = false;
            boolean isFlrsValid = false;
            boolean isTypeValid = false;
            boolean isStatValid = false;
            
            if(mfg != null && !mfg.isEmpty())
            {
                System.out.println("mfg is validated");    
                manufacturer = mfg ;
            }
            else {
                System.out.println("mfg not found");
            }

            if(cap != null && !cap.isEmpty())
            {
                System.out.println("cap is validated");    
                capacity = cap ;
            }
            else {
                System.out.println("cap not found");
            }

            if(spd != null && !spd.isEmpty())
            {
                System.out.println("spd is validated");    
                maxSpeed = spd ;
            }
            else {
                System.out.println("spd not found");
            }

            if(flrs != null && !flrs.isEmpty())
            {
                System.out.println("flrs is validated");    
                numFloors = flrs ;
            }
            else {
                System.out.println("flrs not found");
            }

            if(type != null && !type.isEmpty())
            {
                System.out.println("type is validated");    
                elevatorType = type ;
            }
            else {
                System.out.println("type not found");
            }

            if(stat != null && !stat.isEmpty())
            {
                System.out.println("stat is validated");    
                status = stat ;
            }
            else {
                System.out.println("stat not found");
            }

            if(isMfgValid == true && isCapValid == true && isSpdValid == true && isFlrsValid == true && isTypeValid == true && isStatValid == true )
                isElevatorInitialized = true;
                return isElevatorInitialized;
        }

        public static void getElevatorDetails(){
            System.out.println("The elevator details are:");
            System.out.println("Manufacturer :" + manufacturer);
            System.out.println("Capacity :" + capacity);
            System.out.println("Max Speed :" + maxSpeed);
            System.out.println("Number of Floors :" + numFloors);
            System.out.println("Elevator Type :" + elevatorType);
            System.out.println("Status :" + status);
            System.out.println("--------------------------------------------------");
        }
}