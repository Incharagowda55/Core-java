class TwitterRunner{
	public static void main(String [] args){
		
		user use=new user();
		Twitter twt=new Twitter(201,use);

		System.out.println("main strted");
		
		twt.getTwitterDetails();

		use.id=1;
		use.name="amith";
		use.email="amilth@gmail.com";
		use.dob="12/03/2001";
		use.age="29";
		
		
		System.out.println("twitter styrted");
		
		

		twt.getTwitterDetails();
	}
}
		
		
