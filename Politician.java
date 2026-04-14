class Politician {

    Voter voter;

    Politician(Voter voter) {
        this.voter = voter;
    }

    void setVoter(Voter voter) {
        this.voter = voter;
    }

    void display() {
        System.out.println("Politician Voter Details:");

        if (voter != null) {
            System.out.println("Voter Id: " + voter.voterId);
            System.out.println("Name: " + voter.name);
            System.out.println("Constituency: " + voter.constituency);
        } else {
            System.out.println("No voter assigned");
        }
    }
}