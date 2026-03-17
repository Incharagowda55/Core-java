class Hospital{

    int hospitalId;
    String hospitalName;
    String branch;
    Doctor doctor;//custom type
	
	

	public Hospital(int hospitalId,String hospitalName,String branch,Doctor doctor){
		this.hospitalId=hospitalId;
		this.hospitalName=hospitalName;
		this.branch=branch;
		this.doctor=doctor;
	}
		
    public void getHospitalDetails()
    {
        System.out.println(this.hospitalId);
        System.out.println(this.hospitalName);
        System.out.println(this.branch);
        this.doctor.getDoctorDetails(); // to call the instance we use the reference not the class name
    }
}

