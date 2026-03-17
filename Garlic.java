class Garlic {

    String type;
    String origin;
    String color;
    double weight;
    int price;
    boolean organic;
    String flavor;
    String packaging;
    String supplier;
    String market;
    int quantity;
    String form;
    String aroma;
    String storage;
    int shelfLife;
    String usage;
    String quality;
    boolean fresh;
    String grade;
    String exportCountry;

    public Garlic(String type,String origin,String color,double weight,int price,boolean organic,String flavor,String packaging,String supplier,String market,int quantity,String form,String aroma,String storage,int shelfLife,String usage,String quality,boolean fresh,String grade,String exportCountry){

        this.type=type;
        this.origin=origin;
        this.color=color;
        this.weight=weight;
        this.price=price;
        this.organic=organic;
        this.flavor=flavor;
        this.packaging=packaging;
        this.supplier=supplier;
        this.market=market;
        this.quantity=quantity;
        this.form=form;
        this.aroma=aroma;
        this.storage=storage;
        this.shelfLife=shelfLife;
        this.usage=usage;
        this.quality=quality;
        this.fresh=fresh;
        this.grade=grade;
        this.exportCountry=exportCountry;
    }

    public void displayDetails(){
        System.out.println(type);
        System.out.println(origin);
        System.out.println(color);
        System.out.println(weight);
        System.out.println(price);
        System.out.println(organic);
        System.out.println(flavor);
        System.out.println(packaging);
        System.out.println(supplier);
        System.out.println(market);
        System.out.println(quantity);
        System.out.println(form);
        System.out.println(aroma);
        System.out.println(storage);
        System.out.println(shelfLife);
        System.out.println(usage);
        System.out.println(quality);
        System.out.println(fresh);
        System.out.println(grade);
        System.out.println(exportCountry);
    }
}
