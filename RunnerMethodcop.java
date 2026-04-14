class RunnerMethodcop {
    public static void main(String[] args) {

        Screen s = new Screen();
        s.screenNumber = 2;
        s.type = "4DX";
        s.capacity = 150;

        PVR pvr = new PVR(null);

        pvr.setScreen(s);

        pvr.display();
    }
}