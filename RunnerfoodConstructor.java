class RunnerfoodConstructor {
    public static void main(String[] args) {

        Food f = new Food();
        f.name = "Burger";
        f.type = "Fast Food";
        f.price = 80.0;

        FoodStall stall = new FoodStall(f);

        stall.display();
    }
}