class ProductionHouseExecutor{
    public static void main(String[] args){

        Movie movie = new Movie(101,"KGF","Yash");

        ProductionHouse house = new ProductionHouse(1,"Hombale Films",movie);

        house.getProductionHouseDetails();
    }
}