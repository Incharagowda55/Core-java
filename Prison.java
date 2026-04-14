class Prison {

    Criminal criminal;

    Prison(Criminal criminal) {
        this.criminal = criminal;
    }

    void setCriminal(Criminal criminal) {
        this.criminal = criminal;
    }

    void display() {
        System.out.println("Prison Details:");

        if (criminal != null) {
            System.out.println("Criminal Id: " + criminal.id);
            System.out.println("Name: " + criminal.name);
            System.out.println("Crime Type: " + criminal.crimeType);
        } else {
            System.out.println("No criminal assigned");
        }
    }
}