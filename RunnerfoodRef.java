class RunnerfoodRef {
    public static void main(String[] args) {

        Food f = new Food();
        f.name = "Pani Puri";
        f.type = "Street Food";
        f.price = 30.0;

        FoodStall stall = new FoodStall(f);

        stall.display();
    }
}