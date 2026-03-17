class Player{
    int playerId;
    String playerName;
    String role;

    public Player(int playerId,String playerName,String role){
        this.playerId=playerId;
        this.playerName=playerName;
        this.role=role;
    }

    public void getPlayerDetails(){
        System.out.println("Player Id: "+this.playerId);
        System.out.println("Player Name: "+this.playerName);
        System.out.println("Role: "+this.role);
    }
}