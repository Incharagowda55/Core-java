class RunnerRefcream {
    public static void main(String[] args) {

        Flavour f = new Flavour();
        f.name = "Chocolate";
        f.type = "Creamy";
        f.price = 60.0;

        IceCream ice = new IceCream(f);

        ice.display();
    }
}