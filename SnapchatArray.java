class SnapchatArray {

    SnapchatAccount[] accounts = new SnapchatAccount[20];
    int index;

    public boolean createAccount(SnapchatAccount acc) {

        boolean isCreated = false;

        boolean isUserValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isPhoneValid = false;
        boolean isSnapValid = false;
        boolean isStreakValid = false;
        boolean isStatusValid = false;

        if (acc.getUsername() != null && !acc.getUsername().isEmpty())
            isUserValid = true;
        else System.out.println("Invalid Username");

        if (acc.getEmail() != null && !acc.getEmail().isEmpty())
            isEmailValid = true;
        else System.out.println("Invalid Email");

        if (acc.getPassword() != null && !acc.getPassword().isEmpty())
            isPasswordValid = true;
        else System.out.println("Invalid Password");

        if (acc.getPhoneNumber() != null && !acc.getPhoneNumber().isEmpty())
            isPhoneValid = true;
        else System.out.println("Invalid Phone");

        if (acc.getSnapScore() >= 0)
            isSnapValid = true;
        else System.out.println("Invalid SnapScore");

        if (acc.getStreak() >= 0)
            isStreakValid = true;
        else System.out.println("Invalid Streak");

        if (acc.getStatus() != null && !acc.getStatus().isEmpty())
            isStatusValid = true;
        else System.out.println("Invalid Status");

        if (isUserValid && isEmailValid && isPasswordValid &&
            isPhoneValid && isSnapValid && isStreakValid && isStatusValid) {

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

        System.out.println("----- Snapchat Users -----");

        for (int i = 0; i < index; i++) {

            SnapchatAccount acc = accounts[i];

            System.out.println("----------------");
            System.out.println("Username: " + acc.getUsername());
            System.out.println("Email: " + acc.getEmail());
            System.out.println("Phone: " + acc.getPhoneNumber());
            System.out.println("SnapScore: " + acc.getSnapScore());
            System.out.println("Streak: " + acc.getStreak());
            System.out.println("Status: " + acc.getStatus());
            System.out.println("Private: " + acc.getIsPrivate());
        }
    }
}