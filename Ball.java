class Ball {

    String brand;
    String type;
    String color;
    double weight;
    double radius;
    String material;
    boolean inflatable;
    int price;
    String sport;
    String pattern;
    boolean waterproof;
    int durability;

    public Ball(String brand){
        this.brand = brand;
    }

    public Ball(String brand,String type){
        this.brand = brand;
        this.type = type;
    }

    public Ball(String brand,String type,String color){
        this.brand = brand;
        this.type = type;
        this.color = color;
    }

    public Ball(String brand,String type,String color,double weight){
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public Ball(String brand,String type,String color,double weight,double radius){
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.radius = radius;
    }

    public Ball(String brand,String type,String color,double weight,double radius,String material){
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.radius = radius;
        this.material = material;
    }

    public Ball(String brand,String type,String color,double weight,double radius,String material,boolean inflatable){
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.radius = radius;
        this.material = material;
        this.inflatable = inflatable;
    }

    public Ball(String brand,String type,String color,double weight,double radius,String material,boolean inflatable,int price){
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.radius = radius;
        this.material = material;
        this.inflatable = inflatable;
        this.price = price;
    }

    public Ball(String brand,String type,String color,double weight,double radius,String material,boolean inflatable,int price,String sport){
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.radius = radius;
        this.material = material;
        this.inflatable = inflatable;
        this.price = price;
        this.sport = sport;
    }

    public Ball(String brand,String type,String color,double weight,double radius,String material,boolean inflatable,int price,String sport,String pattern){
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.radius = radius;
        this.material = material;
        this.inflatable = inflatable;
        this.price = price;
        this.sport = sport;
        this.pattern = pattern;
    }

    public Ball(String brand,String type,String color,double weight,double radius,String material,boolean inflatable,int price,String sport,String pattern,boolean waterproof){
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.radius = radius;
        this.material = material;
        this.inflatable = inflatable;
        this.price = price;
        this.sport = sport;
        this.pattern = pattern;
        this.waterproof = waterproof;
    }

    public Ball(String brand,String type,String color,double weight,double radius,String material,boolean inflatable,int price,String sport,String pattern,boolean waterproof,int durability){
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.radius = radius;
        this.material = material;
        this.inflatable = inflatable;
        this.price = price;
        this.sport = sport;
        this.pattern = pattern;
        this.waterproof = waterproof;
        this.durability = durability;
    }

    public void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Radius: " + radius);
        System.out.println("Material: " + material);
        System.out.println("Inflatable: " + inflatable);
        System.out.println("Price: " + price);
        System.out.println("Sport: " + sport);
        System.out.println("Pattern: " + pattern);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Durability: " + durability);
        System.out.println("----------------------");
    }
}