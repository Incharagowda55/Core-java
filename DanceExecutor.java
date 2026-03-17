class DanceExecutor{
    public static void main(String[] args){

        Form form=new Form(1,"Riya","HipHop");

        Dance dance=new Dance(101,"Dance Competition",form);

        dance.getDanceDetails();
		
        Form f1=new Form(1,"Riya","HipHop");
        Dance d1=new Dance(101,"Event1",f1);
        d1.getDanceDetails();

        Form f2=new Form(2,"Anu","Classical");
        Dance d2=new Dance(102,"Event2",f2);
        d2.getDanceDetails();

        Form f3=new Form(3,"Megha","Folk");
        Dance d3=new Dance(103,"Event3",f3);
        d3.getDanceDetails();

        Form f4=new Form(4,"Sneha","Western");
        Dance d4=new Dance(104,"Event4",f4);
        d4.getDanceDetails();

        Form f5=new Form(5,"Divya","HipHop");
        Dance d5=new Dance(105,"Event5",f5);
        d5.getDanceDetails();

        Form f6=new Form(6,"Pooja","Bharatanatyam");
        Dance d6=new Dance(106,"Event6",f6);
        d6.getDanceDetails();

        Form f7=new Form(7,"Neha","Folk");
        Dance d7=new Dance(107,"Event7",f7);
        d7.getDanceDetails();

        Form f8=new Form(8,"Ravi","BreakDance");
        Dance d8=new Dance(108,"Event8",f8);
        d8.getDanceDetails();

        Form f9=new Form(9,"Arun","Western");
        Dance d9=new Dance(109,"Event9",f9);
        d9.getDanceDetails();

        Form f10=new Form(10,"Kiran","Classical");
        Dance d10=new Dance(110,"Event10",f10);
        d10.getDanceDetails();
    }
}
    