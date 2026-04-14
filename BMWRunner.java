class BMWRunner {
    public static void main(String[] args) {

        System.out.println("BMW App Started");

        BMW app = new BMW();

      
        BMWCar c1 = new BMWCar();
        c1.setModelName("BMW X5");
        c1.setColor("Black");
        c1.setPrice(9000000);
        c1.setFuelType("Diesel");
        c1.setTransmission("Automatic");
        c1.setOwnerName("Inchara");
        c1.setAppName("BMW");

        System.out.println(app.createAccount(c1));
        app.getCarDetails();

        System.out.println("------------------");

        
        BMWCar c2 = new BMWCar();
        c2.setModelName("BMW 3 Series");
        c2.setColor("White");
        c2.setPrice(6000000);
        c2.setFuelType("Petrol");
        c2.setTransmission("Automatic");
        c2.setOwnerName("Rahul");
        c2.setAppName("BMW");

        System.out.println(app.createAccount(c2));
        app.getCarDetails();

        System.out.println("------------------");

      
        BMWCar c3 = new BMWCar();
        c3.setModelName("BMW X1");
        c3.setColor("Blue");
        c3.setPrice(4500000);
        c3.setFuelType("Diesel");
        c3.setTransmission("Manual");
        c3.setOwnerName("Priya");
        c3.setAppName("BMW");

        System.out.println(app.createAccount(c3));
        app.getCarDetails();

        System.out.println("------------------");

        // 🔹 Car 4
        BMWCar c4 = new BMWCar();
        c4.setModelName("BMW 7 Series");
        c4.setColor("Silver");
        c4.setPrice(12000000);
        c4.setFuelType("Petrol");
        c4.setTransmission("Automatic");
        c4.setOwnerName("Arjun");
        c4.setAppName("BMW");

        System.out.println(app.createAccount(c4));
        app.getCarDetails();
    }
}