
class LensKartExecutor{
    public static void main(String[] args){

        Frame frame=new Frame("Full Rim","Black",2500);

        LensKart store=new LensKart(100,"Bangalore",frame);

        store.getLensKartDetails();
		
        Frame f1=new Frame("Full Rim","Black",2000);
        LensKart l1=new LensKart(1,"Bangalore",f1);
        l1.getLensKartDetails();

        Frame f2=new Frame("Half Rim","Blue",1800);
        LensKart l2=new LensKart(2,"Mysore",f2);
        l2.getLensKartDetails();

        Frame f3=new Frame("Rimless","Silver",2500);
        LensKart l3=new LensKart(3,"Delhi",f3);
        l3.getLensKartDetails();

        Frame f4=new Frame("Full Rim","Gold",3000);
        LensKart l4=new LensKart(4,"Mumbai",f4);
        l4.getLensKartDetails();

        Frame f5=new Frame("Half Rim","Black",1500);
        LensKart l5=new LensKart(5,"Chennai",f5);
        l5.getLensKartDetails();

        Frame f6=new Frame("Full Rim","Brown",2200);
        LensKart l6=new LensKart(6,"Hyderabad",f6);
        l6.getLensKartDetails();

        Frame f7=new Frame("Rimless","Gray",2700);
        LensKart l7=new LensKart(7,"Pune",f7);
        l7.getLensKartDetails();

        Frame f8=new Frame("Full Rim","Red",2100);
        LensKart l8=new LensKart(8,"Kolkata",f8);
        l8.getLensKartDetails();

        Frame f9=new Frame("Half Rim","Green",1600);
        LensKart l9=new LensKart(9,"Jaipur",f9);
        l9.getLensKartDetails();

        Frame f10=new Frame("Rimless","Black",2600);
        LensKart l10=new LensKart(10,"Goa",f10);
        l10.getLensKartDetails();
    }
}
    