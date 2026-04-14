class MallAccount {

    private String mallName;
    private String location;
    private int numberOfShops;
    private int parkingCapacity;
    private String openingTime;
    private String closingTime;
    private String city;
    private boolean isOpen;

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getMallName() {
        return this.mallName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

    public void setNumberOfShops(int numberOfShops) {
        this.numberOfShops = numberOfShops;
    }

    public int getNumberOfShops() {
        return this.numberOfShops;
    }

    public void setParkingCapacity(int parkingCapacity) {
        this.parkingCapacity = parkingCapacity;
    }

    public int getParkingCapacity() {
        return this.parkingCapacity;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getOpeningTime() {
        return this.openingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public String getClosingTime() {
        return this.closingTime;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public boolean getIsOpen() {
        return this.isOpen;
    }
}