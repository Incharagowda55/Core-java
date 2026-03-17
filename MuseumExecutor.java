class MuseumExecutor{
    public static void main(String[] args){

        Diamond diamond = new Diamond(5,"White",100000);

        Museum museum = new Museum(10,"National Museum",diamond);

        museum.getMuseumDetails();
	
        Diamond d1=new Diamond(1,"White",100000);
        Museum m1=new Museum(1,"National",d1);
        m1.diamond=d1;
        m1.getMuseumDetails();

        Diamond d2=new Diamond(2,"Blue",200000);
        Museum m2=new Museum(2,"History",d2);
        m2.diamond=d2;
        m2.getMuseumDetails();

        Diamond d3=new Diamond(3,"Pink",300000);
        Museum m3=new Museum(3,"Art",d3);
        m3.diamond=d3;
        m3.getMuseumDetails();

        Diamond d4=new Diamond(4,"Yellow",150000);
        Museum m4=new Museum(4,"Science",d4);
        m4.diamond=d4;
        m4.getMuseumDetails();

        Diamond d5=new Diamond(5,"Green",180000);
        Museum m5=new Museum(5,"Heritage",d5);
        m5.diamond=d5;
        m5.getMuseumDetails();

        Diamond d6=new Diamond(6,"Black",220000);
        Museum m6=new Museum(6,"Gem",d6);
        m6.diamond=d6;
        m6.getMuseumDetails();

        Diamond d7=new Diamond(7,"Red",250000);
        Museum m7=new Museum(7,"Rare",d7);
        m7.diamond=d7;
        m7.getMuseumDetails();

        Diamond d8=new Diamond(8,"White",120000);
        Museum m8=new Museum(8,"City",d8);
        m8.diamond=d8;
        m8.getMuseumDetails();

        Diamond d9=new Diamond(9,"Blue",210000);
        Museum m9=new Museum(9,"Global",d9);
        m9.diamond=d9;
        m9.getMuseumDetails();

        Diamond d10=new Diamond(10,"Pink",310000);
        Museum m10=new Museum(10,"Royal",d10);
        m10.diamond=d10;
        m10.getMuseumDetails();
    }
}
    