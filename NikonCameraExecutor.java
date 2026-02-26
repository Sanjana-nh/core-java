class NikonCameraExecutor {
    public static void main(String[] args) {
        
        boolean cam1 = NikonCamera.initializeCamera("Z9", "45.7MP", "Stacked CMOS", "64-25600", "Z-Mount", "8K UHD", "493", "1340g", "700 shots", "$5499");
        NikonCamera.getCameraDetails();

        boolean cam2 = NikonCamera.initializeCamera(null, "45.7MP", "Stacked CMOS", "64-25600", "Z-Mount", "8K UHD", "493", "910g", "340 shots", "$3999");
        NikonCamera.getCameraDetails();

        boolean cam3 = NikonCamera.initializeCamera("Z7 II", "", "BSI CMOS", "64-25600", "Z-Mount", "4K UHD", "493", "705g", "420 shots", "$2999");
        NikonCamera.getCameraDetails();

        boolean cam4 = NikonCamera.initializeCamera("Z6 II", "24.5MP", "BSI CMOS", "100-51200", "Z-Mount", "4K UHD", "273", "705g", "410 shots", "$1999");
        NikonCamera.getCameraDetails();

        boolean cam5 = NikonCamera.initializeCamera("Z5", "24.3MP", null, "", "Z-Mount", "4K UHD", "273", "675g", "470 shots", "$1399");
        NikonCamera.getCameraDetails();

        boolean cam6 = NikonCamera.initializeCamera("Zf", "24.5MP", "BSI CMOS", "100-64000", "Z-Mount", "4K UHD", "273", "710g", "380 shots", "$1999");
        NikonCamera.getCameraDetails();

        boolean cam7 = NikonCamera.initializeCamera("Zfc", "20.9MP", "DX CMOS", "100-51200", "Z-Mount", "4K UHD", "209", "445g", "300 shots", "$959");
        NikonCamera.getCameraDetails();

        boolean cam8 = NikonCamera.initializeCamera("Z50", "20.9MP", "DX CMOS", "100-51200", "Z-Mount", "4K UHD", "209", "450g", "320 shots", "$859");
        NikonCamera.getCameraDetails();

        boolean cam9 = NikonCamera.initializeCamera("Z30", "20.9MP", "DX CMOS", "100-51200", "Z-Mount", "4K UHD", "209", "405g", "330 shots", "$709");
        NikonCamera.getCameraDetails();

        boolean cam10 = NikonCamera.initializeCamera("D6", "20.8MP", "CMOS", "100-102400", "F-Mount", "4K UHD", "105", "1450g", "3580 shots", "$6499");
        NikonCamera.getCameraDetails();

        boolean cam11 = NikonCamera.initializeCamera("D5", "20.8MP", "CMOS", "100-102400", "F-Mount", "4K UHD", "153", "1415g", "3780 shots", null);
        NikonCamera.getCameraDetails();

        boolean cam12 = NikonCamera.initializeCamera("D850", "45.7MP", "BSI CMOS", "64-25600", "F-Mount", "4K UHD", "153", "1005g", "1840 shots", "$2999");
        NikonCamera.getCameraDetails();

        boolean cam13 = NikonCamera.initializeCamera("D810", "36.3MP", "CMOS", "64-12800", "F-Mount", "1080p", "51", "980g", "1200 shots", "$1999");
        NikonCamera.getCameraDetails();

        boolean cam14 = NikonCamera.initializeCamera("D780", "24.5MP", "BSI CMOS", "100-51200", "F-Mount", "4K UHD", "51", "840g", "2260 shots", "$2299");
        NikonCamera.getCameraDetails();

        boolean cam15 = NikonCamera.initializeCamera("D750", "24.3MP", "CMOS", "100-12800", "F-Mount", "1080p", "51", "840g", "1230 shots", "$1499");
        NikonCamera.getCameraDetails();

        boolean cam16 = NikonCamera.initializeCamera("D500", "20.9MP", "DX CMOS", "100-51200", "F-Mount", "4K UHD", "153", "860g", "1240 shots", "$1599");
        NikonCamera.getCameraDetails();

        boolean cam17 = NikonCamera.initializeCamera("D7500", "20.9MP", "DX CMOS", "100-51200", "", "4K UHD", "51", "720g", "950 shots", "$999");
        NikonCamera.getCameraDetails();

        boolean cam18 = NikonCamera.initializeCamera("D7200", "24.2MP", "DX CMOS", "100-25600", "F-Mount", "1080p", "51", "765g", "1110 shots", "$799");
        NikonCamera.getCameraDetails();

        boolean cam19 = NikonCamera.initializeCamera("D7100", "24.1MP", "DX CMOS", "100-6400", "F-Mount", "1080p", "51", "765g", "950 shots", "$599");
        NikonCamera.getCameraDetails();

        boolean cam20 = NikonCamera.initializeCamera("D5600", "24.2MP", "DX CMOS", "100-25600", "F-Mount", "1080p", "39", "465g", "970 shots", "$699");
        NikonCamera.getCameraDetails();

        boolean cam21 = NikonCamera.initializeCamera("D5500", "24.2MP", "DX CMOS", "100-25600", "F-Mount", "1080p", "39", "420g", "820 shots", "$599");
        NikonCamera.getCameraDetails();

        boolean cam22 = NikonCamera.initializeCamera("D5300", "24.2MP", "DX CMOS", "100-12800", "F-Mount", "1080p", "39", "480g", "600 shots", "$499");
        NikonCamera.getCameraDetails();

        boolean cam23 = NikonCamera.initializeCamera("D3500", "24.2MP", "DX CMOS", "100-25600", "F-Mount", "1080p", "11", "365g", "1550 shots", "$499");
        NikonCamera.getCameraDetails();

        boolean cam24 = NikonCamera.initializeCamera("D3400", "24.2MP", "DX CMOS", "100-25600", "F-Mount", "1080p", "11", "395g", "1200 shots", "$399");
        NikonCamera.getCameraDetails();

        boolean cam25 = NikonCamera.initializeCamera("D3300", "24.2MP", "DX CMOS", "100-12800", "F-Mount", "1080p", "11", "430g", "700 shots", "$299");
        NikonCamera.getCameraDetails();

        boolean cam26 = NikonCamera.initializeCamera("Coolpix P1000", "16.0MP", "BSI CMOS", "100-6400", "Fixed", "4K UHD", null, "1415g", "250 shots", "$999");
        NikonCamera.getCameraDetails();

        boolean cam27 = NikonCamera.initializeCamera("Coolpix P950", "16.0MP", "BSI CMOS", "100-6400", "Fixed", "4K UHD", "Contrast Detect", "1005g", "290 shots", "$799");
        NikonCamera.getCameraDetails();

        boolean cam28 = NikonCamera.initializeCamera("Coolpix B700", "20.2MP", "BSI CMOS", "100-3200", "Fixed", "4K UHD", "Contrast Detect", "565g", "420 shots", "$449");
        NikonCamera.getCameraDetails();

        boolean cam29 = NikonCamera.initializeCamera("Coolpix W300", "16.0MP", "BSI CMOS", "125-6400", "Fixed", "4K UHD", "Contrast Detect", "231g", "280 shots", "$389");
        NikonCamera.getCameraDetails();

        boolean cam30 = NikonCamera.initializeCamera("Df", "16.2MP", "CMOS", "100-12800", "F-Mount", "None", "39", "765g", "1400 shots", "$2749");
        NikonCamera.getCameraDetails();

        boolean cam31 = NikonCamera.initializeCamera("D4s", "16.2MP", "CMOS", "100-25600", "F-Mount", "1080p", "51", "1350g", "3020 shots", "$2999");
        NikonCamera.getCameraDetails();

        boolean cam32 = NikonCamera.initializeCamera("D800", "36.3MP", "CMOS", "100-6400", "F-Mount", "1080p", "51", "", null, "$1299");
        NikonCamera.getCameraDetails();

        boolean cam33 = NikonCamera.initializeCamera("D610", "24.3MP", "CMOS", "100-6400", "F-Mount", "1080p", "39", "850g", "900 shots", "$899");
        NikonCamera.getCameraDetails();

        boolean cam34 = NikonCamera.initializeCamera("D300s", "12.3MP", "DX CMOS", "200-3200", "F-Mount", "720p", "51", "938g", "950 shots", "$499");
        NikonCamera.getCameraDetails();

        boolean cam35 = NikonCamera.initializeCamera("Z90", "33.0MP", "Stacked CMOS", "64-51200", "Z-Mount", "8K UHD", "493", "1100g", "600 shots", "$4500");
        NikonCamera.getCameraDetails();

        boolean cam36 = NikonCamera.initializeCamera("D700", "12.1MP", "CMOS", "200-6400", "F-Mount", "None", "51", "1074g", "1000 shots", "$599");
        NikonCamera.getCameraDetails();

        boolean cam37 = NikonCamera.initializeCamera("Coolpix P900", "16.0MP", "CMOS", "100-6400", "Fixed", "1080p", "Contrast Detect", "899g", "360 shots", "$599");
        NikonCamera.getCameraDetails();
    }
}