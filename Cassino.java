class Cassino{
    String game;
    int tables;
    boolean vipRoom;

    public Cassino(String game,int tables,boolean vipRoom){
        this.game=game;
        this.tables=tables;
        this.vipRoom=vipRoom;
    }

    public void getCassinoDetails(){
        System.out.println("Game: "+this.game);
        System.out.println("Tables: "+this.tables);
        System.out.println("VIP Room: "+this.vipRoom);
    }
}