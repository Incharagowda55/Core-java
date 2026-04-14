class RunnerConstructorclimate {
    public static void main(String[] args) {

        Climate c = new Climate();
        c.type = "Temperate";
        c.avgTemperature = 22.0;
        c.region = "Bangalore";

        Weather w = new Weather(c);

        w.display();
    }
}