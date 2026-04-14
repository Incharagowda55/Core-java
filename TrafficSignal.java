class TrafficSignal {

    Cop cop;

    TrafficSignal(Cop cop) {
        this.cop = cop;
    }

    void setCop(Cop cop) {
        this.cop = cop;
    }

    void display() {
        System.out.println("Traffic Signal Details:");

        if (cop != null) {
            System.out.println("Cop Id: " + cop.id);
            System.out.println("Name: " + cop.name);
            System.out.println("Shift: " + cop.shift);
        } else {
            System.out.println("No cop assigned");
        }
    }
}