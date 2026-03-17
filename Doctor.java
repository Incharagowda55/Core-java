class Doctor
{
    int doctorId;
    String doctorName;
    String doctorSpecialization;
    String exp;
    int fees;
	
	public Doctor(int doctorId,String doctorName,String doctorSpecialization,String exp,int fees){
		this.doctorId=doctorId;
		this.doctorName=doctorName;
		this.doctorSpecialization=doctorSpecialization;
		this.exp=exp;
		this.fees=fees;
	}
	

    public void getDoctorDetails()
    {
        System.out.println(this.doctorId);
        System.out.println(this.doctorName);
        System.out.println(this.doctorSpecialization);
        System.out.println(this.exp);
        System.out.println(this.fees);
    }
}
