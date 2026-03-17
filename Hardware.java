class Hardware{
    String cpu;
    int ram;
    int storage;

    public Hardware(String cpu,int ram,int storage){
        this.cpu=cpu;
        this.ram=ram;
        this.storage=storage;
    }

    public void getHardwareDetails(){
        System.out.println("CPU: "+this.cpu);
        System.out.println("RAM: "+this.ram);
        System.out.println("Storage: "+this.storage);
    }
}