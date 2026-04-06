class AppManager{
public String appNames[]=new String[4];//u dont know what data to add but uk how many data to add
int index;

//Datatype arrayName=new Datatype[size];
//or   Datatype arrayName[]={ref,ref....ref};//when uk what data to add.

public boolean addAppName(String appName){
boolean isAppAdded=false;
if(appName!=null && !appName.isEmpty()){
appNames[index]=appName;
index++;
isAppAdded=true;	
}
else{
System.out.println(appName+"is invalid");
}

return isAppAdded;
}

public void getAppName(){
	System.out.println("The list of Apps are :");
	for(String appName:appNames)
	{	if(appName != null)
		System.out.println(appName);
	}
}

public String getAppNameByIndex (int index){
	String appName = null ;
	if (index < appNames.length){
		appName = appNames[index];
		System.out.println("The app at index "+ index  +" is: " + appName);
	}
	else {
		System.out.println("In valid value " + index);
	}
	return appName;
}

public int getIndexByAppName(String appName){
	int index = 0;
    for (String appNamee : appNames) {
        if (appNamee == appName ) {
			System.out.println("The index of " + appNamee + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid App Name");

	return index ;
}

public boolean updateAppNames(String existingAppName , String updateAppName){
	boolean isAppNameUpdated = false;
	for(int index = 0 ; index< appNames.length;index++){
		if (appNames[index] == existingAppName){
			appNames[index] = updateAppName ;
			isAppNameUpdated = true;
			System.out.println("The updated name of " + existingAppName + " is :" + updateAppName);
		}
		
	}
	if (isAppNameUpdated == false){
		System.out.println("Faild to Update the Data");
	}
	return isAppNameUpdated;
}

public boolean deleteAppName(String appName){
    boolean isAppDeleted = false;

    for(int index = 0; index < appNames.length; index++){
        if(appNames[index] != null && appNames[index].equals(appName)){
            appNames[index] = null;
            isAppDeleted = true;
            System.out.println(appName + " is deleted");
            break;
        }
    }

    if(isAppDeleted == false){
        System.out.println(appName + " not found");
    }

    return isAppDeleted;
}
}