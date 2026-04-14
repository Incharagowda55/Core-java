class LG{
	Fridge fridge;
	
	public boolean addfridge(Fridge fri){
		System.out.println("inside acc");
		System.out.println(fri);
	     System.out.println(this.fridge);
		 this.fridge=fri;
		 System.out.println(this.fridge);

		  return true;
	}


      
   public void getfridgetopdetails(){
		System.out.println("the fridgetop ID is:"+this.fridge.fridgeid);
		
		System.out.println("the fridgetop Nmae is:"+this.fridge.fridgename);

		System.out.println("the fridgetop Vesrion is:"+this.fridge.fridgeversion);

		System.out.println("the fridgetop Price is:"+this.fridge.fridgeprice);

		
	}
}
		
		 

		
	