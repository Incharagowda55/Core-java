class RunnerConstructoricream {
    public static void main(String[] args) {

        Flavour f = new Flavour();
        f.name = "Strawberry";
        f.type = "Fruity";
        f.price = 70.0;

        IceCream ice = new IceCream(f);

        ice.display();
    }
}