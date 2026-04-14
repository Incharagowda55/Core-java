class RunnerConstructor {
    public static void main(String[] args) {

        Capacitor cap = new Capacitor();
        cap.capacity = 15;
        cap.type = "Film";
        cap.voltage = 250.0;

        Fan fan = new Fan(cap);

        fan.display();
    }
}