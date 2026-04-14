class RunnerRefpolice {
    public static void main(String[] args) {

        Cop c = new Cop();
        c.id = 101;
        c.name = "Ramesh";
        c.shift = "Morning";

        TrafficSignal ts = new TrafficSignal(c);

        ts.display();
    }
}