class HMAccount {

    private String productName;
    private String category;     
    private String size;
    private String color;
    private double price;
    private int quantity;
    private String brand;
    private boolean inStock;


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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public boolean getInStock() {
        return this.inStock;
    }
}