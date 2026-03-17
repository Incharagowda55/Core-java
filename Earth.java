class Earth{
    int planetId;
    String continent;
    int population;

    public Earth(int planetId,String continent,int population){
        this.planetId=planetId;
        this.continent=continent;
        this.population=population;
    }

    public void getEarthDetails(){
        System.out.println("Planet Id: "+this.planetId);
        System.out.println("Continent: "+this.continent);
        System.out.println("Population: "+this.population);
    }
}