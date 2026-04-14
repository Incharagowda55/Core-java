class SwiggyRunner {
    public static void main(String[] args) {

        System.out.println("Swiggy App Started");

        SwiggyAccount user = new SwiggyAccount();

     
        user.setCustomerName("Inchara");
        user.setPhoneNumber("9876543210");
        user.setAddress("Bangalore");
        user.setEmail("inchara@gmail.com");
        user.setPassword("1234@swiggy");
        user.setAppName("Swiggy");

        Swiggy swiggy = new Swiggy();

        boolean result = swiggy.createAccount(user);

        System.out.println("Account Created: " + result);

        swiggy.getAccountDetails();
		
		
		
      
        SwiggyAccount user1 = new SwiggyAccount();
        user1.setCustomerName("Inchara");
        user1.setPhoneNumber("9876543210");
        user1.setAddress("Bangalore");
        user1.setEmail("inchara@gmail.com");
        user1.setPassword("1234@swiggy");
        user1.setAppName("Swiggy");

        boolean res1 = swiggy.createAccount(user1);
        System.out.println("User1 Created: " + res1);
        swiggy.getAccountDetails();

        System.out.println("----------------------");

   
        SwiggyAccount user2 = new SwiggyAccount();
        user2.setCustomerName("Rahul");
        user2.setPhoneNumber("9123456780");
        user2.setAddress("Mysore");
        user2.setEmail("rahul@gmail.com");
        user2.setPassword("rahul@123");
        user2.setAppName("Swiggy");

        boolean res2 = swiggy.createAccount(user2);
        System.out.println("User2 Created: " + res2);
        swiggy.getAccountDetails();

        System.out.println("----------------------");


        SwiggyAccount user3 = new SwiggyAccount();
        user3.setCustomerName("Priya");
        user3.setPhoneNumber("9988776655");
        user3.setAddress("Hubli");
        user3.setEmail("priya@gmail.com");
        user3.setPassword("priya@456");
        user3.setAppName("Swiggy");

        boolean res3 = swiggy.createAccount(user3);
        System.out.println("User3 Created: " + res3);
        swiggy.getAccountDetails();

        System.out.println("----------------------");

 
        SwiggyAccount user4 = new SwiggyAccount();
        user4.setCustomerName("Arjun");
        user4.setPhoneNumber("9090909090");
        user4.setAddress("Mangalore");
        user4.setEmail("arjun@gmail.com");
        user4.setPassword("arjun@789");
        user4.setAppName("Swiggy");

        boolean res4 = swiggy.createAccount(user4);
        System.out.println("User4 Created: " + res4);
        swiggy.getAccountDetails();

        System.out.println("----------------------");

       
        SwiggyAccount user5 = new SwiggyAccount();
        user5.setCustomerName("Sneha");
        user5.setPhoneNumber("9012345678");
        user5.setAddress("Shimoga");
        user5.setEmail("sneha@gmail.com");
        user5.setPassword("sneha@321");
        user5.setAppName("Swiggy");

        boolean res5 = swiggy.createAccount(user5);
        System.out.println("User5 Created: " + res5);
        swiggy.getAccountDetails();
    }
}
    