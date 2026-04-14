class JioHotstar {

    // instance variable
    private JioHotstarAccount account;

    public boolean createAccount(JioHotstarAccount account) {

        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isPhoneValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isSubscriptionValid = false;
        boolean isAppNameValid = false;

        
        String name = account.getUserName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        } else {
            System.out.println("Invalid Username");
        }

      
        String phone = account.getPhoneNumber();
        if (phone != null && phone.length() == 10) {
            isPhoneValid = true;
        } else {
            System.out.println("Invalid Phone Number");
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

        
        String sub = account.getSubscriptionType();
        if (sub != null && !sub.isEmpty()) {
            isSubscriptionValid = true;
        } else {
            System.out.println("Invalid Subscription Type");
        }

        String app = account.getAppName();
        if (app != null && !app.isEmpty()) {
            isAppNameValid = true;
        } else {
            System.out.println("Invalid App Name");
        }

        if (isNameValid && isPhoneValid && isEmailValid &&
            isPasswordValid && isSubscriptionValid && isAppNameValid) {

            this.account = account;
            isCreated = true;
        }

        return isCreated;
    }

    public void getAccountDetails() {
        if (account != null) {
            System.out.println("----- JioHotstar Account Details -----");
            System.out.println("User Name: " + account.getUserName());
            System.out.println("Phone: " + account.getPhoneNumber());
            System.out.println("Email: " + account.getEmail());
            System.out.println("Password: " + account.getPassword());
            System.out.println("Subscription: " + account.getSubscriptionType());
            System.out.println("App Name: " + account.getAppName());
        } else {
            System.out.println("No account created");
        }
    }
}