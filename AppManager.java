class AppManager{
private String appNames[]=new String[4];//u dont know what data to add but uk how many data to add
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
	for(String appName:appNames){
		System.out.println(appName);
	}
}
}