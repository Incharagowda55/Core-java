class PrimeAccount {
    private String fullName;
    private String email;
    private String password;
    private String membershipPlan;
    private double subscriptionFee;
    private boolean isOneDayDeliveryEnabled;
    private String primeVideoRegion;

    
    public String getFullName()
	{ return fullName;
	}
    public void setFullName(String fullName) 
	{ this.fullName = fullName;
	}

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getMembershipPlan() { return membershipPlan; }
    public void setMembershipPlan(String membershipPlan) { this.membershipPlan = membershipPlan; }

    public double getSubscriptionFee() { return subscriptionFee; }
    public void setSubscriptionFee(double subscriptionFee) { this.subscriptionFee = subscriptionFee; }

    public boolean isOneDayDeliveryEnabled() { return isOneDayDeliveryEnabled; }
    public void setOneDayDeliveryEnabled(boolean isOneDayDeliveryEnabled) { this.isOneDayDeliveryEnabled = isOneDayDeliveryEnabled; }

    public String getPrimeVideoRegion() { return primeVideoRegion; }
    public void setPrimeVideoRegion(String primeVideoRegion) { this.primeVideoRegion = primeVideoRegion; }
}