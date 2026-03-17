class Laptop {
    String brand;
    String model;
    int ram;
    int storage;
    String processor;
    double price;
    double screenSize;   // ADD THIS
    String color;
    double weight;
    int battery;
    String os;
    boolean touchscreen;
    int warranty;

    public Laptop(String brand){
        this.brand = brand;
    }
	
     public Laptop(String brand,String model){
        this.brand = brand;
        this.model = model;

       
    }
	    public Laptop(String brand,String model,int ram){
        this.brand = brand;
        this.model = model;
        this.ram = ram;

        
    }
	
	    public Laptop(String brand,String model,int ram,int storage){
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;

        
    }
	    public Laptop(String brand,String model,int ram,int storage,double price){
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.price = price;

        
    }
	    public Laptop(String brand,String model,int ram,int storage,double price,String processor){
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.processor = processor;

        
    }
	    public Laptop(String brand,String model,int ram,int storage,double price,String processor,double screenSize){
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.processor = processor;
        this.screenSize = screenSize;

        
    }
	    public Laptop(String brand,String model,int ram,int storage,double price,String processor,double screenSize,String color){
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.processor = processor;
        this.screenSize = screenSize;
        this.color = color;

        
    }
	    public Laptop(String brand,String model,int ram,int storage,double price,String processor,double screenSize,String color,double weight){
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.processor = processor;
        this.screenSize = screenSize;
        this.color = color;
        this.weight = weight;

        
    }
	    public Laptop(String brand,String model,int ram,int storage,double price,String processor,double screenSize,String color,double weight,boolean touchscreen){
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.processor = processor;
        this.screenSize = screenSize;
        this.color = color;
        this.weight = weight;
        this.touchscreen = touchscreen;

        
    }
	    public Laptop(String brand,String model,int ram,int storage,double price,String processor,double screenSize,String color,double weight,boolean touchscreen,String os){
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.processor = processor;
        this.screenSize = screenSize;
        this.color = color;
        this.weight = weight;
        this.touchscreen = touchscreen;
        this.os = os;

        
    }
	
	    public Laptop(String brand,String model,int ram,int storage,double price,String processor,double screenSize,String color,double weight,boolean touchscreen,String os,int warranty){
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.processor = processor;
        this.screenSize = screenSize;
        this.color = color;
        this.weight = weight;
        this.touchscreen = touchscreen;
        this.os = os;
        this.warranty = warranty;

        
    }
	public void displayDetails(){
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + model);
    System.out.println("RAM: " + ram);
    System.out.println("Storage: " + storage);
    System.out.println("Processor: " + processor);
    System.out.println("Price: " + price);
    System.out.println("Screen Size: " + screenSize);
    System.out.println("Color: " + color);
    System.out.println("Weight: " + weight);
    System.out.println("Battery: " + battery);
    System.out.println("OS: " + os);
    System.out.println("Touchscreen: " + touchscreen);
    System.out.println("Warranty: " + warranty);
}
}