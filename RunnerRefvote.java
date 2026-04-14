class RunnerRefvote {
    public static void main(String[] args) {

        Voter v = new Voter();
        v.voterId = 101;
        v.name = "Ravi";
        v.constituency = "Bangalore South";

        Politician p = new Politician(v);

        p.display();
    }
}