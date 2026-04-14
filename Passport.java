class Passport {

    private PassportUser1 user;

    public boolean createAccount(PassportUser1 user) {

        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isPassportValid = false;
        boolean isNationalityValid = false;
        boolean isDobValid = false;
        boolean isGenderValid = false;
        boolean isAddressValid = false;
        boolean isAppNameValid = false;

        String name = user.getUserName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        } else {
            System.out.println("Invalid Name");
        }

        String passportNo = user.getPassportNumber();
        if (passportNo != null && !passportNo.isEmpty()) {
            isPassportValid = true;
        } else {
            System.out.println("Invalid Passport Number");
        }

        String nationality = user.getNationality();
        if (nationality != null && !nationality.isEmpty()) {
            isNationalityValid = true;
        } else {
            System.out.println("Invalid Nationality");
        }

        String dob = user.getDob();
        if (dob != null && !dob.isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Invalid DOB");
        }

        String gender = user.getGender();
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        } else {
            System.out.println("Invalid Gender");
        }

        String address = user.getAddress();
        if (address != null && !address.isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Invalid Address");
        }

        String app = user.getAppName();
        if (app != null && !app.isEmpty()) {
            isAppNameValid = true;
        } else {
            System.out.println("Invalid App Name");
        }

        if (isNameValid && isPassportValid && isNationalityValid &&
            isDobValid && isGenderValid && isAddressValid && isAppNameValid) {

            this.user = user;
            isCreated = true;
        }

        return isCreated;
    }

    public void getUserDetails() {
        if (user != null) {
            System.out.println("----- Passport Details -----");
            System.out.println("Name: " + user.getUserName());
            System.out.println("Passport No: " + user.getPassportNumber());
            System.out.println("Nationality: " + user.getNationality());
            System.out.println("DOB: " + user.getDob());
            System.out.println("Gender: " + user.getGender());
            System.out.println("Address: " + user.getAddress());
            System.out.println("App Name: " + user.getAppName());
        } else {
            System.out.println("No passport created");
        }
    }
}