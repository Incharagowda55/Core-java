class FlipkartArr{
	
         
         FlipkartAcc flipkartaccs[]=new FlipkartAcc[19];
		 int index;
		 
		 
		 public boolean createaccount(FlipkartAcc flipkart){
			 boolean isacccreated=false;
			 boolean isnamesvalid=false;
			 boolean isemailvalid=false;
			boolean ispasswordvalid=false;
			boolean isnumbervalid=false;
			 boolean isdobvalid=false;
			boolean isgendervalid=false;
			boolean isaddressvalid=false;
			 
			 
			 String fulnme=flipkart.getFullName();
			 if(fulnme!=null && !fulnme.isEmpty()){
			 isnamesvalid=true;
			 }
			 else{
				 System.out.println("not valid");
			 }
			 
			 
			 String email=flipkart.getEmail();
			 if(email!=null && !email.isEmpty()){
			 isemailvalid=true;
			 }
			 else{
				 System.out.println("not valid");
			 }
			 
			  String pwd=flipkart.getPassword();
			 if(pwd!=null && !pwd.isEmpty()){
			 ispasswordvalid=true;
			 }
			 else{
				 System.out.println("not valid");
			 }
			 
			 String num=flipkart.getNumber();
			 if(num!=null && !num.isEmpty()){
			 isnumbervalid=true;
			 }
			 else{
				 System.out.println("not valid");
			 }
			 
			 String dobs=flipkart.getDateofBirth();
			 if(dobs!=null && !dobs.isEmpty()){
			 isdobvalid=true;
			 }
			 else{
				 System.out.println("not valid");
			 }
			 
			 
			 String gen=flipkart.getGender();
			 if(gen!=null && !gen.isEmpty()){
			 isgendervalid=true;
			 }
			 else{
				 System.out.println("not valid");
			 }
			 
			 
			 
			 String addr=flipkart.getAdreess();
			 if(addr!=null && !addr.isEmpty()){
			 isaddressvalid=true;
			 }
			 else{
				 System.out.println("not valid");
			 }
			 
			 if(isnamesvalid && isemailvalid && ispasswordvalid && isnumbervalid && isdobvalid && isgendervalid &&isaddressvalid){
				 this.flipkartaccs[index++]=flipkart;
				 isacccreated=true;
			 }
			 return isacccreated;
		 }
		 
		 
		 public void getAccdetails(){
			  System.out.println("List of acc created are:");

			 for(int i=0;i<index;i++){
				 FlipkartAcc flipkart=flipkartaccs[i];
        System.out.println("----------------");
        System.out.println("----- Account Details -----");
        System.out.println("First Name: " + flipkart.getFullName());
        System.out.println("mail: " + flipkart.getEmail());
        System.out.println("pwd: " + flipkart.getPassword());
        System.out.println("number: " + flipkart.getNumber());
        System.out.println("dob is: " + flipkart.getDateofBirth());
        System.out.println("gender is: " + flipkart.getGender());
        System.out.println("Adreeess is : " + flipkart.getAdreess());
    }
		 }
}
				 
				 
		 
			 
			 
			 
			 
			 
			 
			 
		 
			 
			 
			 
	