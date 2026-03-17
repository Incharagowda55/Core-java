class TvExecutor{
    public static void main(String[] args){

        Channel channel = new Channel(101,"Star Sports","English");

        Tv tv = new Tv(10,"Sony",channel);

        tv.getTvDetails();
		
		
        Channel ch1=new Channel(1,"Star","English");
        Tv t1=new Tv(1,"Sony",ch1);
        t1.channel=ch1;
        t1.getTvDetails();

        Channel ch2=new Channel(2,"Zee","Hindi");
        Tv t2=new Tv(2,"LG",ch2);
        t2.channel=ch2;
        t2.getTvDetails();

        Channel ch3=new Channel(3,"Colors","Hindi");
        Tv t3=new Tv(3,"Samsung",ch3);
        t3.channel=ch3;
        t3.getTvDetails();

        Channel ch4=new Channel(4,"Sun","Tamil");
        Tv t4=new Tv(4,"MI",ch4);
        t4.channel=ch4;
        t4.getTvDetails();

        Channel ch5=new Channel(5,"ETV","Telugu");
        Tv t5=new Tv(5,"OnePlus",ch5);
        t5.channel=ch5;
        t5.getTvDetails();

        Channel ch6=new Channel(6,"Star Sports","English");
        Tv t6=new Tv(6,"Sony",ch6);
        t6.channel=ch6;
        t6.getTvDetails();

        Channel ch7=new Channel(7,"Discovery","English");
        Tv t7=new Tv(7,"LG",ch7);
        t7.channel=ch7;
        t7.getTvDetails();

        Channel ch8=new Channel(8,"NatGeo","English");
        Tv t8=new Tv(8,"Samsung",ch8);
        t8.channel=ch8;
        t8.getTvDetails();

        Channel ch9=new Channel(9,"Cartoon","Kids");
        Tv t9=new Tv(9,"MI",ch9);
        t9.channel=ch9;
        t9.getTvDetails();

        Channel ch10=new Channel(10,"News","English");
        Tv t10=new Tv(10,"Sony",ch10);
        t10.channel=ch10;
        t10.getTvDetails();
    }
}