class RunnerConstructorpolice {
    public static void main(String[] args) {

        Cop c = new Cop();
        c.id = 103;
        c.name = "Mahesh";
        c.shift = "Night";

        TrafficSignal ts = new TrafficSignal(c);

        ts.display();
    }
}