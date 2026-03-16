class Hotel{
	int hotelId;
	Floor floor;  //Custoum type 
	
	public void getHotelDetails(){
		
		System.out.println("The Hotel Id :"+hotelId);
		this.floor.getFloorDetails();
		
	}

}