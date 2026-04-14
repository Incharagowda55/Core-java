class RedbusRunner {

    public static void main(String[] args) {

        RedbusArray redArr = new RedbusArray();

        RedbusAccount r1 = new RedbusAccount();
        r1.setPassengerName("Inch");
        r1.setEmail("inch@gmail.com");
        r1.setPhoneNumber("9876543210");
        r1.setSource("Bangalore");
        r1.setDestination("Mysore");
        r1.setBusType("AC Sleeper");
        r1.setTicketPrice(850);
        r1.setIsBooked(true);

        redArr.bookTicket(r1);

        RedbusAccount r2 = new RedbusAccount();
        r2.setPassengerName("Anu");
        r2.setEmail("anu@gmail.com");
        r2.setPhoneNumber("8765432109");
        r2.setSource("Delhi");
        r2.setDestination("Jaipur");
        r2.setBusType("Non-AC Seater");
        r2.setTicketPrice(500);
        r2.setIsBooked(true);

        redArr.bookTicket(r2);
		
		
		RedbusAccount r3 = new RedbusAccount();
		r3.setPassengerName("Ravi");
		r3.setEmail("ravi@gmail.com");
		r3.setPhoneNumber("9000000001");
		r3.setSource("Chennai");
		r3.setDestination("Bangalore");
		r3.setBusType("AC Sleeper");
		r3.setTicketPrice(900);
		r3.setIsBooked(true);
		redArr.bookTicket(r3);

		RedbusAccount r4 = new RedbusAccount();
		r4.setPassengerName("Sneha");
		r4.setEmail("sneha@gmail.com");
		r4.setPhoneNumber("9000000002");
		r4.setSource("Hyderabad");
		r4.setDestination("Vizag");
		r4.setBusType("AC Seater");
		r4.setTicketPrice(700);
		r4.setIsBooked(true);
		redArr.bookTicket(r4);

		RedbusAccount r5 = new RedbusAccount();
		r5.setPassengerName("Kiran");
		r5.setEmail("kiran@gmail.com");
		r5.setPhoneNumber("9000000003");
		r5.setSource("Mumbai");
		r5.setDestination("Pune");
		r5.setBusType("Non-AC Seater");
		r5.setTicketPrice(400);
		r5.setIsBooked(true);
		redArr.bookTicket(r5);

		RedbusAccount r6 = new RedbusAccount();
		r6.setPassengerName("Pooja");
		r6.setEmail("pooja@gmail.com");
		r6.setPhoneNumber("9000000004");
		r6.setSource("Delhi");
		r6.setDestination("Agra");
		r6.setBusType("AC Sleeper");
		r6.setTicketPrice(600);
		r6.setIsBooked(true);
		redArr.bookTicket(r6);

		RedbusAccount r7 = new RedbusAccount();
		r7.setPassengerName("Manoj");
		r7.setEmail("manoj@gmail.com");
		r7.setPhoneNumber("9000000005");
		r7.setSource("Kolkata");
		r7.setDestination("Patna");
		r7.setBusType("AC Seater");
		r7.setTicketPrice(650);
		r7.setIsBooked(true);
		redArr.bookTicket(r7);

		RedbusAccount r8 = new RedbusAccount();
		r8.setPassengerName("Divya");
		r8.setEmail("divya@gmail.com");
		r8.setPhoneNumber("9000000006");
		r8.setSource("Bangalore");
		r8.setDestination("Goa");
		r8.setBusType("Sleeper");
		r8.setTicketPrice(1200);
		r8.setIsBooked(true);
		redArr.bookTicket(r8);

		RedbusAccount r9 = new RedbusAccount();
		r9.setPassengerName("Arjun");
		r9.setEmail("arjun@gmail.com");
		r9.setPhoneNumber("9000000007");
		r9.setSource("Mysore");
		r9.setDestination("Chennai");
		r9.setBusType("AC Sleeper");
		r9.setTicketPrice(950);
		r9.setIsBooked(true);
		redArr.bookTicket(r9);

		RedbusAccount r10 = new RedbusAccount();
		r10.setPassengerName("Neha");
		r10.setEmail("neha@gmail.com");
		r10.setPhoneNumber("9000000008");
		r10.setSource("Pune");
		r10.setDestination("Mumbai");
		r10.setBusType("Non-AC Seater");
		r10.setTicketPrice(350);
		r10.setIsBooked(true);
		redArr.bookTicket(r10);

		RedbusAccount r11 = new RedbusAccount();
		r11.setPassengerName("Suresh");
		r11.setEmail("suresh@gmail.com");
		r11.setPhoneNumber("9000000009");
		r11.setSource("Nagpur");
		r11.setDestination("Bhopal");
		r11.setBusType("AC Seater");
		r11.setTicketPrice(550);
		r11.setIsBooked(true);
		redArr.bookTicket(r11);

		RedbusAccount r12 = new RedbusAccount();
		r12.setPassengerName("Meena");
		r12.setEmail("meena@gmail.com");
		r12.setPhoneNumber("9000000010");
		r12.setSource("Surat");
		r12.setDestination("Ahmedabad");
		r12.setBusType("Non-AC Seater");
		r12.setTicketPrice(300);
		r12.setIsBooked(true);
		redArr.bookTicket(r12);

		RedbusAccount r13 = new RedbusAccount();
		r13.setPassengerName("Vikram");
		r13.setEmail("vikram@gmail.com");
		r13.setPhoneNumber("9000000011");
		r13.setSource("Lucknow");
		r13.setDestination("Delhi");
		r13.setBusType("AC Sleeper");
		r13.setTicketPrice(800);
		r13.setIsBooked(true);
		redArr.bookTicket(r13);

		RedbusAccount r14 = new RedbusAccount();
		r14.setPassengerName("Kavya");
		r14.setEmail("kavya@gmail.com");
		r14.setPhoneNumber("9000000012");
		r14.setSource("Coimbatore");
		r14.setDestination("Chennai");
		r14.setBusType("AC Seater");
		r14.setTicketPrice(500);
		r14.setIsBooked(true);
		redArr.bookTicket(r14);

		RedbusAccount r15 = new RedbusAccount();
		r15.setPassengerName("Deepak");
		r15.setEmail("deepak@gmail.com");
		r15.setPhoneNumber("9000000013");
		r15.setSource("Patna");
		r15.setDestination("Kolkata");
		r15.setBusType("Sleeper");
		r15.setTicketPrice(700);
		r15.setIsBooked(true);
		redArr.bookTicket(r15);

		RedbusAccount r16 = new RedbusAccount();
		r16.setPassengerName("Asha");
		r16.setEmail("asha@gmail.com");
		r16.setPhoneNumber("9000000014");
		r16.setSource("Indore");
		r16.setDestination("Ujjain");
		r16.setBusType("Non-AC Seater");
		r16.setTicketPrice(250);
		r16.setIsBooked(true);
		redArr.bookTicket(r16);

		RedbusAccount r17 = new RedbusAccount();
		r17.setPassengerName("Rahul");
		r17.setEmail("rahul@gmail.com");
		r17.setPhoneNumber("9000000015");
		r17.setSource("Bhopal");
		r17.setDestination("Indore");
		r17.setBusType("AC Seater");
		r17.setTicketPrice(400);
		r17.setIsBooked(true);
		redArr.bookTicket(r17);

		RedbusAccount r18 = new RedbusAccount();
		r18.setPassengerName("Priya");
		r18.setEmail("priya@gmail.com");
		r18.setPhoneNumber("9000000016");
		r18.setSource("Trichy");
		r18.setDestination("Madurai");
		r18.setBusType("Sleeper");
		r18.setTicketPrice(450);
		r18.setIsBooked(true);
		redArr.bookTicket(r18);

		RedbusAccount r19 = new RedbusAccount();
		r19.setPassengerName("Harish");
		r19.setEmail("harish@gmail.com");
		r19.setPhoneNumber("9000000017");
		r19.setSource("Goa");
		r19.setDestination("Bangalore");
		r19.setBusType("AC Sleeper");
		r19.setTicketPrice(1100);
		r19.setIsBooked(true);
		redArr.bookTicket(r19);

				redArr.getAllTickets();
			}
		}