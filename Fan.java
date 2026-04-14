class Fan {

    Capacitor capacitor; // non-primitive

    // Constructor
    Fan(Capacitor capacitor) {
        this.capacitor = capacitor;
    }

    // Setter method
    void setCapacitor(Capacitor capacitor) {
        this.capacitor = capacitor;
    }

    void display() {
        System.out.println("Fan Details:");

        if (capacitor != null) {
            System.out.println("Capacity: " + capacitor.capacity);
            System.out.println("Type: " + capacitor.type);
            System.out.println("Voltage: " + capacitor.voltage);
        } else {
            System.out.println("No capacitor assigned");
        }
    }
}