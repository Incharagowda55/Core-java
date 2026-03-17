class LensKart{
    int storeId;
    String location;
    Frame frame;

    public LensKart(int storeId,String location,Frame frame){
        this.storeId=storeId;
        this.location=location;
        this.frame=frame;
    }

    public void getLensKartDetails(){
        System.out.println("Store Id: "+this.storeId);
        System.out.println("Location: "+this.location);
        this.frame.getFrameDetails();
    }
}


