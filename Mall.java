class Mall{
    int mallId;
    String mallName;
    Shop shop;

    public Mall(int mallId,String mallName,Shop shop){
        this.mallId=mallId;
        this.mallName=mallName;
        this.shop=shop;
    }

    public void getMallDetails(){
        System.out.println("Mall Id: "+this.mallId);
        System.out.println("Mall Name: "+this.mallName);
        this.shop.getShopDetails();
    }
}