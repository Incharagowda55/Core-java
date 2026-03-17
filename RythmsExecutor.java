
class RythmsExecutor{
    public static void main(String[] args){
        MusicInstrument instrument=new MusicInstrument("Guitar","String",5000);
        Rythms band=new Rythms(1,"RockBand",instrument);
        band.getRythmsDetails();
    }
}