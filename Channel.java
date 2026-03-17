class Channel{
    int channelNumber;
    String channelName;
    String language;

    public Channel(int channelNumber,String channelName,String language){
        this.channelNumber=channelNumber;
        this.channelName=channelName;
        this.language=language;
    }

    public void getChannelDetails(){
        System.out.println("Channel Number: "+this.channelNumber);
        System.out.println("Channel Name: "+this.channelName);
        System.out.println("Language: "+this.language);
    }
}