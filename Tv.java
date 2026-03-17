class Tv{
    int tvId;
    String brand;
    Channel channel;

    public Tv(int tvId,String brand,Channel channel){
        this.tvId=tvId;
        this.brand=brand;
        this.channel=channel;
    }

    public void getTvDetails(){
        System.out.println("TV Id: "+this.tvId);
        System.out.println("Brand: "+this.brand);
        this.channel.getChannelDetails();
    }
}

