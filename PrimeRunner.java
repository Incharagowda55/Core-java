class PrimeRunner {
    public static void main(String[] args) {
        PrimeAccount myUser = new PrimeAccount();
        
        myUser.setFullName("Likhitha");
        myUser.setEmail("likhitha@prime.com");
        myUser.setPassword("SecretPass123");
        myUser.setMembershipPlan("Annual");
        myUser.setSubscriptionFee(1499.00);
        myUser.setOneDayDeliveryEnabled(true);
        myUser.setPrimeVideoRegion("India");

        AmazonPrime primeService = new AmazonPrime();
        boolean result = primeService.createSubscription(myUser);

        System.out.println("Account Status: " + result);
        primeService.displayDetails();
		
		
		
		
    }
}