class BallExecutor{
	public static void main(String[]args){
		Ball b1 = new Ball("Nike");
		b1.displayDetails();

		Ball b2 = new Ball("Adidas","Football");
		b2.displayDetails();

		Ball b3 = new Ball("Puma","Basketball","Orange");
		b3.displayDetails();

		Ball b4 = new Ball("Cosco","Cricket","Red",0.5);
		b4.displayDetails();

		Ball b5 = new Ball("Nivia","Football","White",0.45,11.0);
		b5.displayDetails();

		Ball b6 = new Ball("Wilson","Tennis","Yellow",0.3,6.5,"Rubber");
		b6.displayDetails();

		Ball b7 = new Ball("Spalding","Basketball","Orange",0.6,12.0,"Leather",true);
		b7.displayDetails();

		Ball b8 = new Ball("SG","Cricket","Red",0.4,7.2,"Leather",false,800);
		b8.displayDetails();

		Ball b9 = new Ball("Puma","Football","White",0.5,11.0,"Synthetic",true,1200,"Football");
		b9.displayDetails();

		Ball b10 = new Ball("Nike","Basketball","Brown",0.7,12.0,"Rubber",true,1500,"Basketball","Striped");
		b10.displayDetails();

		Ball b11 = new Ball("Adidas","Football","White",0.5,11.0,"Synthetic",true,1400,"Football","Classic",true);
		b11.displayDetails();

		Ball b12 = new Ball("Cosco","Cricket","Red",0.4,7.2,"Leather",false,900,"Cricket","Plain",false,10);
		b12.displayDetails();
}

}
