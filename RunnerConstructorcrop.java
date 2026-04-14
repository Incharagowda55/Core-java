class RunnerConstructorcrop {
    public static void main(String[] args) {

        Season s = new Season();
        s.name = "Zaid";
        s.duration = "March to June";
        s.climate = "Summer";

        Crop c = new Crop(s);

        c.display();
    }
}