class HospitalRunner{
	public static void main(String[] args){
		Hospital hospital=new Hospital();
		hospital.hospitalName="Apollo";
		
		Doctor doctor=new Doctor();
		doctor.doctorName="Ramesh";
		doctor.doctorId=1;
		doctor.specialization="Gynocology";
		doctor.experience="20years";
		doctor.fees=200;
		
		hospital.doctor=doctor;
		
		
		hospital.getHospitalDetails();
		
		Hospital hospital1=new Hospital();
		hospital1.hospitalName="Kanva";
		
		Doctor doctor1=new Doctor();
		doctor1.doctorName="Shalini";
		doctor1.doctorId=4;
		doctor1.specialization="Dermatology";
		doctor1.experience="12 years";
		doctor1.fees=200;
		
		hospital1.doctor=doctor1;
		hospital1.getHospitalDetails();
}
}