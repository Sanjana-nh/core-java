class Hospital{
	String hospitalName;
	Doctor doctor;

public void getHospitalDetails(){
	System.out.println("------------------------");
	System.out.println("The Hospital Name is :"+hospitalName);
	this.doctor.getDoctorDetails();
}
}