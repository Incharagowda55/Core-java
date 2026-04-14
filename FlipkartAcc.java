class FlipkartAcc{
	private String fullName;
    private String email;
    private String password;
    private String number;
    private String dob ;
    private String gender;
    private String address;



      
	 public void setFullName(String fullName){
		  this.fullName=fullName;
	  }
	  
	  public String getFullName(){
		  return this.fullName;
	  }
	  
	  public String getEmail() { 
	  return email; 
	  }
    public void setEmail(String email) 
	{ 
	this.email = email; 
	}

    public String getPassword() {
		return password; 
		}
    public void setPassword(String password) {
		this.password = password; 
		}
		
		public void setNumber(String number){
			this.number=number;
		}
		public String getNumber(){
			return this.number;
		}
		
         public void setDateofBirth(String dob){
			this.dob=dob;
		}
		public String getDateofBirth(){
			return this.dob;
		}
		
		public void setGender(String gender){
			this.gender=gender;
		}
		public String getGender(){
			return this.gender;
		}
		

         public void setAdreess(String address){
			this.address=address;
		}
		public String getAdreess(){
			return this.address;
		}
}
		

	  