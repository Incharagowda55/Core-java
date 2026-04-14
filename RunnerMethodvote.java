class RunnerMethodvote {
    public static void main(String[] args) {

        Voter v = new Voter();
        v.voterId = 102;
        v.name = "Sita";
        v.constituency = "Mysore";

        Politician p = new Politician(null);

        p.setVoter(v);

        p.display();
    }
}