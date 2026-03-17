class Jacket{

	String jacketBrand;
	String jacketSize;
	String jacketColour;
	int jacketPrice;
	String jacketType;

	Jacket(){
		System.out.println("Default constructor invoked");
	}

	Jacket(String jacketBrand,String jacketSize,String jacketColour,int jacketPrice,String jacketType){
		this.jacketBrand=jacketBrand;
		this.jacketSize=jacketSize;
		this.jacketColour=jacketColour;
		this.jacketPrice=jacketPrice;
		this.jacketType=jacketType;
	}
}