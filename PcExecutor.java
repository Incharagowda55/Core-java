class PcExecutor{
    public static void main(String[] args){

        Hardware hardware=new Hardware("Intel i7",16,512);

        Pc pc=new Pc(10,"Dell",hardware);

        pc.getPcDetails();
	

        Hardware h1=new Hardware("i5",8,512);
        Pc p1=new Pc(1,"Dell",h1);
        p1.getPcDetails();

        Hardware h2=new Hardware("i7",16,1024);
        Pc p2=new Pc(2,"HP",h2);
        p2.getPcDetails();

        Hardware h3=new Hardware("Ryzen5",8,512);
        Pc p3=new Pc(3,"Lenovo",h3);
        p3.getPcDetails();

        Hardware h4=new Hardware("i3",4,256);
        Pc p4=new Pc(4,"Acer",h4);
        p4.getPcDetails();

        Hardware h5=new Hardware("i9",32,2048);
        Pc p5=new Pc(5,"Asus",h5);
        p5.getPcDetails();

        Hardware h6=new Hardware("Ryzen7",16,1024);
        Pc p6=new Pc(6,"MSI",h6);
        p6.getPcDetails();

        Hardware h7=new Hardware("i5",8,512);
        Pc p7=new Pc(7,"Samsung",h7);
        p7.getPcDetails();

        Hardware h8=new Hardware("i7",16,512);
        Pc p8=new Pc(8,"Sony",h8);
        p8.getPcDetails();

        Hardware h9=new Hardware("Ryzen3",4,256);
        Pc p9=new Pc(9,"Toshiba",h9);
        p9.getPcDetails();

        Hardware h10=new Hardware("i9",32,1024);
        Pc p10=new Pc(10,"Apple",h10);
        p10.getPcDetails();
    }
}
    