class RunnerMethodflower {
    public static void main(String[] args) {

        Flower f = new Flower();
        f.name = "Lily";
        f.color = "White";
        f.price = 30.0;

        Garden g = new Garden(null);

        g.setFlower(f);

        g.display();
    }
}