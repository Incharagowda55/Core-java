class RunnerMethod {
    public static void main(String[] args) {

        Capacitor cap = new Capacitor();
        cap.capacity = 10;
        cap.type = "Ceramic";
        cap.voltage = 110.0;

        Fan fan = new Fan(null);

        fan.setCapacitor(cap); // method injection

        fan.display();
    }
}