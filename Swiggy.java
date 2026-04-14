class Swiggy {

    SwiggyAccount account;

    public boolean createAccount(SwiggyAccount account) {

        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isPhoneValid = false;
        boolean isAddressValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isAppNameValid = false;

        // Name
        String name = account.getCustomerName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        } else {
            System.out.println("Invalid Name");
        }

      
        String phone = account.getPhoneNumber();
        if (phone != null && phone.length() == 10) {
            isPhoneValid = true;
        } else {
            System.out.println("Invalid Phone Number");
        }

        
        String address = account.getAddress();
        if (address != null && !address.isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Invalid Address");
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

        
        String appName = account.getAppName();
        if (appName != null && !appName.isEmpty()) {
            isAppNameValid = true;
        } else {
            System.out.println("Invalid App Name");
        }

        
        if (isNameValid && isPhoneValid && isAddressValid &&
            isEmailValid && isPasswordValid && isAppNameValid) {

            this.account = account;
            isCreated = true;
        }

        return isCreated;
    }

    public void getAccountDetails() {
        if (account != null) {
            System.out.println("----- Swiggy Account Details -----");
            System.out.println("Name: " + account.getCustomerName());
            System.out.println("Phone: " + account.getPhoneNumber());
            System.out.println("Address: " + account.getAddress());
            System.out.println("Email: " + account.getEmail());
            System.out.println("Password: " + account.getPassword());
            System.out.println("App Name: " + account.getAppName());
        } else {
            System.out.println("No account created");
        }
    }
}