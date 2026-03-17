class Universe{
    int universeId;
    String galaxy;
    Earth earth;

    public Universe(int universeId,String galaxy,Earth earth){
        this.universeId=universeId;
        this.galaxy=galaxy;
        this.earth=earth;
    }

    public void getUniverseDetails(){
        System.out.println("Universe Id: "+this.universeId);
        System.out.println("Galaxy: "+this.galaxy);
        this.earth.getEarthDetails();
    }
}

