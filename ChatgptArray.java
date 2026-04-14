class ChatgptArray {

    ChatgptAccount[] accounts = new ChatgptAccount[20];
    int index;

    public boolean createAccount(ChatgptAccount acc) {

        boolean isCreated = false;

        boolean isUserValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isPlanValid = false;
        boolean isPromptValid = false;
        boolean isQueryValid = false;
        boolean isResponseValid = false;

        if (acc.getUserName() != null && !acc.getUserName().isEmpty())
            isUserValid = true;
        else System.out.println("Invalid Username");

        if (acc.getEmail() != null && !acc.getEmail().isEmpty())
            isEmailValid = true;
        else System.out.println("Invalid Email");

        if (acc.getPassword() != null && !acc.getPassword().isEmpty())
            isPasswordValid = true;
        else System.out.println("Invalid Password");

        if (acc.getPlanType() != null && !acc.getPlanType().isEmpty())
            isPlanValid = true;
        else System.out.println("Invalid Plan");

        if (acc.getPromptsUsed() >= 0)
            isPromptValid = true;
        else System.out.println("Invalid Prompt Count");

        if (acc.getLastQuery() != null && !acc.getLastQuery().isEmpty())
            isQueryValid = true;
        else System.out.println("Invalid Query");

        if (acc.getResponseType() != null && !acc.getResponseType().isEmpty())
            isResponseValid = true;
        else System.out.println("Invalid Response");

        if (isUserValid && isEmailValid && isPasswordValid &&
            isPlanValid && isPromptValid && isQueryValid && isResponseValid) {

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

            ChatgptAccount acc = accounts[i];

            System.out.println("----------------");
            System.out.println(acc.getUserName());
            System.out.println(acc.getEmail());
            System.out.println(acc.getPlanType());
            System.out.println(acc.getPromptsUsed());
            System.out.println(acc.getLastQuery());
            System.out.println(acc.getResponseType());
            System.out.println(acc.getIsActive());
        }
    }
}