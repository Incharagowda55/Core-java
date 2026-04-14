class Udemy {

    private UdemyAccount account;

    public boolean createAccount(UdemyAccount account) {

        boolean isCreated = false;

        boolean isStudentValid = false;
        boolean isCourseValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isPriceValid = false;
        boolean isInstructorValid = false;
        boolean isAppNameValid = false;

        String student = account.getStudentName();
        if (student != null && !student.isEmpty()) {
            isStudentValid = true;
        } else {
            System.out.println("Invalid Student Name");
        }

        String course = account.getCourseName();
        if (course != null && !course.isEmpty()) {
            isCourseValid = true;
        } else {
            System.out.println("Invalid Course Name");
        }

        String email = account.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Invalid Email");
        }

        String pwd = account.getPassword();
        if (pwd != null && !pwd.isEmpty()) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        double price = account.getCoursePrice();
        if (price > 0) {
            isPriceValid = true;
        } else {
            System.out.println("Invalid Course Price");
        }

        String instructor = account.getInstructorName();
        if (instructor != null && !instructor.isEmpty()) {
            isInstructorValid = true;
        } else {
            System.out.println("Invalid Instructor Name");
        }

        String app = account.getAppName();
        if (app != null && !app.isEmpty()) {
            isAppNameValid = true;
        } else {
            System.out.println("Invalid App Name");
        }

        if (isStudentValid && isCourseValid && isEmailValid &&
            isPasswordValid && isPriceValid &&
            isInstructorValid && isAppNameValid) {

            this.account = account;
            isCreated = true;
        }

        return isCreated;
    }

    public void getAccountDetails() {
        if (account != null) {
            System.out.println("----- Udemy Account Details -----");
            System.out.println("Student Name: " + account.getStudentName());
            System.out.println("Course Name: " + account.getCourseName());
            System.out.println("Email: " + account.getEmail());
            System.out.println("Password: " + account.getPassword());
            System.out.println("Course Price: " + account.getCoursePrice());
            System.out.println("Instructor: " + account.getInstructorName());
            System.out.println("App Name: " + account.getAppName());
        } else {
            System.out.println("No account created");
        }
    }
}