class Fcaebook1{
	//string classnames[]=new string[5];
	UserAccount userAccounts[]=new UserAccount[5];
	// class     arayvaariable
	int index;
    public boolean createAccount(UserAccount userAccount){
                                    //class   //paramterrrr
        boolean isAccountCreated = false;

        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isDobValid = false;
        boolean isGenderValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isAppNameValid = false;

                        //parametre
        String fName = userAccount.getFirstName();
        if (fName != null && !fName.isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Invalid First Name");
        }

      
        String lName = userAccount.getLastName();
        if (lName != null && !lName.isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Invalid Last Name");
        }

       
        String dob = userAccount.getDob();
        if (dob != null && !dob.isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Invalid DOB");
        }

        
        String gender = userAccount.getGender();
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        } else {
            System.out.println("Invalid Gender");
        }

       
        String email = userAccount.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Invalid Email");
        }

        
        String pwd = userAccount.getPassword();
        if (pwd != null && !pwd.isEmpty()) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        
        String appName = userAccount.getAppName();
        if (appName != null && !appName.isEmpty()) {
            isAppNameValid = true;
        } else {
            System.out.println("Invalid App Name");
        }

       
        if (isFirstNameValid && isLastNameValid && isDobValid &&
            isGenderValid && isEmailValid && isPasswordValid && isAppNameValid) {
                 //instance varubles      //paramter 
            this.userAccounts[index++] = userAccount;
            isAccountCreated = true;
        }

        return isAccountCreated;
}

   public void getAccountDetails() {
    System.out.println("List of acc created are:");

    for (int i = 0; i < index; i++) {
        UserAccount userAccount = userAccounts[i];
		//class     ref/localvari  // instance
		System.out.println("----------------");

        System.out.println("----------------");
        System.out.println("----- Account Details -----");
        System.out.println("First Name: " + userAccount.getFirstName());
        System.out.println("Last Name: " + userAccount.getLastName());
        System.out.println("DOB: " + userAccount.getDob());
        System.out.println("Gender: " + userAccount.getGender());
        System.out.println("Email: " + userAccount.getEmail());
        System.out.println("Password: " + userAccount.getPassword());
        System.out.println("App Name: " + userAccount.getAppName());
    }
}
}
	
