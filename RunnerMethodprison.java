class RunnerMethodprison {
    public static void main(String[] args) {

        Criminal c = new Criminal();
        c.id = 2;
        c.name = "Suresh";
        c.crimeType = "Fraud";

        Prison p = new Prison(null);

        p.setCriminal(c);

        p.display();
    }
}