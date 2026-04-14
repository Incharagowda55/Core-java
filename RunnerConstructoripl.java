class RunnerConstructoripl {
    public static void main(String[] args) {

        RCB r = new RCB();
        r.captain = "Rajat Patidar";
        r.titles = 0;
        r.homeGround = "Chinnaswamy";

        IPL ipl = new IPL(r);

        ipl.display();
    }
}