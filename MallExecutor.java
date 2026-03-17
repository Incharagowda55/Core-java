class MallExecutor{
    public static void main(String[] args){

        Shop shop=new Shop(12,"Zudio","Clothing");
        Mall mall=new Mall(101,"Orion Mall",shop);
        mall.getMallDetails();
		
        Shop s1 = new Shop(1,"Zudio","Clothing");
        Mall m1 = new Mall(101,"Orion",s1);
        m1.getMallDetails();

        Shop s2 = new Shop(2,"Reliance","Electronics");
        Mall m2 = new Mall(102,"Forum",s2);
        m2.getMallDetails();

        Shop s3 = new Shop(3,"Puma","Sports");
        Mall m3 = new Mall(103,"Garuda",s3);
        m3.getMallDetails();

        Shop s4 = new Shop(4,"Nike","Sports");
        Mall m4 = new Mall(104,"GT Mall",s4);
        m4.getMallDetails();

        Shop s5 = new Shop(5,"Levis","Clothing");
        Mall m5 = new Mall(105,"UB City",s5);
        m5.getMallDetails();

        Shop s6 = new Shop(6,"Trends","Fashion");
        Mall m6 = new Mall(106,"Mantri",s6);
        m6.getMallDetails();

        Shop s7 = new Shop(7,"Apple","Electronics");
        Mall m7 = new Mall(107,"Phoenix",s7);
        m7.getMallDetails();

        Shop s8 = new Shop(8,"Samsung","Electronics");
        Mall m8 = new Mall(108,"Esteem",s8);
        m8.getMallDetails();

        Shop s9 = new Shop(9,"Adidas","Sports");
        Mall m9 = new Mall(109,"Lulu",s9);
        m9.getMallDetails();

        Shop s10 = new Shop(10,"Pantaloons","Clothing");
        Mall m10 = new Mall(110,"Central",s10);
        m10.getMallDetails();
    }
}
		
		