class RedbusAccount {

    private String passengerName;
    private String email;
    private String phoneNumber;
    private String source;
    private String destination;
    private String busType;
    private double ticketPrice;
    private boolean isBooked;

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerName() {
        return this.passengerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getBusType() {
        return this.busType;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getTicketPrice() {
        return this.ticketPrice;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public boolean getIsBooked() {
        return this.isBooked;
    }
}