class RunnerMethodcrop {
    public static void main(String[] args) {

        Season s = new Season();
        s.name = "Rabi";
        s.duration = "October to March";
        s.climate = "Winter";

        Crop c = new Crop(null);

        c.setSeason(s);

        c.display();
    }
}