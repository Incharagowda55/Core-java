class Weather {

    Climate climate;

    Weather(Climate climate) {
        this.climate = climate;
    }

    void setClimate(Climate climate) {
        this.climate = climate;
    }

    void display() {
        System.out.println("Weather Details:");

        if (climate != null) {
            System.out.println("Climate Type: " + climate.type);
            System.out.println("Average Temperature: " + climate.avgTemperature);
            System.out.println("Region: " + climate.region);
        } else {
            System.out.println("No climate assigned");
        }
    }
}