class BMW {

     BMWCar car;

    public boolean createAccount(BMWCar car) {

        boolean isCreated = false;

        boolean isModelValid = false;
        boolean isColorValid = false;
        boolean isPriceValid = false;
        boolean isFuelValid = false;
        boolean isTransmissionValid = false;
        boolean isOwnerValid = false;
        boolean isAppValid = false;

        String model = car.getModelName();
        if (model != null && !model.isEmpty()) {
            isModelValid = true;
        } else {
            System.out.println("Invalid Model Name");
        }

        String color = car.getColor();
        if (color != null && !color.isEmpty()) {
            isColorValid = true;
        } else {
            System.out.println("Invalid Color");
        }

        double price = car.getPrice();
        if (price > 0) {
            isPriceValid = true;
        } else {
            System.out.println("Invalid Price");
        }

        String fuel = car.getFuelType();
        if (fuel != null && !fuel.isEmpty()) {
            isFuelValid = true;
        } else {
            System.out.println("Invalid Fuel Type");
        }

        String transmission = car.getTransmission();
        if (transmission != null && !transmission.isEmpty()) {
            isTransmissionValid = true;
        } else {
            System.out.println("Invalid Transmission");
        }

        String owner = car.getOwnerName();
        if (owner != null && !owner.isEmpty()) {
            isOwnerValid = true;
        } else {
            System.out.println("Invalid Owner Name");
        }

        String app = car.getAppName();
        if (app != null && !app.isEmpty()) {
            isAppValid = true;
        } else {
            System.out.println("Invalid App Name");
        }

        if (isModelValid && isColorValid && isPriceValid &&
            isFuelValid && isTransmissionValid &&
            isOwnerValid && isAppValid) {

            this.car = car;
            isCreated = true;
        }

        return isCreated;
    }

    public void getCarDetails() {
        if (car != null) {
            System.out.println("----- BMW Car Details -----");
            System.out.println("Model: " + car.getModelName());
            System.out.println("Color: " + car.getColor());
            System.out.println("Price: " + car.getPrice());
            System.out.println("Fuel Type: " + car.getFuelType());
            System.out.println("Transmission: " + car.getTransmission());
            System.out.println("Owner Name: " + car.getOwnerName());
            System.out.println("App Name: " + car.getAppName());
        } else {
            System.out.println("No car details available");
        }
    }
}
bc.accid=1;
		bc.accname="hdfc";
	    bc.typeofacc="saving";
	    bc.balance=300000;
		