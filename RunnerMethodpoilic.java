class RunnerMethodpoilic {
    public static void main(String[] args) {

        Cop c = new Cop();
        c.id = 102;
        c.name = "Suresh";
        c.shift = "Evening";

        TrafficSignal ts = new TrafficSignal(null);

        ts.setCop(c);

        ts.display();
    }
}