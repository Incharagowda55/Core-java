class Crop {

    Season season;

    Crop(Season season) {
        this.season = season;
    }

    void setSeason(Season season) {
        this.season = season;
    }

    void display() {
        System.out.println("Crop Details:");

        if (season != null) {
            System.out.println("Season Name: " + season.name);
            System.out.println("Duration: " + season.duration);
            System.out.println("Climate: " + season.climate);
        } else {
            System.out.println("No season assigned");
        }
    }
}