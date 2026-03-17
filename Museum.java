class Museum{
    int museumId;
    String museumName;
    Diamond diamond;

    public Museum(int museumId,String museumName,Diamond diamond){
        this.museumId=museumId;
        this.museumName=museumName;
        this.diamond=diamond;
    }

    public void getMuseumDetails(){
        System.out.println("Museum Id: "+this.museumId);
        System.out.println("Museum Name: "+this.museumName);
        this.diamond.getDiamondDetails();
    }
}

