class HDFC{
	BankAcc bacc=new BankAcc();
	
	public boolean addacc(int accid,String accname,String typeofacc,int balance){
		boolean isacccreated=false;
		System.out.println(this.bacc);
		this.bacc.accid =accid;
		this.bacc.accname=accname;
		this.bacc.typeofacc=typeofacc;
		this.bacc.balance=balance;
		 isacccreated=true;
		 return isacccreated;
	}

   public void getaccdetails(){
	   System.out.println("strted");
	   System.out.println("the accid is:"+this.bacc.accid);
	   System.out.println("the accid is:"+this.bacc.accname);
	   System.out.println("the accid is:"+this.bacc.typeofacc);
	   System.out.println("the accid is:"+this.bacc.balance);
   }
}
	   
	   
		
		
		
	