class IceCream {

    Flavour flavour;

    IceCream(Flavour flavour) {
        this.flavour = flavour;
    }

    void setFlavour(Flavour flavour) {
        this.flavour = flavour;
    }

    void display() {
        System.out.println("Ice Cream Details:");

        if (flavour != null) {
            System.out.println("Flavour Name: " + flavour.name);
            System.out.println("Type: " + flavour.type);
            System.out.println("Price: " + flavour.price);
        } else {
            System.out.println("No flavour assigned");
        }
    }
}