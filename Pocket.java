class Pocket{

	String pocketBrand;
	String pocketSize;
	String pocketColour;
	String pocketMaterial;
	int pocketPrice;

	Pocket(){
		System.out.println("Default constructor invoked");
	}

	Pocket(String pocketBrand,String pocketSize,String pocketColour,String pocketMaterial,int pocketPrice){
		this.pocketBrand=pocketBrand;
		this.pocketSize=pocketSize;
		this.pocketColour=pocketColour;
		this.pocketMaterial=pocketMaterial;
		this.pocketPrice=pocketPrice;
	}
}