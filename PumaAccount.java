class PumaAccount {

    private String productName;
    private String category;
    private String size;
    private String color;
    private double price;
    private int quantity;
    private String material;
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

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
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

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }
}