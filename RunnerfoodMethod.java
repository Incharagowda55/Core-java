class RunnerfoodMethod {
    public static void main(String[] args) {

        Food f = new Food();
        f.name = "Dosa";
        f.type = "South Indian";
        f.price = 50.0;

        FoodStall stall = new FoodStall(null);

        stall.setFood(f);

        stall.display();
    }
}