class FitnessArray {

    FitnessAccount[] accounts = new FitnessAccount[15];
    int index;

    public boolean createAccount(FitnessAccount acc) {

        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isAgeValid = false;
        boolean isWeightValid = false;
        boolean isHeightValid = false;
        boolean isGoalValid = false;
        boolean isPlanValid = false;
        boolean isTrainerValid = false;

        if (acc.getName() != null && !acc.getName().isEmpty())
            isNameValid = true;
        else System.out.println("Invalid Name");

        if (acc.getAge() > 0)
            isAgeValid = true;
        else System.out.println("Invalid Age");

        if (acc.getWeight() > 0)
            isWeightValid = true;
        else System.out.println("Invalid Weight");

        if (acc.getHeight() > 0)
            isHeightValid = true;
        else System.out.println("Invalid Height");

        if (acc.getGoal() != null && !acc.getGoal().isEmpty())
            isGoalValid = true;
        else System.out.println("Invalid Goal");

        if (acc.getPlanType() != null && !acc.getPlanType().isEmpty())
            isPlanValid = true;
        else System.out.println("Invalid Plan");

        if (acc.getTrainerName() != null && !acc.getTrainerName().isEmpty())
            isTrainerValid = true;
        else System.out.println("Invalid Trainer");

        if (isNameValid && isAgeValid && isWeightValid && isHeightValid &&
            isGoalValid && isPlanValid && isTrainerValid) {

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

        System.out.println("----- Fitness App Users -----");

        for (int i = 0; i < index; i++) {

            FitnessAccount acc = accounts[i];

            System.out.println("----------------");
            System.out.println("Name: " + acc.getName());
            System.out.println("Age: " + acc.getAge());
            System.out.println("Weight: " + acc.getWeight());
            System.out.println("Height: " + acc.getHeight());
            System.out.println("Goal: " + acc.getGoal());
            System.out.println("Plan: " + acc.getPlanType());
            System.out.println("Trainer: " + acc.getTrainerName());
            System.out.println("Active: " + acc.getIsActive());
        }
    }
}