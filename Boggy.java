class Boggy{
	int boggyNumber;
	int seatNumber;
	String coach;
	
	
	public Boggy(int boggyNumber,int seatNumber,String coach)	{
	 this.boggyNumber=boggyNumber;
		this.seatNumber=seatNumber;
		this.coach=coach;
	}
	public void getBoggyDetails(){
		System.out.println("the boggynumber is:"+this.boggyNumber);
		System.out.println("the seatNumber:"+this.seatNumber);
		System.out.println("the coach ia:"+this.coach);
		//System.out.pritnln("the trainId:"+this.coach);
	}
}

		
	