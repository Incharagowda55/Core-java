class Twitter{
	
	int twitterId;
	user userr;
	
	public Twitter(int twitterId,user users){
		this.twitterId=twitterId;
		this.userr=users;
	}
	
	public void getTwitterDetails(){
		System.out.println("the twitter id is:"+this.twitterId);

		System.out.println("the  user id is:"+this.userr.id);
		System.out.println("the user id is:"+this.userr.name);
		System.out.println("the user id is:"+this.userr.email);
		System.out.println("the user id is:"+this.userr.dob);
		System.out.println("the user id is:"+this.userr.age);


}
}