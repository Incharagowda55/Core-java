class KarnatakaBank{
	BankAcc1 bacc;
	
	public boolean addacc(BankAcc1 bankacc){
		boolean isacccreated=false;
		System.out.println("strted");
		System.out.println(this.bacc);
	   System.out.println(bankacc);
	   this.bacc=bankacc;
	   	System.out.println(this.bacc);

	  
		 isacccreated=true;
		 return isacccreated;
	}

   public void getaccdetails(){
	   System.out.println("strted");
	   System.out.println("the acc id is:"+this.bacc.accid);
	   System.out.println("the acc name is:"+this.bacc.accname);
	   System.out.println("the acc type is:"+this.bacc.typeofacc);
	   System.out.println("the acc balance is :"+this.bacc.balance);
   }
}
	   
	   
		
		
		
	