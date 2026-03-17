class TowelExecutor{
	public static void main(String[]args){
		
        Towel t1 = new Towel("Cotton");
        System.out.println("The material of towel is: " + t1.material);

        Towel t2 = new Towel("Blue");
        System.out.println("The color of towel is: " + t2.color);

        Towel t3 = new Towel("Puma");
        System.out.println("The brand of towel is: " + t3.brand);

        Towel t4 = new Towel("Large");
        System.out.println("The size of towel is: " + t4.size);

        Towel t5 = new Towel(120.5);
        System.out.println("The length of towel is: " + t5.length);

        Towel t6 = new Towel(60.5,1);
        System.out.println("The width of towel is: " + t6.width);

        Towel t7 = new Towel(450);
        System.out.println("The weight of towel is: " + t7.weight);

        Towel t8 = new Towel(true);
        System.out.println("Is towel soft: " + t8.soft);

        Towel t9 = new Towel(false);
        System.out.println("Is towel absorbent: " + t9.absorbent);

        Towel t10 = new Towel("Striped");
        System.out.println("The pattern of towel is: " + t10.pattern);

        Towel t11 = new Towel(299);
        System.out.println("The price of towel is: " + t11.price);

        Towel t12 = new Towel("Fast");
        System.out.println("The drying speed of towel is: " + t12.dryingSpeed);

    }
}
		
		
		
	