class FlipKartRunner{
	
	public static void main(String[] args){
		
		FlipkartAcc acc=new FlipkartAcc();
		acc.setFullName("dube");
		acc.setEmail("dube123@gmail.com");
         acc.setPassword("dubelw");
        acc.setNumber("123456787");
       acc.setDateofBirth("3/05/1989");
       acc.setGender("male");
       acc.setAdreess("Mumbai");

       FlipkartArr fliparr=new FlipkartArr();

         boolean ref=fliparr.createaccount(acc);	 
            System.out.println(ref);
			
			System.out.println("------------------");
			
			
			FlipkartAcc acc2 = new FlipkartAcc();
			acc2.setFullName("Ravi");
			acc2.setEmail("ravi@gmail.com");
			acc2.setPassword("ravi123");
			acc2.setNumber("9876543210");
			acc2.setDateofBirth("01/01/1995");
			acc2.setGender("male");
			acc2.setAdreess("Bangalore");
			fliparr.createaccount(acc2);
			System.out.println("------------------");
			

			FlipkartAcc acc3 = new FlipkartAcc();
			acc3.setFullName("Anu");
			acc3.setEmail("anu@gmail.com");
			acc3.setPassword("anu123");
			acc3.setNumber("8765432109");
			acc3.setDateofBirth("02/02/1996");
			acc3.setGender("female");
			acc3.setAdreess("Mysore");
			fliparr.createaccount(acc3);System.out.println("------------------");
			

			FlipkartAcc acc4 = new FlipkartAcc();
			acc4.setFullName("Kiran");
			acc4.setEmail("kiran@gmail.com");
			acc4.setPassword("kiran123");
			acc4.setNumber("7654321098");
			acc4.setDateofBirth("03/03/1994");
			acc4.setGender("male");
			acc4.setAdreess("Delhi");
			fliparr.createaccount(acc4);
			System.out.println("------------------");
			

			FlipkartAcc acc5 = new FlipkartAcc();
			acc5.setFullName("Sneha");
			acc5.setEmail("sneha@gmail.com");
			acc5.setPassword("sneha123");
			acc5.setNumber("6543210987");
			acc5.setDateofBirth("04/04/1997");
			acc5.setGender("female");
			acc5.setAdreess("Mumbai");
			fliparr.createaccount(acc5);
			System.out.println("------------------");
			

			FlipkartAcc acc6 = new FlipkartAcc();
			acc6.setFullName("Rahul");
			acc6.setEmail("rahul@gmail.com");
			acc6.setPassword("rahul123");
			acc6.setNumber("5432109876");
			acc6.setDateofBirth("05/05/1993");
			acc6.setGender("male");
			acc6.setAdreess("Chennai");
			fliparr.createaccount(acc6);System.out.println("------------------");
			

			FlipkartAcc acc7 = new FlipkartAcc();
			acc7.setFullName("Pooja");
			acc7.setEmail("pooja@gmail.com");
			acc7.setPassword("pooja123");
			acc7.setNumber("4321098765");
			acc7.setDateofBirth("06/06/1998");
			acc7.setGender("female");
			acc7.setAdreess("Hyderabad");
			fliparr.createaccount(acc7);
			System.out.println("------------------");
			

			FlipkartAcc acc8 = new FlipkartAcc();
			acc8.setFullName("Arjun");
			acc8.setEmail("arjun@gmail.com");
			acc8.setPassword("arjun123");
			acc8.setNumber("3210987654");
			acc8.setDateofBirth("07/07/1992");
			acc8.setGender("male");
			acc8.setAdreess("Pune");
			fliparr.createaccount(acc8);
			System.out.println("------------------");
			

			FlipkartAcc acc9 = new FlipkartAcc();
			acc9.setFullName("Divya");
			acc9.setEmail("divya@gmail.com");
			acc9.setPassword("divya123");
			acc9.setNumber("2109876543");
			acc9.setDateofBirth("08/08/1999");
			acc9.setGender("female");
			acc9.setAdreess("Kolkata");
			fliparr.createaccount(acc9);System.out.println("------------------");
			

			FlipkartAcc acc10 = new FlipkartAcc();
			acc10.setFullName("Manoj");
			acc10.setEmail("manoj@gmail.com");
			acc10.setPassword("manoj123");
			acc10.setNumber("1098765432");
			acc10.setDateofBirth("09/09/1991");
			acc10.setGender("male");
			acc10.setAdreess("Jaipur");
			fliparr.createaccount(acc10);
			
			System.out.println("------------------");
			

			FlipkartAcc acc11 = new FlipkartAcc();
			acc11.setFullName("Neha");
			acc11.setEmail("neha@gmail.com");
			acc11.setPassword("neha123");
			acc11.setNumber("9988776655");
			acc11.setDateofBirth("10/10/2000");
			acc11.setGender("female");
			acc11.setAdreess("Ahmedabad");
			fliparr.createaccount(acc11);
			
			FlipkartAcc acc12 = new FlipkartAcc();
			acc12.setFullName("Suresh");
			acc12.setEmail("suresh@gmail.com");
			acc12.setPassword("suresh123");
			acc12.setNumber("8877665544");
			acc12.setDateofBirth("11/11/1990");
			acc12.setGender("male");
			acc12.setAdreess("Nagpur");
			fliparr.createaccount(acc12);

			FlipkartAcc acc13 = new FlipkartAcc();
			acc13.setFullName("Meena");
			acc13.setEmail("meena@gmail.com");
			acc13.setPassword("meena123");
			acc13.setNumber("7766554433");
			acc13.setDateofBirth("12/12/1993");
			acc13.setGender("female");
			acc13.setAdreess("Surat");
			fliparr.createaccount(acc13);

			FlipkartAcc acc14 = new FlipkartAcc();
			acc14.setFullName("Vikram");
			acc14.setEmail("vikram@gmail.com");
			acc14.setPassword("vikram123");
			acc14.setNumber("6655443322");
			acc14.setDateofBirth("01/01/1988");
			acc14.setGender("male");
			acc14.setAdreess("Lucknow");
			fliparr.createaccount(acc14);

			FlipkartAcc acc15 = new FlipkartAcc();
			acc15.setFullName("Kavya");
			acc15.setEmail("kavya@gmail.com");
			acc15.setPassword("kavya123");
			acc15.setNumber("5544332211");
			acc15.setDateofBirth("02/02/1997");
			acc15.setGender("female");
			acc15.setAdreess("Coimbatore");
			fliparr.createaccount(acc15);

			FlipkartAcc acc16 = new FlipkartAcc();
			acc16.setFullName("Ramesh");
			acc16.setEmail("ramesh@gmail.com");
			acc16.setPassword("ramesh123");
			acc16.setNumber("4433221100");
			acc16.setDateofBirth("03/03/1987");
			acc16.setGender("male");
			acc16.setAdreess("Bhopal");
			fliparr.createaccount(acc16);

			FlipkartAcc acc17 = new FlipkartAcc();
			acc17.setFullName("Asha");
			acc17.setEmail("asha@gmail.com");
			acc17.setPassword("asha123");
			acc17.setNumber("3322110099");
			acc17.setDateofBirth("04/04/1996");
			acc17.setGender("female");
			acc17.setAdreess("Indore");
			fliparr.createaccount(acc17);

			FlipkartAcc acc18 = new FlipkartAcc();
			acc18.setFullName("Deepak");
			acc18.setEmail("deepak@gmail.com");
			acc18.setPassword("deepak123");
			acc18.setNumber("2211009988");
			acc18.setDateofBirth("05/05/1992");
			acc18.setGender("male");
			acc18.setAdreess("Patna");
			fliparr.createaccount(acc18);

			FlipkartAcc acc19 = new FlipkartAcc();
			acc19.setFullName("Priya");
			acc19.setEmail("priya@gmail.com");
			acc19.setPassword("priya123");
			acc19.setNumber("1100998877");
			acc19.setDateofBirth("06/06/1998");
			acc19.setGender("female");
			acc19.setAdreess("Trichy");
			fliparr.createaccount(acc19);
						
						
			fliparr.getAccdetails();
						
						

						
				}
			}