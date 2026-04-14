class RunnerConstructorprison {
    public static void main(String[] args) {

        Criminal c = new Criminal();
        c.id = 3;
        c.name = "Mahesh";
        c.crimeType = "Robbery";

        Prison p = new Prison(c);

        p.display();
    }
}