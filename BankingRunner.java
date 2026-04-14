class BankingRunner {
    public static void main(String[] args) {

        System.out.println("Banking App Started");

        BankingApp app = new BankingApp();

        BankAccount u1 = new BankAccount();
        u1.setAccountHolderName("Inchara");
        u1.setAccountNumber("1234567890");
        u1.setBankName("SBI");
        u1.setBalance(5000);
        u1.setIfscCode("SBIN0001234");
        u1.setPhoneNumber("9876543210");
        u1.setAppName("BankApp");

        System.out.println(app.createAccount(u1));
        app.getAccountDetails();

        System.out.println("------------------");

        BankAccount u2 = new BankAccount();
        u2.setAccountHolderName("Rahul");
        u2.setAccountNumber("9876543210");
        u2.setBankName("HDFC");
        u2.setBalance(10000);
        u2.setIfscCode("HDFC0005678");
        u2.setPhoneNumber("9123456780");
        u2.setAppName("BankApp");

        System.out.println(app.createAccount(u2));
        app.getAccountDetails();

        System.out.println("------------------");

    
        BankAccount u3 = new BankAccount();
        u3.setAccountHolderName("Priya");
        u3.setAccountNumber("4567891230");
        u3.setBankName("ICICI");
        u3.setBalance(7500);
        u3.setIfscCode("ICIC0004321");
        u3.setPhoneNumber("9988776655");
        u3.setAppName("BankApp");

        System.out.println(app.createAccount(u3));
        app.getAccountDetails();

        System.out.println("------------------");

        BankAccount u4 = new BankAccount();
        u4.setAccountHolderName("Arjun");
        u4.setAccountNumber("3216549870");
        u4.setBankName("Axis");
        u4.setBalance(12000);
        u4.setIfscCode("UTIB0009876");
        u4.setPhoneNumber("9090909090");
        u4.setAppName("BankApp");

        System.out.println(app.createAccount(u4));
        app.getAccountDetails();
    }
}