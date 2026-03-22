public class ComedyShowRunner {
    public static void main(String[] args) {
        ComedyShow defaultShow = new ComedyShow();
        ComedyShow customShow = new ComedyShow("Mind It", "Kanan Gill", "NCPA", "Mumbai", "2024-06-15", "20:00", "English", "None", "Paytm Insider", 800, 50, 90, 18, 1499.0, 4.8, 0.0, false, false, false, true);

        System.out.println("Default Show: " + defaultShow.showName + " | Comedian: " + defaultShow.leadComedian);
        System.out.println("Custom Show: " + customShow.showName + " | Comedian: " + customShow.leadComedian);
    }
}