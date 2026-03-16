class HotelRunner{
	public static void main(String [] args){
	
	Hotel hotel = new Hotel();
	hotel.hotelId = 576 ;
	
	Floor floor = new Floor();
	floor.floorNo = 5;
	Room room = new Room();
	
	floor.room=room;
	hotel.floor=floor;
	
	hotel.getHotelDetails();
	
	}


}