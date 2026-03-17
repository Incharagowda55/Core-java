class ProductionHouse{
    int houseId;
    String houseName;
    Movie movie;

    public ProductionHouse(int houseId,String houseName,Movie movie){
        this.houseId=houseId;
        this.houseName=houseName;
        this.movie=movie;
    }

    public void getProductionHouseDetails(){
        System.out.println("House Id: "+this.houseId);
        System.out.println("House Name: "+this.houseName);
        this.movie.getMovieDetails();
    }
}
