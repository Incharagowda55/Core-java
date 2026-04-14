class YouTube {

    private YouTubeAccount account;

    public boolean createAccount(YouTubeAccount account) {

        boolean isCreated = false;

        boolean isChannelValid = false;
        boolean isOwnerValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isSubscribersValid = false;
        boolean isCategoryValid = false;
        boolean isAppNameValid = false;

        String channel = account.getChannelName();
        if (channel != null && !channel.isEmpty()) {
            isChannelValid = true;
        } else {
            System.out.println("Invalid Channel Name");
        }

        String owner = account.getOwnerName();
        if (owner != null && !owner.isEmpty()) {
            isOwnerValid = true;
        } else {
            System.out.println("Invalid Owner Name");
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

        int subs = account.getSubscribers();
        if (subs >= 0) {
            isSubscribersValid = true;
        } else {
            System.out.println("Invalid Subscribers Count");
        }

        String category = account.getCategory();
        if (category != null && !category.isEmpty()) {
            isCategoryValid = true;
        } else {
            System.out.println("Invalid Category");
        }

        String app = account.getAppName();
        if (app != null && !app.isEmpty()) {
            isAppNameValid = true;
        } else {
            System.out.println("Invalid App Name");
        }

        if (isChannelValid && isOwnerValid && isEmailValid &&
            isPasswordValid && isSubscribersValid &&
            isCategoryValid && isAppNameValid) {

            this.account = account;
            isCreated = true;
        }

        return isCreated;
    }

    public void getAccountDetails() {
        if (account != null) {
            System.out.println("----- YouTube Channel Details -----");
            System.out.println("Channel Name: " + account.getChannelName());
            System.out.println("Owner Name: " + account.getOwnerName());
            System.out.println("Email: " + account.getEmail());
            System.out.println("Password: " + account.getPassword());
            System.out.println("Subscribers: " + account.getSubscribers());
            System.out.println("Category: " + account.getCategory());
            System.out.println("App Name: " + account.getAppName());
        } else {
            System.out.println("No account created");
        }
    }
}