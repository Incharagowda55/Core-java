class UberService {

    UberAccount[] accounts = new UberAccount[10];
    int index;

    public boolean createAccount(UberAccount acc) {

        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isPhoneValid = false;
        boolean isLocationValid = false;
        boolean isVehicleValid = false;
        boolean isRideValid = false;

        if (acc.getFullName() != null && !acc.getFullName().isEmpty())
            isNameValid = true;
        else System.out.println("Invalid Name");

        if (acc.getEmail() != null && !acc.getEmail().isEmpty())
            isEmailValid = true;
        else System.out.println("Invalid Email");

        if (acc.getPassword() != null && !acc.getPassword().isEmpty())
            isPasswordValid = true;
        else System.out.println("Invalid Password");

        if (acc.getPhoneNumber() != null && !acc.getPhoneNumber().isEmpty())
            isPhoneValid = true;
        else System.out.println("Invalid Phone");

        if (acc.getLocation() != null && !acc.getLocation().isEmpty())
            isLocationValid = true;
        else System.out.println("Invalid Location");

        if (acc.getVehicleType() != null && !acc.getVehicleType().isEmpty())
            isVehicleValid = true;
        else System.out.println("Invalid Vehicle");

        if (acc.getRideType() != null && !acc.getRideType().isEmpty())
            isRideValid = true;
        else System.out.println("Invalid Ride Type");

        if (isNameValid && isEmailValid && isPasswordValid &&
            isPhoneValid && isLocationValid && isVehicleValid && isRideValid) {

            if (index < accounts.length) {
                accounts[index++] = acc;
                isCreated = true;
            } else {
                System.out.println("Storage Full");
            }
        }

        return isCreated;
    }

    public void getAllAccounts() {
        System.out.println("----- Uber Accounts -----");

        for (int i = 0; i < index; i++) {
            UberAccount acc = accounts[i];

            System.out.println("----------------");
            System.out.println("Name: " + acc.getFullName());
            System.out.println("Email: " + acc.getEmail());
            System.out.println("Phone: " + acc.getPhoneNumber());
            System.out.println("Location: " + acc.getLocation());
            System.out.println("Vehicle: " + acc.getVehicleType());
            System.out.println("Ride Type: " + acc.getRideType());
        }
    }
}