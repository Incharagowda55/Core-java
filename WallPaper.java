class WallPaper {

    String brand;
    String color;
    String pattern;
    double width;
    double height;
    String material;
    boolean washable;
    int price;
    String texture;
    String design;
    String finish;
    String theme;
    boolean waterproof;
    String manufacturer;
    String country;
    int durability;
    String roomType;
    String installationType;
    String style;
    int warranty;

    public WallPaper(String brand,String color,String pattern,double width,double height,String material,boolean washable,int price,String texture,String design,String finish,String theme,boolean waterproof,String manufacturer,String country,int durability,String roomType,String installationType,String style,int warranty){

        this.brand=brand;
        this.color=color;
        this.pattern=pattern;
        this.width=width;
        this.height=height;
        this.material=material;
        this.washable=washable;
        this.price=price;
        this.texture=texture;
        this.design=design;
        this.finish=finish;
        this.theme=theme;
        this.waterproof=waterproof;
        this.manufacturer=manufacturer;
        this.country=country;
        this.durability=durability;
        this.roomType=roomType;
        this.installationType=installationType;
        this.style=style;
        this.warranty=warranty;
    }

    public void displayDetails(){
        System.out.println(brand);
        System.out.println(color);
        System.out.println(pattern);
        System.out.println(width);
        System.out.println(height);
        System.out.println(material);
        System.out.println(washable);
        System.out.println(price);
        System.out.println(texture);
        System.out.println(design);
        System.out.println(finish);
        System.out.println(theme);
        System.out.println(waterproof);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(durability);
        System.out.println(roomType);
        System.out.println(installationType);
        System.out.println(style);
        System.out.println(warranty);
    }
}