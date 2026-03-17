class Stand {

    String type;
    String material;
    String color;
    double height;
    double width;
    int price;
    String brand;
    String usage;
    String design;
    String finish;
    boolean foldable;
    String manufacturer;
    String country;
    int durability;
    String weightCapacity;
    String style;
    String roomType;
    boolean portable;
    String packaging;
    int warranty;

    public Stand(String type,String material,String color,double height,double width,int price,String brand,String usage,String design,String finish,boolean foldable,String manufacturer,String country,int durability,String weightCapacity,String style,String roomType,boolean portable,String packaging,int warranty){

        this.type=type;
        this.material=material;
        this.color=color;
        this.height=height;
        this.width=width;
        this.price=price;
        this.brand=brand;
        this.usage=usage;
        this.design=design;
        this.finish=finish;
        this.foldable=foldable;
        this.manufacturer=manufacturer;
        this.country=country;
        this.durability=durability;
        this.weightCapacity=weightCapacity;
        this.style=style;
        this.roomType=roomType;
        this.portable=portable;
        this.packaging=packaging;
        this.warranty=warranty;
    }

    public void displayDetails(){
        System.out.println(type);
        System.out.println(material);
        System.out.println(color);
        System.out.println(height);
        System.out.println(width);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(usage);
        System.out.println(design);
        System.out.println(finish);
        System.out.println(foldable);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(durability);
        System.out.println(weightCapacity);
        System.out.println(style);
        System.out.println(roomType);
        System.out.println(portable);
        System.out.println(packaging);
        System.out.println(warranty);
    }
}