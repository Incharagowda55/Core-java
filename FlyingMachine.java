class FlyingMachine {

    private FlyingMachineAccount account;

    public boolean createAccount(FlyingMachineAccount account) {

        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isProductValid = false;
        boolean isSizeValid = false;
        boolean isColorValid = false;
        boolean isPriceValid = false;
        boolean isEmailValid = false;
        boolean isAppNameValid = false;

        String name = account.getCustomerName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        } else {
            System.out.println("Invalid Customer Name");
        }

        String product = account.getProductName();
        if (product != null && !product.isEmpty()) {
            isProductValid = true;
        } else {
            System.out.println("Invalid Product Name");
        }

        String size = account.getSize();
        if (size != null && !size.isEmpty()) {
            isSizeValid = true;
        } else {
            System.out.println("Invalid Size");
        }

        String color = account.getColor();
        if (color != null && !color.isEmpty()) {
            isColorValid = true;
        } else {
            System.out.println("Invalid Color");
        }

        double price = account.getPrice();
        if (price > 0) {
            isPriceValid = true;
        } else {
            System.out.println("Invalid Price");
        }

        String email = account.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Invalid Email");
        }

        String app = account.getAppName();
        if (app != null && !app.isEmpty()) {
            isAppNameValid = true;
        } else {
            System.out.println("Invalid App Name");
        }

        if (isNameValid && isProductValid && isSizeValid &&
            isColorValid && isPriceValid && isEmailValid && isAppNameValid) {

            this.account = account;
            isCreated = true;
        }

        return isCreated;
    }

    public void getAccountDetails() {
        if (account != null) {
            System.out.println("----- Flying Machine Order Details -----");
            System.out.println("Customer Name: " + account.getCustomerName());
            System.out.println("Product Name: " + account.getProductName());
            System.out.println("Size: " + account.getSize());
            System.out.println("Color: " + account.getColor());
            System.out.println("Price: " + account.getPrice());
            System.out.println("Email: " + account.getEmail());
            System.out.println("App Name: " + account.getAppName());
        } else {
            System.out.println("No order created");
        }
    }
}