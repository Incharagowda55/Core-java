class FacebookRunner {
    public static void main(String[] args) {

        System.out.println("Main started");

        UserAccount user = new UserAccount();

        user.setFirstName("Likhitha");
        user.setLastName("BS");
        user.setDob("03-09-2004");
        user.setGender("Female");
        user.setEmail("likhitha@gmail.com");
        user.setPassword("1234@23");
        user.setAppName("Facebook"); 
		// String apps[] = {"Facebook", "Instagram", "X"};
       // user.setAppName(apps);

        Fcaebook1 fb = new Fcaebook1();

    
        boolean result = fb.createAccount(user);

        System.out.println("Account Created: " + result);

    
       
	
    
        UserAccount user1 = new UserAccount();
        user1.setFirstName("Inchara ");
        user1.setLastName("Gowda");
        user1.setDob("15-06-2004");
        user1.setGender("Female");
        user1.setEmail("Inchara@gmail.com");
        user1.setPassword("126789");
        user1.setAppName("Insta");

        boolean result1 = fb.createAccount(user1);
        System.out.println("User1 Created: " + result1);
      

        System.out.println("---------------------");

       
        UserAccount user2 = new UserAccount();
        user2.setFirstName("Rohit");
        user2.setLastName("Sharma");
        user2.setDob("30-04-1987");
        user2.setGender("Male");
        user2.setEmail("rohit@gmail.com");
        user2.setPassword("rohit@123");
        user2.setAppName("Facebook");

        boolean result2 = fb.createAccount(user2);
        System.out.println("User2 Created: " + result2);
     

        System.out.println("---------------------");

        
        UserAccount user3 = new UserAccount();
        user3.setFirstName("Anusha");
        user3.setLastName("ks");
        user3.setDob("05-11-1988");
        user3.setGender("Female");
        user3.setEmail("anusha@gmail.com");
        user3.setPassword("anu@18");
        user3.setAppName("X");

        boolean result3 = fb.createAccount(user3);
        System.out.println("User3 Created: " + result3);
       
        System.out.println("---------------------");

      
        UserAccount user4 = new UserAccount();
        user4.setFirstName("Mohith");
        user4.setLastName("Sharma");
        user4.setDob("01-05-1988");
        user4.setGender("amle");
        user4.setEmail("mohith@gmail.com");
        user4.setPassword("mohith@gmail@123");
        user4.setAppName("utube");

        boolean result4 = fb.createAccount(user4);
        System.out.println("User4 Created: " + result4);
		
		
		
		
        fb.getAccountDetails();
    }
}
		