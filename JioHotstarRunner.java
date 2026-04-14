class JioHotstarRunner {
    public static void main(String[] args) {

        System.out.println("JioHotstar App Started");

        JioHotstar app = new JioHotstar();

     
        JioHotstarAccount u1 = new JioHotstarAccount();
        u1.setUserName("Inchara");
        u1.setPhoneNumber("9876543210");
        u1.setEmail("inchara@gmail.com");
        u1.setPassword("inch@123");
        u1.setSubscriptionType("Premium");
        u1.setAppName("JioHotstar");

        System.out.println(app.createAccount(u1));
        app.getAccountDetails();

        System.out.println("------------------");

        
        JioHotstarAccount u2 = new JioHotstarAccount();
        u2.setUserName("Rahul");
        u2.setPhoneNumber("9123456780");
        u2.setEmail("rahul@gmail.com");
        u2.setPassword("rahul@123");
        u2.setSubscriptionType("Basic");
        u2.setAppName("JioHotstar");

        System.out.println(app.createAccount(u2));
        app.getAccountDetails();

        System.out.println("------------------");

     
        JioHotstarAccount u3 = new JioHotstarAccount();
        u3.setUserName("Priya");
        u3.setPhoneNumber("9988776655");
        u3.setEmail("priya@gmail.com");
        u3.setPassword("priya@456");
        u3.setSubscriptionType("Premium");
        u3.setAppName("JioHotstar");

        System.out.println(app.createAccount(u3));
        app.getAccountDetails();

        System.out.println("------------------");

      
        JioHotstarAccount u4 = new JioHotstarAccount();
        u4.setUserName("Arjun");
        u4.setPhoneNumber("9090909090");
        u4.setEmail("arjun@gmail.com");
        u4.setPassword("arjun@789");
        u4.setSubscriptionType("VIP");
        u4.setAppName("JioHotstar");

        System.out.println(app.createAccount(u4));
        app.getAccountDetails();
    }
}