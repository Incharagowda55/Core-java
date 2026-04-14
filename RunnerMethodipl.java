class RunnerMethodipl {
    public static void main(String[] args) {

        RCB r = new RCB();
        r.captain = "Virat Kohli";
        r.titles = 0;
        r.homeGround = "Bangalore";

        IPL ipl = new IPL(null);

        ipl.setRCB(r);

        ipl.display();
    }
}