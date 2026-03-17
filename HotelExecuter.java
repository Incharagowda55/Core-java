class HotelExecuter
{
	public static void main(String[] args)
	{
		Floor floor = new Floor(101);
		Hotel hotel = new Hotel(1,"sri sai",floor);
		hotel.floor = floor;
		hotel.getHotelDetails();
		
		
	}
}