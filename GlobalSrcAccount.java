class GlobalSrcAccount{
	public static void main(String[] glblsrcs)
	{
	createGlobalSrcAccount( "India","XWorkz","Sanjana","NH","Engineer","noobsnightmre@gmail.com",
	"+91",569916,6366327453L,"Finesse2929","Finesse2929");
	}
	static void createGlobalSrcAccount(String country,String companyName,String firstName,String lastName ,String jobTitle,
	String email,String region,int areaCode ,long phoneNumber,String password,String confirmPass )
	{	
		System.out.println("Country:"+country);
        System.out.println("Company Name :"+companyName);
  		System.out.println("First Name:"+firstName);
        System.out.println("Last Name:"+lastName);
        System.out.println("Job Title:"+jobTitle);
        System.out.println("Email:"+email);
        System.out.println("Region :"+region);
        System.out.println("Area Code:"+areaCode);
		System.out.println("Mobile Number :"+phoneNumber);
		System.out.println("Password :"+password);
		System.out.println("Confirm Password:"+confirmPass);

	}
}