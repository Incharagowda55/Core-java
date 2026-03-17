class Hotel{
	int hotelId;
	String hotelName;
	Floor floor;
	
	public Hotel(int hotelId,String hotelName,Floor floor){
		this.hotelId=hotelId;
		this.hotelName=hotelName;
		this.floor=floor;

	public void getHotelDetails()
	{
		System.out.println(this.hotelId);
		System.out.println(this.hotelName);
		//System.out.println(this.floor);
		this.floor.getFloorDetails();
	}
}