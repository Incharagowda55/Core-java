class Diamond{
    int carat;
    String color;
    int price;

    public Diamond(int carat,String color,int price){
        this.carat=carat;
        this.color=color;
        this.price=price;
    }

    public void getDiamondDetails(){
        System.out.println("Carat: "+this.carat);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
    }
}