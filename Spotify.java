class Spotify{
	static void createAccount(String emailId, long phno,String password,String name,String dob)
	{
		System.out.println("Email Address:"+emailId);
		System.out.println("Phone Number:"+phno);
		System.out.println("Password:"+password);
		System.out.println("Name:"+name);
		System.out.println("Date of Birth:"+dob);
	}
	public static void main(String[]args)
	{
	createAccount("sanjananh30@gmail.com",8867580696L, "gidwqydgd", "Sanjana", "30-11-2003");
	}
}