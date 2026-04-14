class RunnerRefcrop {
    public static void main(String[] args) {

        Season s = new Season();
        s.name = "Kharif";
        s.duration = "June to October";
        s.climate = "Rainy";

        Crop c = new Crop(s);

        c.display();
    }
}