class Bucket{

	int bucketCapacity;
	String bucketType;
	String bucketColour;

	public Bucket(){
		
	}

	public Bucket(int bucketCapacity,String bucketType,String bucketColour){
		this.bucketCapacity=bucketCapacity;
		this.bucketType=bucketType;
		this.bucketColour=bucketColour;
	}
	public void displaydetails(){
		System.out.println("the bucket capacity is:"+this.bucketCapacity);
		System.out.println("the bucket type is:"+this.bucketType);
		System.out.println("the bucket colour is:"+this.bucketColour);
	}
		
}