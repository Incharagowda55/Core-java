class Shop{
    int shopNumber;
    String shopName;
    String type;

    public Shop(int shopNumber,String shopName,String type){
        this.shopNumber=shopNumber;
        this.shopName=shopName;
        this.type=type;
    }

    public void getShopDetails(){
        System.out.println("Shop Number: "+this.shopNumber);
        System.out.println("Shop Name: "+this.shopName);
        System.out.println("Type: "+this.type);
    }
}