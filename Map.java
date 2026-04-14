class Map {

    Location location;

    Map(Location location) {
        this.location = location;
    }

    void setLocation(Location location) {
        this.location = location;
    }

    void display() {
        System.out.println("Map Location Details:");

        if (location != null) {
            System.out.println("City: " + location.city);
            System.out.println("Area: " + location.area);
            System.out.println("Pincode: " + location.pincode);
        } else {
            System.out.println("No location assigned");
        }
    }
}