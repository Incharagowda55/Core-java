class MallRunner {

    public static void main(String[] args) {

        MallArray mallArr = new MallArray();

        MallAccount m1 = new MallAccount();
        m1.setMallName("Orion Mall");
        m1.setLocation("Rajajinagar");
        m1.setNumberOfShops(150);
        m1.setParkingCapacity(500);
        m1.setOpeningTime("10:00 AM");
        m1.setClosingTime("10:00 PM");
        m1.setCity("Bangalore");
        m1.setIsOpen(true);

        mallArr.addMall(m1);

        MallAccount m2 = new MallAccount();
        m2.setMallName("Forum Mall");
        m2.setLocation("Koramangala");
        m2.setNumberOfShops(120);
        m2.setParkingCapacity(400);
        m2.setOpeningTime("10:30 AM");
        m2.setClosingTime("10:30 PM");
        m2.setCity("Bangalore");
        m2.setIsOpen(true);

        mallArr.addMall(m2);
		
				MallAccount m3 = new MallAccount();
		m3.setMallName("Garuda Mall");
		m3.setLocation("Magrath Road");
		m3.setNumberOfShops(100);
		m3.setParkingCapacity(300);
		m3.setOpeningTime("10:00 AM");
		m3.setClosingTime("10:00 PM");
		m3.setCity("Bangalore");
		m3.setIsOpen(true);
		mallArr.addMall(m3);

		MallAccount m4 = new MallAccount();
		m4.setMallName("UB City Mall");
		m4.setLocation("Vittal Mallya Road");
		m4.setNumberOfShops(80);
		m4.setParkingCapacity(200);
		m4.setOpeningTime("11:00 AM");
		m4.setClosingTime("11:00 PM");
		m4.setCity("Bangalore");
		m4.setIsOpen(true);
		mallArr.addMall(m4);

		MallAccount m5 = new MallAccount();
		m5.setMallName("Phoenix Marketcity");
		m5.setLocation("Whitefield");
		m5.setNumberOfShops(200);
		m5.setParkingCapacity(700);
		m5.setOpeningTime("10:00 AM");
		m5.setClosingTime("10:00 PM");
		m5.setCity("Bangalore");
		m5.setIsOpen(true);
		mallArr.addMall(m5);

		MallAccount m6 = new MallAccount();
		m6.setMallName("Inorbit Mall");
		m6.setLocation("Malad");
		m6.setNumberOfShops(180);
		m6.setParkingCapacity(600);
		m6.setOpeningTime("10:30 AM");
		m6.setClosingTime("10:30 PM");
		m6.setCity("Mumbai");
		m6.setIsOpen(true);
		mallArr.addMall(m6);

		MallAccount m7 = new MallAccount();
		m7.setMallName("High Street Phoenix");
		m7.setLocation("Lower Parel");
		m7.setNumberOfShops(220);
		m7.setParkingCapacity(800);
		m7.setOpeningTime("10:00 AM");
		m7.setClosingTime("10:00 PM");
		m7.setCity("Mumbai");
		m7.setIsOpen(true);
		mallArr.addMall(m7);

		MallAccount m8 = new MallAccount();
		m8.setMallName("Select Citywalk");
		m8.setLocation("Saket");
		m8.setNumberOfShops(170);
		m8.setParkingCapacity(500);
		m8.setOpeningTime("10:00 AM");
		m8.setClosingTime("10:00 PM");
		m8.setCity("Delhi");
		m8.setIsOpen(true);
		mallArr.addMall(m8);

		MallAccount m9 = new MallAccount();
		m9.setMallName("DLF Mall of India");
		m9.setLocation("Noida");
		m9.setNumberOfShops(300);
		m9.setParkingCapacity(1000);
		m9.setOpeningTime("10:00 AM");
		m9.setClosingTime("10:00 PM");
		m9.setCity("Noida");
		m9.setIsOpen(true);
		mallArr.addMall(m9);

		MallAccount m10 = new MallAccount();
		m10.setMallName("Express Avenue");
		m10.setLocation("Royapettah");
		m10.setNumberOfShops(150);
		m10.setParkingCapacity(400);
		m10.setOpeningTime("10:30 AM");
		m10.setClosingTime("10:30 PM");
		m10.setCity("Chennai");
		m10.setIsOpen(true);
		mallArr.addMall(m10);

		MallAccount m11 = new MallAccount();
		m11.setMallName("Forum Vijaya Mall");
		m11.setLocation("Vadapalani");
		m11.setNumberOfShops(130);
		m11.setParkingCapacity(350);
		m11.setOpeningTime("10:00 AM");
		m11.setClosingTime("10:00 PM");
		m11.setCity("Chennai");
		m11.setIsOpen(true);
		mallArr.addMall(m11);

		MallAccount m12 = new MallAccount();
		m12.setMallName("GVK One Mall");
		m12.setLocation("Banjara Hills");
		m12.setNumberOfShops(110);
		m12.setParkingCapacity(300);
		m12.setOpeningTime("10:30 AM");
		m12.setClosingTime("10:30 PM");
		m12.setCity("Hyderabad");
		m12.setIsOpen(true);
		mallArr.addMall(m12);

		MallAccount m13 = new MallAccount();
		m13.setMallName("Inorbit Mall");
		m13.setLocation("Hitech City");
		m13.setNumberOfShops(140);
		m13.setParkingCapacity(450);
		m13.setOpeningTime("10:00 AM");
		m13.setClosingTime("10:00 PM");
		m13.setCity("Hyderabad");
		m13.setIsOpen(true);
		mallArr.addMall(m13);

		MallAccount m14 = new MallAccount();
		m14.setMallName("South City Mall");
		m14.setLocation("Jadavpur");
		m14.setNumberOfShops(160);
		m14.setParkingCapacity(500);
		m14.setOpeningTime("10:30 AM");
		m14.setClosingTime("10:30 PM");
		m14.setCity("Kolkata");
		m14.setIsOpen(true);
		mallArr.addMall(m14);

		MallAccount m15 = new MallAccount();
		m15.setMallName("Quest Mall");
		m15.setLocation("Park Circus");
		m15.setNumberOfShops(120);
		m15.setParkingCapacity(300);
		m15.setOpeningTime("11:00 AM");
		m15.setClosingTime("11:00 PM");
		m15.setCity("Kolkata");
		m15.setIsOpen(true);
		mallArr.addMall(m15);

		MallAccount m16 = new MallAccount();
		m16.setMallName("Elante Mall");
		m16.setLocation("Industrial Area");
		m16.setNumberOfShops(200);
		m16.setParkingCapacity(700);
		m16.setOpeningTime("10:00 AM");
		m16.setClosingTime("10:00 PM");
		m16.setCity("Chandigarh");
		m16.setIsOpen(true);
		mallArr.addMall(m16);

		MallAccount m17 = new MallAccount();
		m17.setMallName("Z Square Mall");
		m17.setLocation("Kanpur");
		m17.setNumberOfShops(180);
		m17.setParkingCapacity(600);
		m17.setOpeningTime("10:00 AM");
		m17.setClosingTime("10:00 PM");
		m17.setCity("Kanpur");
		m17.setIsOpen(true);
		mallArr.addMall(m17);

		MallAccount m18 = new MallAccount();
		m18.setMallName("City Centre Mall");
		m18.setLocation("Salt Lake");
		m18.setNumberOfShops(140);
		m18.setParkingCapacity(400);
		m18.setOpeningTime("10:30 AM");
		m18.setClosingTime("10:30 PM");
		m18.setCity("Kolkata");
		m18.setIsOpen(true);
		mallArr.addMall(m18);

		MallAccount m19 = new MallAccount();
		m19.setMallName("LuLu Mall");
		m19.setLocation("Edappally");
		m19.setNumberOfShops(250);
		m19.setParkingCapacity(900);
		m19.setOpeningTime("10:00 AM");
		m19.setClosingTime("10:00 PM");
		m19.setCity("Kochi");
		m19.setIsOpen(true);
		mallArr.addMall(m19);

				mallArr.getAllMalls();
			}
		}