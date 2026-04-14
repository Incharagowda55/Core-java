class TiktokArray {

    TiktokAccount[] accounts = new TiktokAccount[20];
    int index;

    public boolean createAccount(TiktokAccount acc) {

        boolean isCreated = false;

        boolean isUserValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isPhoneValid = false;
        boolean isFollowersValid = false;
        boolean isFollowingValid = false;
        boolean isLikesValid = false;

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

        if (acc.getFollowers() >= 0)
            isFollowersValid = true;
        else System.out.println("Invalid Followers");

        if (acc.getFollowing() >= 0)
            isFollowingValid = true;
        else System.out.println("Invalid Following");

        if (acc.getLikes() >= 0)
            isLikesValid = true;
        else System.out.println("Invalid Likes");

        if (isUserValid && isEmailValid && isPasswordValid &&
            isPhoneValid && isFollowersValid && isFollowingValid && isLikesValid) {

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

        for (int i = 0; i < index; i++) {

            TiktokAccount acc = accounts[i];

            System.out.println("----------------");
            System.out.println(acc.getUsername());
            System.out.println(acc.getEmail());
            System.out.println(acc.getPhoneNumber());
            System.out.println(acc.getFollowers());
            System.out.println(acc.getFollowing());
            System.out.println(acc.getLikes());
            System.out.println(acc.getIsVerified());
        }
    }
}