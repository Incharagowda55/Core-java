class HP{
	
	Laptop lap=new Laptop(); //if we not initiliaze the lap=new the null pointer exception becoz of default value
	
	public boolean addlaptop(int laptopid,String laptopname,String laptopversion,String laptopprice){
		
		boolean isadded=false;
		System.out.println(this.lap);
		this.lap.laptopid=laptopid;
		this.lap.laptopname=laptopname;
		this.lap.laptopversion=laptopversion;
		this.lap.laptopprice=laptopprice;
		
		
		isadded=true;
		return isadded;
	}
	
	public void getlaptopdetails(){
		System.out.println("the laptop ID is:"+this.lap.laptopid);
		
		System.out.println("the laptop Nmae is:"+this.lap.laptopname);

		System.out.println("the laptop Vesrion is:"+this.lap.laptopversion);

		System.out.println("the laptop Price is:"+this.lap.laptopprice);

		
	}
}
		

		
		
		
	
	