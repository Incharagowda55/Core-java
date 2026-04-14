class NykaaAccount {

    private String productName;
    private String category;
    private String brand;
    private double price;
    private int quantity;
    private String skinType;
    private String shade;
    private boolean isAvailable;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getSkinType() {
        return this.skinType;
    }

    public void setShade(String shade) {
        this.shade = shade;
    }

    public String getShade() {
        return this.shade;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }
}