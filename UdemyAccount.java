class UdemyAccount {

    private String studentName;
    private String courseName;
    private String email;
    private String password;
    private double coursePrice;
    private String instructorName;
    private String appName;


    public void setStudentName(String studentName) { this.studentName = studentName; }
    public String getStudentName() { return studentName; }

    public void setCourseName(String courseName) { this.courseName = courseName; }
    public String getCourseName() { return courseName; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }

    public void setPassword(String password) { this.password = password; }
    public String getPassword() { return password; }

    public void setCoursePrice(double coursePrice) { this.coursePrice = coursePrice; }
    public double getCoursePrice() { return coursePrice; }

    public void setInstructorName(String instructorName) { this.instructorName = instructorName; }
    public String getInstructorName() { return instructorName; }

    public void setAppName(String appName) { this.appName = appName; }
    public String getAppName() { return appName; }
}