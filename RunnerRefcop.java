class RunnerRefcop {
    public static void main(String[] args) {

        Screen s = new Screen();
        s.screenNumber = 1;
        s.type = "IMAX";
        s.capacity = 200;

        PVR pvr = new PVR(s);

        pvr.display();
    }
}