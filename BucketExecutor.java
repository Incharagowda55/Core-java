class BucketExecutor{

	public static void main(String[]args){

		

		Bucket b1=new Bucket();
		b1.bucketCapacity=10;
		b1.bucketType="Plastic";
		b1.bucketColour="Blue";
		b1.displaydetails();
	
	
		Bucket b2=new Bucket();
		b2.bucketCapacity=12;
		b2.bucketType="Steel";
		b2.bucketColour="Silver";
		b2.displaydetails();
		
		Bucket b3=new Bucket();
		b3.bucketCapacity=15;
		b3.bucketType="Plastic";
		b3.bucketColour="Red";
		b3.displaydetails();
		

		Bucket b4=new Bucket();
		b4.bucketCapacity=8;
		b4.bucketType="Fiber";
		b4.bucketColour="Green";
		b4.displaydetails();
		
		
		Bucket b5=new Bucket();
		b5.bucketCapacity=20;
		b5.bucketType="Plastic";
		b5.bucketColour="Yellow";
		b5.displaydetails();
		
		Bucket b6=new Bucket();
		b6.bucketCapacity=18;
		b6.bucketType="Steel";
		b6.bucketColour="Grey";
		b6.displaydetails();
		
		Bucket b7=new Bucket();
		b7.bucketCapacity=10;
		b7.bucketType="Plastic";
		b7.bucketColour="Blue";
		b7.displaydetails();
		
		Bucket b8=new Bucket();
		b8.bucketCapacity=12;
		b8.bucketType="Steel";
		b8.bucketColour="Silver";
		b8.displaydetails();
		
		Bucket b9=new Bucket();
		b9.bucketCapacity=15;
		b9.bucketType="Plastic";
		b9.bucketColour="Red";
		b9.displaydetails();
		
		Bucket b10=new Bucket();
		b10.bucketCapacity=8;
		b10.bucketType="Fiber";
		b10.bucketColour="Green";
		b10.displaydetails();
		
		Bucket b11=new Bucket();
		b11.bucketCapacity=20;
		b11.bucketType="Plastic";
		b11.bucketColour="Yellow";
		b11.displaydetails();
		
		
		Bucket b12=new Bucket();
		b12.bucketCapacity=18;
		b12.bucketType="Steel";
		b12.bucketColour="Grey";
		b12.displaydetails();
		
		Bucket b13=new Bucket();
		b13.bucketCapacity=10;
		b13.bucketType="Plastic";
		b13.bucketColour="Blue";
		b13.displaydetails();
		
		Bucket b14=new Bucket();
		b14.bucketCapacity=12;
		b14.bucketType="Steel";
		b14.bucketColour="Silver";
		b14.displaydetails();
		
		Bucket b15=new Bucket();
		b15.bucketCapacity=15;
		b15.bucketType="Plastic";
		b15.bucketColour="Red";
		b15.displaydetails();
		
		

		System.out.println("Parameterized constructor copies");
		

		Bucket p1=new Bucket(10,"Plastic","Blue");
		p1.displaydetails();
		

		Bucket p2=new Bucket(12,"Steel","Silver");
		p2.displaydetails();

		Bucket p3=new Bucket(15,"Plastic","Red");
		p3.displaydetails();
		
		Bucket p4=new Bucket(8,"Fiber","Green");
		p4.displaydetails();

		Bucket p5=new Bucket(20,"Plastic","Yellow");
		p5.displaydetails();
		
	      Bucket p6=new Bucket(18,"Steel","Grey");
        p6.displaydetails();
        Bucket p7=new Bucket(10,"Plastic","Blue");
       p7.displaydetails();
        Bucket p8=new Bucket(12,"Steel","Silver");
       p8.displaydetails();
        Bucket p9=new Bucket(15,"Plastic","Red");
        p9.displaydetails();
        Bucket p10=new Bucket(8,"Fiber","Green");
        p10.displaydetails();
        Bucket p11=new Bucket(20,"Plastic","Yellow");
        p11.displaydetails();
        Bucket p12=new Bucket(18,"Steel","Grey");
        p12.displaydetails();

        Bucket p13=new Bucket(10,"Plastic","Blue");
        p13.displaydetails();

        Bucket p14=new Bucket(12,"Steel","Silver");
     p14.displaydetails();

        Bucket p15=new Bucket(15,"Plastic","Red");
        p15.displaydetails();


	}
}