class PeriodicTableExecutor{
    public static void main(String[] args){

        Element element = new Element(1,"Hydrogen","H");

        PeriodicTable table = new PeriodicTable(1,"Modern Table",element);

        table.getTableDetails();
    
        Element e1=new Element(1,"Hydrogen","H");
        PeriodicTable p1=new PeriodicTable(1,"Modern",e1);
        p1.element=e1;
        p1.getTableDetails();

        Element e2=new Element(2,"Helium","He");
        PeriodicTable p2=new PeriodicTable(2,"Modern",e2);
        p2.element=e2;
        p2.getTableDetails();

        Element e3=new Element(3,"Lithium","Li");
        PeriodicTable p3=new PeriodicTable(3,"Modern",e3);
        p3.element=e3;
        p3.getTableDetails();

        Element e4=new Element(4,"Beryllium","Be");
        PeriodicTable p4=new PeriodicTable(4,"Modern",e4);
        p4.element=e4;
        p4.getTableDetails();

        Element e5=new Element(5,"Boron","B");
        PeriodicTable p5=new PeriodicTable(5,"Modern",e5);
        p5.element=e5;
        p5.getTableDetails();

        Element e6=new Element(6,"Carbon","C");
        PeriodicTable p6=new PeriodicTable(6,"Modern",e6);
        p6.element=e6;
        p6.getTableDetails();

        Element e7=new Element(7,"Nitrogen","N");
        PeriodicTable p7=new PeriodicTable(7,"Modern",e7);
        p7.element=e7;
        p7.getTableDetails();

        Element e8=new Element(8,"Oxygen","O");
        PeriodicTable p8=new PeriodicTable(8,"Modern",e8);
        p8.element=e8;
        p8.getTableDetails();

        Element e9=new Element(9,"Fluorine","F");
        PeriodicTable p9=new PeriodicTable(9,"Modern",e9);
        p9.element=e9;
        p9.getTableDetails();

        Element e10=new Element(10,"Neon","Ne");
        PeriodicTable p10=new PeriodicTable(10,"Modern",e10);
        p10.element=e10;
        p10.getTableDetails();
    }
}