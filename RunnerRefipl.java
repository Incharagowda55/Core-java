class RunnerRefipl {
    public static void main(String[] args) {

        RCB r = new RCB();
        r.captain = "Faf du Plessis";
        r.titles = 0;
        r.homeGround = "Chinnaswamy Stadium";

        IPL ipl = new IPL(r);

        ipl.display();
    }
}