class PassportRunner {
    public static void main(String[] args) {

        System.out.println("Passport App Started");

        Passport app = new Passport();

        
        PassportUser u1 = new PassportUser();
        u1.setUserName("Inchara");
        u1.setPassportNumber("P1234567");
        u1.setNationality("Indian");
        u1.setDob("03-09-2004");
        u1.setGender("Female");
        u1.setAddress("Bangalore");
        u1.setAppName("PassportApp");

        System.out.println(app.createAccount(u1));
        app.getUserDetails();

        System.out.println("------------------");

        
        PassportUser u2 = new PassportUser();
        u2.setUserName("Rahul");
        u2.setPassportNumber("P7654321");
        u2.setNationality("Indian");
        u2.setDob("12-05-1998");
        u2.setGender("Male");
        u2.setAddress("Mysore");
        u2.setAppName("PassportApp");

        System.out.println(app.createAccount(u2));
        app.getUserDetails();

        System.out.println("------------------");

        PassportUser u3 = new PassportUser();
        u3.setUserName("Priya");
        u3.setPassportNumber("P9876543");
        u3.setNationality("Indian");
        u3.setDob("22-08-2000");
        u3.setGender("Female");
        u3.setAddress("Hubli");
        u3.setAppName("PassportApp");

        System.out.println(app.createAccount(u3));
        app.getUserDetails();

        System.out.println("------------------");

        PassportUser u4 = new PassportUser();
        u4.setUserName("Arjun");
        u4.setPassportNumber("P4567890");
        u4.setNationality("Indian");
        u4.setDob("15-01-1995");
        u4.setGender("Male");
        u4.setAddress("Mangalore");
        u4.setAppName("PassportApp");

        System.out.println(app.createAccount(u4));
        app.getUserDetails();
    }
}