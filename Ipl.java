class Ipl{
    int teamId;
    String teamName;
    Player player;

    public Ipl(int teamId,String teamName,Player player){
        this.teamId=teamId;
        this.teamName=teamName;
        this.player=player;
    }

    public void getIplDetails(){
        System.out.println("Team Id: "+this.teamId);
        System.out.println("Team Name: "+this.teamName);
        this.player.getPlayerDetails();
    }
}


