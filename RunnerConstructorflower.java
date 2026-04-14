class RunnerConstructorflower {
    public static void main(String[] args) {

        Flower f = new Flower();
        f.name = "Sunflower";
        f.color = "Yellow";
        f.price = 20.0;

        Garden g = new Garden(f);

        g.display();
    }
}