class PlayStore{
    int storeId;
    String storeName;
    Application application;

    public PlayStore(int storeId,String storeName,Application application){
        this.storeId=storeId;
        this.storeName=storeName;
        this.application=application;
    }

    public void getPlayStoreDetails(){
        System.out.println("Store Id: "+this.storeId);
        System.out.println("Store Name: "+this.storeName);
        this.application.getApplicationDetails();
    }
}

