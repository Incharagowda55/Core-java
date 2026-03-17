class Train{
	int trainId;
	String trainName;
	Boggy boggy;
	
	
	public Train(int trainId,String trainName,Boggy boggy){
		this.trainId=trainId;
		this.trainName=trainName;
		this.boggy=boggy;
	}
	public void getTrainDetails(){
		System.out.println("the trainId:"+this.trainId);
		System.out.println("the trainname:"+this.trainName);
		//System.out.pritnln("the trainId:"+this.boggy);
		this.boggy.getBoggyDetails();
		
	}
}
		
	
	
	