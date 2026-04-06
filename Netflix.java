 // Netflix - String webSeries = new String[18]; addWebSeries(String webSeries) getWebSeries(){ for() } 
 class Netflix {
 String webSeries[] = new String[18];
 int index ;
 
 public boolean addWebSeries(String webSerie){
	 boolean isWebSeriesAdded = false ;
	 if (webSerie != null && !webSerie.isEmpty()){
		 webSeries[index] = webSerie;
		 index ++ ;
		 isWebSeriesAdded = true ; 
	 }
	 else {
		 System.out.println (webSerie + "is invalid");
	 }
	 return isWebSeriesAdded;
 }
 public void getWebSeries(){
	for(String webSerie:webSeries){
		System.out.println(webSerie);
	}
}
public String getWebSeriesByIndex (int index){
	String webSerie = null ;
	if (index < webSeries .length){
		webSerie  = webSeries [index];
		System.out.println("The webSerie  at index " + index  +" is: " + webSerie );
	}
	else {
		System.out.println("In valid value " + index);
	}
	return webSerie ;
}

	public int getIndexByWebSeries(String webSerie ){
	int index = 0;
    for (String cwebSerie  : webSeries ) {
        if (cwebSerie  == webSerie  ) {
			System.out.println("The index of " + cwebSerie  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}
public boolean updateWebSeries(String existingWebSerie , String updateWebSerie){
    boolean isWebSeriesUpdated = false;
    for(int index = 0 ; index< webSeries.length;index++){
        if (webSeries[index] == existingWebSerie){
            webSeries[index] = updateWebSerie ;
            isWebSeriesUpdated = true;
            System.out.println("The updated name of " + existingWebSerie + " is :" + updateWebSerie);
        }
    }
    if (isWebSeriesUpdated == false){
        System.out.println("Faild to Update the Data");
    }
    return isWebSeriesUpdated;
}

public boolean deleteWebSeries(String webSerie){
    boolean isWebSeriesDeleted = false;

    for(int index = 0; index < webSeries.length; index++){
        if(webSeries[index] != null && webSeries[index].equals(webSerie)){
            webSeries[index] = null;
            isWebSeriesDeleted = true;
            System.out.println(webSerie+ " is deleted");
            break;
        }
    }

    if(isWebSeriesDeleted == false){
        System.out.println(webSerie + " not found");
    }

    return isWebSeriesDeleted;
}
 
 }