class RunnerRef {
    public static void main(String[] args) {

        Capacitor cap = new Capacitor();
        cap.capacity = 5;
        cap.type = "Electrolytic";
        cap.voltage = 220.5;

        Fan fan = new Fan(cap);

        fan.display();
    }
}