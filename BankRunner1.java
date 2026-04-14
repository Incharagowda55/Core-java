class BankRunner1{
	public static void main(String[] args){
		
		KarnatakaBank hfc=new KarnatakaBank();
		
		BankAcc1 bc= new BankAcc1();
		
		hfc.addacc(bc);
		
		hfc.getaccdetails();
	}
}