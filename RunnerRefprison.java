class RunnerRefprison {
    public static void main(String[] args) {

        Criminal c = new Criminal();
        c.id = 1;
        c.name = "Ravi";
        c.crimeType = "Theft";

        Prison p = new Prison(c);

        p.display();
    }
}