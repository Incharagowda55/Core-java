class UniverseExecutor{
    public static void main(String[] args){

        Earth earth = new Earth(3,"Asia",800000000);

        Universe universe = new Universe(1,"MilkyWay",earth);

        universe.getUniverseDetails();
		
	
        Earth e1=new Earth(1,"Asia",1000000);
        Universe u1=new Universe(1,"MilkyWay",e1);
        u1.earth=e1;
        u1.getUniverseDetails();

        Earth e2=new Earth(2,"Europe",800000);
        Universe u2=new Universe(2,"MilkyWay",e2);
        u2.earth=e2;
        u2.getUniverseDetails();

        Earth e3=new Earth(3,"Africa",900000);
        Universe u3=new Universe(3,"MilkyWay",e3);
        u3.earth=e3;
        u3.getUniverseDetails();

        Earth e4=new Earth(4,"America",1200000);
        Universe u4=new Universe(4,"MilkyWay",e4);
        u4.earth=e4;
        u4.getUniverseDetails();

        Earth e5=new Earth(5,"Australia",300000);
        Universe u5=new Universe(5,"MilkyWay",e5);
        u5.earth=e5;
        u5.getUniverseDetails();

        Earth e6=new Earth(6,"Asia",1100000);
        Universe u6=new Universe(6,"MilkyWay",e6);
        u6.earth=e6;
        u6.getUniverseDetails();

        Earth e7=new Earth(7,"Europe",700000);
        Universe u7=new Universe(7,"MilkyWay",e7);
        u7.earth=e7;
        u7.getUniverseDetails();

        Earth e8=new Earth(8,"Africa",850000);
        Universe u8=new Universe(8,"MilkyWay",e8);
        u8.earth=e8;
        u8.getUniverseDetails();

        Earth e9=new Earth(9,"America",1300000);
        Universe u9=new Universe(9,"MilkyWay",e9);
        u9.earth=e9;
        u9.getUniverseDetails();

        Earth e10=new Earth(10,"Asia",1200000);
        Universe u10=new Universe(10,"MilkyWay",e10);
        u10.earth=e10;
        u10.getUniverseDetails();
    }
}
  