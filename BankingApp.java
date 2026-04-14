class BankingApp {

    private BankAccount account;

    public boolean createAccount(BankAccount account) {

        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isAccNoValid = false;
        boolean isBankValid = false;
        boolean isBalanceValid = false;
        boolean isIfscValid = false;
        boolean isPhoneValid = false;
        boolean isAppValid = false;

        String name = account.getAccountHolderName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        } else {
            System.out.println("Invalid Account Holder Name");
        }

        String accNo = account.getAccountNumber();
        if (accNo != null && !accNo.isEmpty()) {
            isAccNoValid = true;
        } else {
            System.out.println("Invalid Account Number");
        }

        String bank = account.getBankName();
        if (bank != null && !bank.isEmpty()) {
            isBankValid = true;
        } else {
            System.out.println("Invalid Bank Name");
        }

        double bal = account.getBalance();
        if (bal >= 0) {
            isBalanceValid = true;
        } else {
            System.out.println("Invalid Balance");
        }

        String ifsc = account.getIfscCode();
        if (ifsc != null && !ifsc.isEmpty()) {
            isIfscValid = true;
        } else {
            System.out.println("Invalid IFSC Code");
        }

        String phone = account.getPhoneNumber();
        if (phone != null && phone.length() == 10) {
            isPhoneValid = true;
        } else {
            System.out.println("Invalid Phone Number");
        }

        String app = account.getAppName();
        if (app != null && !app.isEmpty()) {
            isAppValid = true;
        } else {
            System.out.println("Invalid App Name");
        }

        if (isNameValid && isAccNoValid && isBankValid &&
            isBalanceValid && isIfscValid && isPhoneValid && isAppValid) {

            this.account = account;
            isCreated = true;
        }

        return isCreated;
    }

    public void getAccountDetails() {
        if (account != null) {
            System.out.println("----- Bank Account Details -----");
            System.out.println("Account Holder: " + account.getAccountHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Bank Name: " + account.getBankName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("IFSC Code: " + account.getIfscCode());
            System.out.println("Phone: " + account.getPhoneNumber());
            System.out.println("App Name: " + account.getAppName());
        } else {
            System.out.println("No account created");
        }
    }
}