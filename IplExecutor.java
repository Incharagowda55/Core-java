class IplExecutor{
    public static void main(String[] args){
        Player player=new Player(18,"Virat Kohli","Batsman");
        Ipl ipl=new Ipl(1,"RCB",player);
        ipl.getIplDetails();
    }
}