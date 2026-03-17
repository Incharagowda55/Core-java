class Wonderla{
    int parkId;
    String location;
    LazyPool lazyPool;

    public Wonderla(int parkId,String location,LazyPool lazyPool){
        this.parkId=parkId;
        this.location=location;
        this.lazyPool=lazyPool;
    }

    public void getWonderlaDetails(){
        System.out.println("Park Id: "+this.parkId);
        System.out.println("Location: "+this.location);
        this.lazyPool.getLazyPoolDetails();
    }
}

