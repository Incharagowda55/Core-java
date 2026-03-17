class Frame{
    String frameType;
    String color;
    int price;

    public Frame(String frameType,String color,int price){
        this.frameType=frameType;
        this.color=color;
        this.price=price;
    }

    public void getFrameDetails(){
        System.out.println("Frame Type: "+this.frameType);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
    }
}