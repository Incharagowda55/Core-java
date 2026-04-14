class RunnerMethodclimate {
    public static void main(String[] args) {

        Climate c = new Climate();
        c.type = "Dry";
        c.avgTemperature = 38.0;
        c.region = "Rajasthan";

        Weather w = new Weather(null);

        w.setClimate(c);

        w.display();
    }
}