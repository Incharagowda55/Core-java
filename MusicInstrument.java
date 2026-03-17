
class MusicInstrument{
    String instrumentName;
    String type;
    int price;

    public MusicInstrument(String instrumentName,String type,int price){
        this.instrumentName=instrumentName;
        this.type=type;
        this.price=price;
    }

    public void getMusicInstrumentDetails(){
        System.out.println("Instrument Name: "+this.instrumentName);
        System.out.println("Type: "+this.type);
        System.out.println("Price: "+this.price);
    }
}