class FreeBusTravel {

    Aadhaar aadhaar;

    FreeBusTravel(Aadhaar aadhaar) {
        this.aadhaar = aadhaar;
    }

    void setAadhaar(Aadhaar aadhaar) {
        this.aadhaar = aadhaar;
    }

    void display() {
        System.out.println("Free Bus Travel Details:");

        if (aadhaar != null) {
            System.out.println("Aadhaar Number: " + aadhaar.number);
            System.out.println("Name: " + aadhaar.name);
            System.out.println("Address: " + aadhaar.address);
        } else {
            System.out.println("No Aadhaar linked");
        }
    }
}