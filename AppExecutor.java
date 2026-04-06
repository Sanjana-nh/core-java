class AppExecutor{
public static void main(String[] args){
AppManager am=new AppManager();
/*String appNames[] = new String [5];
am.appNames = appNames ; this is also doable */

am.addAppName("instagram");
am.addAppName("snapchat");
am.addAppName("facebook");
am.addAppName("youtube");

am.getAppName();
am.getAppNameByIndex(3);

am.getIndexByAppName("twitter");
am.updateAppNames("instagram", "X");
am.getAppName();
am.deleteAppName("snapchat");
am.getAppName();
}
}