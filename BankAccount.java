class BankAccount {

    private String accountHolderName;
    private String accountNumber;
    private String bankName;
    private double balance;
    private String ifscCode;
    private String phoneNumber;
    private String appName;


    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName; }
    public String getAccountHolderName() { return accountHolderName; }

    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public String getAccountNumber() { return accountNumber; }

    public void setBankName(String bankName) { this.bankName = bankName; }
    public String getBankName() { return bankName; }

    public void setBalance(double balance) { this.balance = balance; }
    public double getBalance() { return balance; }

    public void setIfscCode(String ifscCode) { this.ifscCode = ifscCode; }
    public String getIfscCode() { return ifscCode; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getPhoneNumber() { return phoneNumber; }

    public void setAppName(String appName) { this.appName = appName; }
    public String getAppName() { return appName; }
}