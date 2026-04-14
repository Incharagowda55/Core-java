class NykaaRunner {

    public static void main(String[] args) {

        NykaaArray nyArr = new NykaaArray();

        NykaaAccount n1 = new NykaaAccount();
        n1.setProductName("Lipstick");
        n1.setCategory("Makeup");
        n1.setBrand("Lakme");
        n1.setPrice(599);
        n1.setQuantity(10);
        n1.setSkinType("All");
        n1.setShade("Red");
        n1.setIsAvailable(true);

        nyArr.addProduct(n1);

        NykaaAccount n2 = new NykaaAccount();
        n2.setProductName("Foundation");
        n2.setCategory("Makeup");
        n2.setBrand("Maybelline");
        n2.setPrice(799);
        n2.setQuantity(8);
        n2.setSkinType("Oily");
        n2.setShade("Beige");
        n2.setIsAvailable(true);

        nyArr.addProduct(n2);
		
		
		
		NykaaAccount n3 = new NykaaAccount();
		n3.setProductName("Compact Powder");
		n3.setCategory("Makeup");
		n3.setBrand("Lakme");
		n3.setPrice(499);
		n3.setQuantity(12);
		n3.setSkinType("All");
		n3.setShade("Ivory");
		n3.setIsAvailable(true);
		nyArr.addProduct(n3);

		NykaaAccount n4 = new NykaaAccount();
		n4.setProductName("Eyeliner");
		n4.setCategory("Makeup");
		n4.setBrand("Maybelline");
		n4.setPrice(299);
		n4.setQuantity(15);
		n4.setSkinType("All");
		n4.setShade("Black");
		n4.setIsAvailable(true);
		nyArr.addProduct(n4);

		NykaaAccount n5 = new NykaaAccount();
		n5.setProductName("Mascara");
		n5.setCategory("Makeup");
		n5.setBrand("L'Oreal");
		n5.setPrice(699);
		n5.setQuantity(9);
		n5.setSkinType("All");
		n5.setShade("Black");
		n5.setIsAvailable(true);
		nyArr.addProduct(n5);

		NykaaAccount n6 = new NykaaAccount();
		n6.setProductName("Blush");
		n6.setCategory("Makeup");
		n6.setBrand("Nykaa");
		n6.setPrice(550);
		n6.setQuantity(7);
		n6.setSkinType("Dry");
		n6.setShade("Peach");
		n6.setIsAvailable(true);
		nyArr.addProduct(n6);

		NykaaAccount n7 = new NykaaAccount();
		n7.setProductName("Highlighter");
		n7.setCategory("Makeup");
		n7.setBrand("Wet n Wild");
		n7.setPrice(899);
		n7.setQuantity(5);
		n7.setSkinType("All");
		n7.setShade("Gold");
		n7.setIsAvailable(true);
		nyArr.addProduct(n7);

		NykaaAccount n8 = new NykaaAccount();
		n8.setProductName("Primer");
		n8.setCategory("Makeup");
		n8.setBrand("Colorbar");
		n8.setPrice(999);
		n8.setQuantity(6);
		n8.setSkinType("Oily");
		n8.setShade("Transparent");
		n8.setIsAvailable(true);
		nyArr.addProduct(n8);

		NykaaAccount n9 = new NykaaAccount();
		n9.setProductName("Concealer");
		n9.setCategory("Makeup");
		n9.setBrand("Maybelline");
		n9.setPrice(599);
		n9.setQuantity(10);
		n9.setSkinType("All");
		n9.setShade("Medium");
		n9.setIsAvailable(true);
		nyArr.addProduct(n9);

		NykaaAccount n10 = new NykaaAccount();
		n10.setProductName("Face Wash");
		n10.setCategory("Skincare");
		n10.setBrand("Himalaya");
		n10.setPrice(250);
		n10.setQuantity(20);
		n10.setSkinType("Oily");
		n10.setShade("NA");
		n10.setIsAvailable(true);
		nyArr.addProduct(n10);

		NykaaAccount n11 = new NykaaAccount();
		n11.setProductName("Moisturizer");
		n11.setCategory("Skincare");
		n11.setBrand("Nivea");
		n11.setPrice(350);
		n11.setQuantity(18);
		n11.setSkinType("Dry");
		n11.setShade("NA");
		n11.setIsAvailable(true);
		nyArr.addProduct(n11);

		NykaaAccount n12 = new NykaaAccount();
		n12.setProductName("Sunscreen");
		n12.setCategory("Skincare");
		n12.setBrand("Lotus");
		n12.setPrice(450);
		n12.setQuantity(14);
		n12.setSkinType("All");
		n12.setShade("NA");
		n12.setIsAvailable(true);
		nyArr.addProduct(n12);

		NykaaAccount n13 = new NykaaAccount();
		n13.setProductName("Serum");
		n13.setCategory("Skincare");
		n13.setBrand("Minimalist");
		n13.setPrice(799);
		n13.setQuantity(11);
		n13.setSkinType("All");
		n13.setShade("NA");
		n13.setIsAvailable(true);
		nyArr.addProduct(n13);

		NykaaAccount n14 = new NykaaAccount();
		n14.setProductName("Face Cream");
		n14.setCategory("Skincare");
		n14.setBrand("Ponds");
		n14.setPrice(299);
		n14.setQuantity(16);
		n14.setSkinType("Dry");
		n14.setShade("NA");
		n14.setIsAvailable(true);
		nyArr.addProduct(n14);

		NykaaAccount n15 = new NykaaAccount();
		n15.setProductName("Shampoo");
		n15.setCategory("Haircare");
		n15.setBrand("Dove");
		n15.setPrice(399);
		n15.setQuantity(13);
		n15.setSkinType("NA");
		n15.setShade("NA");
		n15.setIsAvailable(true);
		nyArr.addProduct(n15);

		NykaaAccount n16 = new NykaaAccount();
		n16.setProductName("Conditioner");
		n16.setCategory("Haircare");
		n16.setBrand("Tresemme");
		n16.setPrice(450);
		n16.setQuantity(10);
		n16.setSkinType("NA");
		n16.setShade("NA");
		n16.setIsAvailable(true);
		nyArr.addProduct(n16);

		NykaaAccount n17 = new NykaaAccount();
		n17.setProductName("Hair Oil");
		n17.setCategory("Haircare");
		n17.setBrand("Parachute");
		n17.setPrice(200);
		n17.setQuantity(25);
		n17.setSkinType("NA");
		n17.setShade("NA");
		n17.setIsAvailable(true);
		nyArr.addProduct(n17);

		NykaaAccount n18 = new NykaaAccount();
		n18.setProductName("Body Lotion");
		n18.setCategory("Skincare");
		n18.setBrand("Vaseline");
		n18.setPrice(350);
		n18.setQuantity(17);
		n18.setSkinType("Dry");
		n18.setShade("NA");
		n18.setIsAvailable(true);
		nyArr.addProduct(n18);

		NykaaAccount n19 = new NykaaAccount();
		n19.setProductName("Lip Balm");
		n19.setCategory("Makeup");
		n19.setBrand("Nivea");
		n19.setPrice(199);
		n19.setQuantity(22);
		n19.setSkinType("All");
		n19.setShade("Pink");
		n19.setIsAvailable(true);
		nyArr.addProduct(n19);

				nyArr.getAllProducts();
			}
		}