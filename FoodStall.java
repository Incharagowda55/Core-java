class FoodStall {

    Food food;

    FoodStall(Food food) {
        this.food = food;
    }

    void setFood(Food food) {
        this.food = food;
    }

    void display() {
        System.out.println("Food Stall Details:");

        if (food != null) {
            System.out.println("Food Name: " + food.name);
            System.out.println("Type: " + food.type);
            System.out.println("Price: " + food.price);
        } else {
            System.out.println("No food assigned");
        }
    }
}