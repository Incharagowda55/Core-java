class RunnerConstructorcop {
    public static void main(String[] args) {

        Screen s = new Screen();
        s.screenNumber = 3;
        s.type = "Standard";
        s.capacity = 100;

        PVR pvr = new PVR(s);

        pvr.display();
    }
}