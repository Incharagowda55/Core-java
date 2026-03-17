class LaptopExecutor {

    public static void main(String[] args) {

        Laptop l1 = new Laptop("Dell");
        l1.displayDetails();

        Laptop l2 = new Laptop("HP","Pavilion");
        l2.displayDetails();

        Laptop l3 = new Laptop("Lenovo","IdeaPad",16);
        l3.displayDetails();
		
        Laptop l4 = new Laptop("Asus","ROG",32,1000);
        l4.displayDetails();

        Laptop l5 = new Laptop("Apple","MacBook",16,512,150000);
        l5.displayDetails();

        Laptop l6 = new Laptop("Dell","Inspiron",8,512,65000,"i5");
          l6.displayDetails();

        Laptop l7 = new Laptop("HP","Victus",16,512,85000,"i7",15.6);
        l7.displayDetails();
		
        Laptop l8 = new Laptop("Lenovo","Legion",16,1024,120000,"i7",16,"Black");
        l8.displayDetails();

        Laptop l9 = new Laptop("Asus","TUF",16,1024,110000,"Ryzen7",15.6,"Gray",2.3);
        l9.displayDetails();

        Laptop l10 = new Laptop("Acer","Nitro",16,512,95000,"i7",15.6,"Red",2.5,true);
        l10.displayDetails();

        Laptop l11 = new Laptop("Apple","MacBook Pro",16,1024,200000,"M2",14,"Silver",1.8,false,"MacOS");
         l11.displayDetails();
		 
        Laptop l12 = new Laptop("Dell","XPS",16,1024,210000,"i9",15.6,"Black",1.9,true,"Windows",3);
        l12.displayDetails();
		
    }
}