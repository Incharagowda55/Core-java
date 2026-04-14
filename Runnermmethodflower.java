class Runnermmethodflower {
    public static void main(String[] args) {

        Flower f = new Flower();
        f.name = "Rose";
        f.color = "Red";
        f.price = 25.5;

        Garden g = new Garden(f);

        g.display();
    }
}