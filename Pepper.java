class Pepper{


    String type;
    String color;
    double weight;
    String origin;
    boolean organic;
    int price;
    String taste;
    String packaging;
    String brand;
    String quality;
    int quantity;
    String form;
    String aroma;
    boolean spicy;
    String storage;
    String usage;
    int shelfLife;
    String supplier;
    String grade;
    String market;

    public Pepper(String type,String color,double weight,String origin,boolean organic,int price,String taste,String packaging,String brand,String quality,int quantity,String form,String aroma,boolean spicy,String storage,String usage,int shelfLife,String supplier,String grade,String market){

        this.type=type;
        this.color=color;
        this.weight=weight;
        this.origin=origin;
        this.organic=organic;
        this.price=price;
        this.taste=taste;
        this.packaging=packaging;
        this.brand=brand;
        this.quality=quality;
        this.quantity=quantity;
        this.form=form;
        this.aroma=aroma;
        this.spicy=spicy;
        this.storage=storage;
        this.usage=usage;
        this.shelfLife=shelfLife;
        this.supplier=supplier;
        this.grade=grade;
        this.market=market;
    }

    public void displayDetails(){
        System.out.println(type);
        System.out.println(color);
        System.out.println(weight);
        System.out.println(origin);
        System.out.println(organic);
        System.out.println(price);
        System.out.println(taste);
        System.out.println(packaging);
        System.out.println(brand);
        System.out.println(quality);
        System.out.println(quantity);
        System.out.println(form);
        System.out.println(aroma);
        System.out.println(spicy);
        System.out.println(storage);
        System.out.println(usage);
        System.out.println(shelfLife);
        System.out.println(supplier);
        System.out.println(grade);
        System.out.println(market);
    }
}

