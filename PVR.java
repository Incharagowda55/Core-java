class PVR {

    Screen screen;

    PVR(Screen screen) {
        this.screen = screen;
    }

    void setScreen(Screen screen) {
        this.screen = screen;
    }

    void display() {
        System.out.println("PVR Screen Details:");

        if (screen != null) {
            System.out.println("Screen Number: " + screen.screenNumber);
            System.out.println("Type: " + screen.type);
            System.out.println("Capacity: " + screen.capacity);
        } else {
            System.out.println("No screen assigned");
        }
    }
}