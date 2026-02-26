class NikonCamera{
    static String model;
    static String resolution;
    static String sensorType;
    static String isoRange;
    static String mountType;
    static String videoFormat;
    static String autofocusPoints;
    static String weight;
    static String batteryLife;
    static String price;
    
    public static boolean initializeCamera(String mod, String res, String sensor, 
                                           String iso, String mount, String video, 
                                           String afPoints, String wgt, String battery, String prc)
        {
            boolean isCameraInitialize = false;
            boolean isModValid = false;
            boolean isResValid = false;
            boolean isSensorValid = false;
            boolean isIsoValid = false;
            boolean isMountValid = false;
            boolean isVideoValid = false;
            boolean isAfPointsValid = false;
            boolean isWgtValid = false;
            boolean isBatteryValid = false;
            boolean isPrcValid = false;
            
            if(mod != null && !mod.isEmpty())
            {
                System.out.println("mod is validated");    
                model = mod ;
            }
            else {
                System.out.println("mod not found");
            }

            if(res != null && !res.isEmpty())
            {
                System.out.println("res is validated");    
                resolution = res ;
            }
            else {
                System.out.println("res not found");
            }

            if(sensor != null && !sensor.isEmpty())
            {
                System.out.println("sensor is validated");    
                sensorType = sensor ;
            }
            else {
                System.out.println("sensor not found");
            }

            if(iso != null && !iso.isEmpty())
            {
                System.out.println("iso is validated");    
                isoRange = iso ;
            }
            else {
                System.out.println("iso not found");
            }

            if(mount != null && !mount.isEmpty())
            {
                System.out.println("mount is validated");    
                mountType = mount ;
            }
            else {
                System.out.println("mount not found");
            }

            if(video != null && !video.isEmpty())
            {
                System.out.println("video is validated");    
                videoFormat = video ;
            }
            else {
                System.out.println("video not found");
            }

            if(afPoints != null && !afPoints.isEmpty())
            {
                System.out.println("afPoints is validated");    
                autofocusPoints = afPoints ;
            }
            else {
                System.out.println("afPoints not found");
            }

            if(wgt != null && !wgt.isEmpty())
            {
                System.out.println("wgt is validated");    
                weight = wgt ;
            }
            else {
                System.out.println("wgt not found");
            }

            if(battery != null && !battery.isEmpty())
            {
                System.out.println("battery is validated");    
                batteryLife = battery ;
            }
            else {
                System.out.println("battery not found");
            }

            if(prc != null && !prc.isEmpty())
            {
                System.out.println("prc is validated");    
                price = prc ;
            }
            else {
                System.out.println("prc not found");
            }

            if(isModValid == true && isResValid == true && isSensorValid == true && isIsoValid == true && isMountValid == true && isVideoValid == true && isAfPointsValid == true && isWgtValid == true && isBatteryValid == true && isPrcValid == true )
                isCameraInitialize = true;
                return isCameraInitialize;
        }

        public static void getCameraDetails(){
            System.out.println("The camera details are:");
            System.out.println("Model :"+model);
            System.out.println("Resolution :"+resolution);
            System.out.println("Sensor Type :"+sensorType);
            System.out.println("ISO Range :"+isoRange);
            System.out.println("Mount Type :"+mountType);
            System.out.println("Video Format :"+videoFormat);
            System.out.println("Autofocus Points :"+autofocusPoints);
            System.out.println("Weight :"+weight);
            System.out.println("Battery Life :"+batteryLife);
            System.out.println("Price :"+price);
			System.out.println("--------------------------------------------------");
        }
}