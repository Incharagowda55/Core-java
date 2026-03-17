class MobileBillExecutor{ 
	public static void main(String[] bill){
		
		MobileBill mbill=new MobileBill();
		//refncename with variable 
		mbill.billId=010;
		mbill.billAmount=300.00;
	    mbill.isFianlBill=true; 
	    mbill.isLatestBill=false;
	    mbill.isBillOverDue=false;
	    mbill.billIssueDate="03-02-2025";
	    mbill.billDueDate="03-04-2025";
	    mbill.billInvoice="1234567";
		System.out.println(mbill.billId);//for each member so non static use if we use static bill will go to all member the same bill
		
		
	}
}