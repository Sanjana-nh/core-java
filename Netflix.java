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
 
 }