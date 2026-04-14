class FlyingMachineRunner {
    public static void main(String[] args) {

        System.out.println("Flying Machine App Started");

        FlyingMachine app = new FlyingMachine();

       
        FlyingMachineAccount u1 = new FlyingMachineAccount();
        u1.setCustomerName("Inchara");
        u1.setProductName("Jeans");
        u1.setSize("M");
        u1.setColor("Blue");
        u1.setPrice(1999);
        u1.setEmail("inchara@gmail.com");
        u1.setAppName("FlyingMachine");

        System.out.println(app.createAccount(u1));
        app.getAccountDetails();

        System.out.println("------------------");

        FlyingMachineAccount u2 = new FlyingMachineAccount();
        u2.setCustomerName("Rahul");
        u2.setProductName("T-Shirt");
        u2.setSize("L");
        u2.setColor("Black");
        u2.setPrice(999);
        u2.setEmail("rahul@gmail.com");
        u2.setAppName("FlyingMachine");

        System.out.println(app.createAccount(u2));
        app.getAccountDetails();

        System.out.println("------------------");

       
        FlyingMachineAccount u3 = new FlyingMachineAccount();
        u3.setCustomerName("Priya");
        u3.setProductName("Jacket");
        u3.setSize("S");
        u3.setColor("Red");
        u3.setPrice(2499);
        u3.setEmail("priya@gmail.com");
        u3.setAppName("FlyingMachine");

        System.out.println(app.createAccount(u3));
        app.getAccountDetails();

        System.out.println("------------------");

       
        FlyingMachineAccount u4 = new FlyingMachineAccount();
        u4.setCustomerName("Arjun");
        u4.setProductName("Shirt");
        u4.setSize("XL");
        u4.setColor("White");
        u4.setPrice(1499);
        u4.setEmail("arjun@gmail.com");
        u4.setAppName("FlyingMachine");

        System.out.println(app.createAccount(u4));
        app.getAccountDetails();
    }
}