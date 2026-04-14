class RunnerRefclimate {
    public static void main(String[] args) {

        Climate c = new Climate();
        c.type = "Tropical";
        c.avgTemperature = 32.5;
        c.region = "South India";

        Weather w = new Weather(c);

        w.display();
    }
}