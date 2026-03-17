class HospitalExecuter
{
    public static void main(String[] args)
    {
        Doctor doctor=new Doctor(101,"Dr VidyaRamesh","Dermatologist","15 years",500);
        
		
        Hospital hospital = new Hospital(1,"Sparsha","Vidyanagar",doctor);
		
        hospital.doctor = doctor;


        hospital.getHospitalDetails();

        System.out.println("................................");
		
		
     
    }
}
 