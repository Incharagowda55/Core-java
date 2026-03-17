
class BigDaddyExecutor{
    public static void main(String[] args){

        Cassino cassino=new Cassino("Poker",20,true);

        BigDaddy ship=new BigDaddy(5,"Goa",cassino);

        ship.getBigDaddyDetails();
		
        Cassino c1=new Cassino("Poker",10,true);
        BigDaddy b1=new BigDaddy(1,"Goa",c1);
        b1.getBigDaddyDetails();

        Cassino c2=new Cassino("Roulette",15,false);
        BigDaddy b2=new BigDaddy(2,"Goa",c2);
        b2.getBigDaddyDetails();

        Cassino c3=new Cassino("Blackjack",12,true);
        BigDaddy b3=new BigDaddy(3,"Goa",c3);
        b3.getBigDaddyDetails();

        Cassino c4=new Cassino("Slots",20,false);
        BigDaddy b4=new BigDaddy(4,"Goa",c4);
        b4.getBigDaddyDetails();

        Cassino c5=new Cassino("Poker",18,true);
        BigDaddy b5=new BigDaddy(5,"Goa",c5);
        b5.getBigDaddyDetails();

        Cassino c6=new Cassino("Roulette",14,false);
        BigDaddy b6=new BigDaddy(6,"Goa",c6);
        b6.getBigDaddyDetails();

        Cassino c7=new Cassino("Blackjack",16,true);
        BigDaddy b7=new BigDaddy(7,"Goa",c7);
        b7.getBigDaddyDetails();

        Cassino c8=new Cassino("Slots",25,false);
        BigDaddy b8=new BigDaddy(8,"Goa",c8);
        b8.getBigDaddyDetails();

        Cassino c9=new Cassino("Poker",22,true);
        BigDaddy b9=new BigDaddy(9,"Goa",c9);
        b9.getBigDaddyDetails();

        Cassino c10=new Cassino("Roulette",30,false);
        BigDaddy b10=new BigDaddy(10,"Goa",c10);
        b10.getBigDaddyDetails();
    }
}
    