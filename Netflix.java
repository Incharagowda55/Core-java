class Netflix {
    private NetflixAccount account;

    public boolean subscribe(NetflixAccount account) {
        boolean isValid = false;

       
        if (account.getUserName() != null && !account.getUserName().isEmpty() &&
            account.getEmail() != null && account.getEmail().contains("@") &&
            account.getPassword() != null && account.getPassword().length() >= 6 &&
            account.getPlanType() != null &&
            account.getProfileCount() > 0 &&
            account.getPhoneNumber() != null) {
            
            this.account = account;
            isValid = true;
            System.out.println("Validation successful for: " + account.getUserName());
        } else {
            System.out.println("Subscription Failed: Missing or Invalid Details");
        }

        return isValid;
    }

    public void displaySubscriptionDetails() {
        if (account != null) {
            System.out.println("--- Netflix Subscription Active ---");
            System.out.println("User: " + account.getUserName());
            System.out.println("Plan: " + account.getPlanType());
            System.out.println("Profiles: " + account.getProfileCount());
            System.out.println("4K Supported: " + (account.isUltraHD() ? "Yes" : "No"));
            System.out.println("Contact: " + account.getPhoneNumber());
        } else {
            System.out.println("No active subscription found.");
        }
    }
}