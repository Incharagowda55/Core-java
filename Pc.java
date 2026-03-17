class Pc{
    int pcId;
    String pcBrand;
    Hardware hardware;

    public Pc(int pcId,String pcBrand,Hardware hardware){
        this.pcId=pcId;
        this.pcBrand=pcBrand;
        this.hardware=hardware;
    }

    public void getPcDetails(){
        System.out.println("PC Id: "+this.pcId);
        System.out.println("PC Brand: "+this.pcBrand);
        this.hardware.getHardwareDetails();
    }
}


