class TrainExecutor{
	public static void main(String[]args){
		 Boggy boggy=new Boggy(3,95,"D4");
		 Train train=new Train(101,"Janashatapdi",boggy);
		 
		 train.boggy=boggy;
		 
		 train.getTrainDetails();
		 
	
        Boggy b1 = new Boggy(1,72,"S1");
        Train t1 = new Train(101,"Rajdhani",b1);
        t1.getTrainDetails();
		t1.boggy=b1;

        System.out.println("----------------");

        Boggy b2 = new Boggy(2,60,"A1");
        Train t2 = new Train(102,"Shatabdi",b2);
        t2.getTrainDetails();
		t2.boggy=b2;

        System.out.println("----------------");

        Boggy b3 = new Boggy(3,90,"G1");
        Train t3 = new Train(103,"Express",b3);
        t3.getTrainDetails();
		t3.boggy=b3;

        System.out.println("----------------");

        Boggy b4 = new Boggy(4,72,"S2");
        Train t4 = new Train(104,"Duronto",b4);
        t4.getTrainDetails();
		t4.boggy=b4;

        System.out.println("----------------");

        Boggy b5 = new Boggy(5,60,"A2");
        Train t5 = new Train(105,"JanShatabdi",b5);
        t5.getTrainDetails();
        t5.boggy=b5;
        System.out.println("----------------");

        Boggy b6 = new Boggy(6,72,"S3");
        Train t6 = new Train(106,"Intercity",b6);
        t6.getTrainDetails();
		t6.boggy=b6;

        System.out.println("----------------");

        Boggy b7 = new Boggy(7,90,"G2");
        Train t7 = new Train(107,"Passenger",b7);
        t7.getTrainDetails();
		t7.boggy=b7;

        System.out.println("----------------");

        Boggy b8 = new Boggy(8,60,"A3");
        Train t8 = new Train(108,"Superfast",b8);
        t8.getTrainDetails();
		t8.boggy=b8;

        System.out.println("----------------");

        Boggy b9 = new Boggy(9,72,"S4");
        Train t9 = new Train(109,"Mail",b9);
        t9.getTrainDetails();
		t9.boggy=b9;

        System.out.println("----------------");

        Boggy b10 = new Boggy(10,90,"G3");
        Train t10 = new Train(110,"Local",b10);
        t10.getTrainDetails();
		t10.boggy=b10;

    }
}
		 
				 
		 
		 
		
		 
		 
		
