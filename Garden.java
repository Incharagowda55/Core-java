class Garden {

    Flower flower;

    Garden(Flower flower) {
        this.flower = flower;
    }

    void setFlower(Flower flower) {
        this.flower = flower;
    }

    void display() {
        System.out.println("Garden Details:");

        if (flower != null) {
            System.out.println("Flower Name: " + flower.name);
            System.out.println("Color: " + flower.color);
            System.out.println("Price: " + flower.price);
        } else {
            System.out.println("No flower assigned");
        }
    }
}