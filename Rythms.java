class Rythms{
    int bandId;
    String bandName;
    MusicInstrument instrument;

    public Rythms(int bandId,String bandName,MusicInstrument instrument){
        this.bandId=bandId;
        this.bandName=bandName;
        this.instrument=instrument;
    }

    public void getRythmsDetails(){
        System.out.println("Band Id: "+this.bandId);
        System.out.println("Band Name: "+this.bandName);
        this.instrument.getMusicInstrumentDetails();
    }
}

