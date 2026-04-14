class EngineeringCollegeArray {

    EngineeringCollege[] colleges = new EngineeringCollege[20];
    int index;

    public boolean addCollege(EngineeringCollege acc) {

        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isLocationValid = false;
        boolean isUniversityValid = false;
        boolean isBranchValid = false;
        boolean isIntakeValid = false;
        boolean isFeesValid = false;
        boolean isAccreditationValid = false;

        if (acc.getCollegeName() != null && !acc.getCollegeName().isEmpty())
            isNameValid = true;
        else System.out.println("Invalid Name");

        if (acc.getLocation() != null && !acc.getLocation().isEmpty())
            isLocationValid = true;
        else System.out.println("Invalid Location");

        if (acc.getUniversity() != null && !acc.getUniversity().isEmpty())
            isUniversityValid = true;
        else System.out.println("Invalid University");

        if (acc.getBranch() != null && !acc.getBranch().isEmpty())
            isBranchValid = true;
        else System.out.println("Invalid Branch");

        if (acc.getIntake() > 0)
            isIntakeValid = true;
        else System.out.println("Invalid Intake");

        if (acc.getFees() > 0)
            isFeesValid = true;
        else System.out.println("Invalid Fees");

        if (acc.getAccreditation() != null && !acc.getAccreditation().isEmpty())
            isAccreditationValid = true;
        else System.out.println("Invalid Accreditation");

        if (isNameValid && isLocationValid && isUniversityValid &&
            isBranchValid && isIntakeValid && isFeesValid && isAccreditationValid) {

            if (index < colleges.length) {
                colleges[index++] = acc;
                isCreated = true;
            } else {
                System.out.println("Storage Full");
            }
        }

        return isCreated;
    }

    public void getAllColleges() {

        for (int i = 0; i < index; i++) {

            EngineeringCollege acc = colleges[i];

            System.out.println("----------------");
            System.out.println(acc.getCollegeName());
            System.out.println(acc.getLocation());
            System.out.println(acc.getUniversity());
            System.out.println(acc.getBranch());
            System.out.println(acc.getIntake());
            System.out.println(acc.getFees());
            System.out.println(acc.getAccreditation());
            System.out.println(acc.getIsAutonomous());
        }
    }
}