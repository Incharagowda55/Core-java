class Paper {

    String brand;
    String size;
    String color;
    String type;
    int gsm;
    int price;
    String texture;
    String usage;
    String manufacturer;
    String country;
    boolean recyclable;
    String quality;
    int sheets;
    String packaging;
    String finish;
    String grade;
    String format;
    boolean ecoFriendly;
    String supply;
    int durability;

    public Paper(String brand,String size,String color,String type,int gsm,int price,String texture,String usage,String manufacturer,String country,boolean recyclable,String quality,int sheets,String packaging,String finish,String grade,String format,boolean ecoFriendly,String supply,int durability){

        this.brand=brand;
        this.size=size;
        this.color=color;
        this.type=type;
        this.gsm=gsm;
        this.price=price;
        this.texture=texture;
        this.usage=usage;
        this.manufacturer=manufacturer;
        this.country=country;
        this.recyclable=recyclable;
        this.quality=quality;
        this.sheets=sheets;
        this.packaging=packaging;
        this.finish=finish;
        this.grade=grade;
        this.format=format;
        this.ecoFriendly=ecoFriendly;
        this.supply=supply;
        this.durability=durability;
    }

    public void displayDetails(){
        System.out.println(brand);
        System.out.println(size);
        System.out.println(color);
        System.out.println(type);
        System.out.println(gsm);
        System.out.println(price);
        System.out.println(texture);
        System.out.println(usage);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(recyclable);
        System.out.println(quality);
        System.out.println(sheets);
        System.out.println(packaging);
        System.out.println(finish);
        System.out.println(grade);
        System.out.println(format);
        System.out.println(ecoFriendly);
        System.out.println(supply);
        System.out.println(durability);
    }
}