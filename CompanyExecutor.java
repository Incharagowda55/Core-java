class CompanyExecutor{
    public static void main(String[] args){

        Project project = new Project(201,"AI System",12);

        Company company = new Company(1,"Infosys",project);

        company.getCompanyDetails();
	
        Project pr1=new Project(1,"AI",12);
        Company c1=new Company(1,"Infosys",pr1);
        c1.project=pr1;
        c1.getCompanyDetails();

        Project pr2=new Project(2,"ML",10);
        Company c2=new Company(2,"TCS",pr2);
        c2.project=pr2;
        c2.getCompanyDetails();

        Project pr3=new Project(3,"Web",8);
        Company c3=new Company(3,"Wipro",pr3);
        c3.project=pr3;
        c3.getCompanyDetails();

        Project pr4=new Project(4,"Cloud",14);
        Company c4=new Company(4,"Google",pr4);
        c4.project=pr4;
        c4.getCompanyDetails();

        Project pr5=new Project(5,"App",6);
        Company c5=new Company(5,"Microsoft",pr5);
        c5.project=pr5;
        c5.getCompanyDetails();

        Project pr6=new Project(6,"Security",9);
        Company c6=new Company(6,"IBM",pr6);
        c6.project=pr6;
        c6.getCompanyDetails();

        Project pr7=new Project(7,"DevOps",11);
        Company c7=new Company(7,"Oracle",pr7);
        c7.project=pr7;
        c7.getCompanyDetails();

        Project pr8=new Project(8,"Data",13);
        Company c8=new Company(8,"Amazon",pr8);
        c8.project=pr8;
        c8.getCompanyDetails();

        Project pr9=new Project(9,"AI",15);
        Company c9=new Company(9,"Meta",pr9);
        c9.project=pr9;
        c9.getCompanyDetails();

        Project pr10=new Project(10,"Blockchain",16);
        Company c10=new Company(10,"Tesla",pr10);
        c10.project=pr10;
        c10.getCompanyDetails();
    }
}