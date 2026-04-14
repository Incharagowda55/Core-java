class AmazonPrime {
    PrimeAccount account;

    public boolean createSubscription(PrimeAccount primeAccount) {
        boolean isSubscriptionActive = false;

       
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isPlanValid = false;
        boolean isFeeValid = false;
        boolean isDeliveryStatusValid = true; // Boolean is usually always valid
        boolean isRegionValid = false;

       
        String name = primeAccount.getFullName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        } else {
            System.out.println("Invalid Name");
        }

      
        String email = primeAccount.getEmail();
        if (email != null && email.contains("@")) {
            isEmailValid = true;
        } else {
            System.out.println("Invalid Email");
        }

        
        String pwd = primeAccount.getPassword();
        if (pwd != null && pwd.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password (must be 8+ chars)");
        }

        
        String plan = primeAccount.getMembershipPlan();
        if (plan != null && !plan.isEmpty()) {
            isPlanValid = true;
        } else {
            System.out.println("Invalid Plan");
        }

        double fee = primeAccount.getSubscriptionFee();
        if (fee > 0) {
            isFeeValid = true;
        } else {
            System.out.println("Invalid Fee");
        }

        isDeliveryStatusValid = true; 

        String region = primeAccount.getPrimeVideoRegion();
        if (region != null && !region.isEmpty()) {
            isRegionValid = true;
        } else {
            System.out.println("Invalid Region");
        }

        if (isNameValid && isEmailValid && isPasswordValid && isPlanValid && 
            isFeeValid && isDeliveryStatusValid && isRegionValid) {
            
            this.account = primeAccount;
            isSubscriptionActive = true;
        }

        return isSubscriptionActive;
    }

    public void displayDetails() {
        if (account != null) {
            System.out.println("----- Prime Account Info -----");
            System.out.println("Name: " + account.getFullName());
            System.out.println("Email: " + account.getEmail());
            System.out.println("Plan: " + account.getMembershipPlan());
            System.out.println("Fee Paid: " + account.getSubscriptionFee());
            System.out.println("One-Day Delivery: " + account.isOneDayDeliveryEnabled());
            System.out.println("Region: " + account.getPrimeVideoRegion());
        } else {
            System.out.println("Subscription not found.");
        }
    }
}