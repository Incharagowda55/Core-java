class UdemyRunner {
    public static void main(String[] args) {

        System.out.println("Udemy App Started");

        Udemy app = new Udemy();

     
        UdemyAccount u1 = new UdemyAccount();
        u1.setStudentName("Inchara");
        u1.setCourseName("Java Programming");
        u1.setEmail("inchara@gmail.com");
        u1.setPassword("1234@udemy");
        u1.setCoursePrice(499);
        u1.setInstructorName("John");
        u1.setAppName("Udemy");

        System.out.println(app.createAccount(u1));
        app.getAccountDetails();

        System.out.println("------------------");

        
        UdemyAccount u2 = new UdemyAccount();
        u2.setStudentName("Rahul");
        u2.setCourseName("Python Basics");
        u2.setEmail("rahul@gmail.com");
        u2.setPassword("rahul@123");
        u2.setCoursePrice(399);
        u2.setInstructorName("Smith");
        u2.setAppName("Udemy");

        System.out.println(app.createAccount(u2));
        app.getAccountDetails();

        System.out.println("------------------");

       
        UdemyAccount u3 = new UdemyAccount();
        u3.setStudentName("Priya");
        u3.setCourseName("Web Development");
        u3.setEmail("priya@gmail.com");
        u3.setPassword("priya@456");
        u3.setCoursePrice(699);
        u3.setInstructorName("David");
        u3.setAppName("Udemy");

        System.out.println(app.createAccount(u3));
        app.getAccountDetails();

        System.out.println("------------------");

       
        UdemyAccount u4 = new UdemyAccount();
        u4.setStudentName("Arjun");
        u4.setCourseName("Data Structures");
        u4.setEmail("arjun@gmail.com");
        u4.setPassword("arjun@789");
        u4.setCoursePrice(599);
        u4.setInstructorName("Alex");
        u4.setAppName("Udemy");

        System.out.println(app.createAccount(u4));
        app.getAccountDetails();
    }
}