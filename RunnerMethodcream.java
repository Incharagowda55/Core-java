class RunnerMethodcream {
    public static void main(String[] args) {

        Flavour f = new Flavour();
        f.name = "Vanilla";
        f.type = "Classic";
        f.price = 50.0;

        IceCream ice = new IceCream(null);

        ice.setFlavour(f);

        ice.display();
    }
}