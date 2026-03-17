class BigDaddy{
    int shipId;
    String location;
    Cassino cassino;

    public BigDaddy(int shipId,String location,Cassino cassino){
        this.shipId=shipId;
        this.location=location;
        this.cassino=cassino;
    }

    public void getBigDaddyDetails(){
        System.out.println("Ship Id: "+this.shipId);
        System.out.println("Location: "+this.location);
        this.cassino.getCassinoDetails();
    }
}


