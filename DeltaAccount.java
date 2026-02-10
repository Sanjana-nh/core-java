class DeltaAccount{
	public static void main(String[] args)
	{
	createDeltaAccount("sanjananh3210@gmail.com","Finesse2929","Finesse2929","Sanjana","NH","November",30,2003);
	}
	
	static void createDeltaAccount(String userEmail,String password,String confirmPass,String firstName,
	String lastName,String dobMonth,int dobDay,int dobYear)
	{
  System.out.println("First Name:"+firstName);
  System.out.println("Last Name:"+lastName);
  System.out.println("Date of Birth:"+dobDay);
  System.out.println("Month of Birth :"+dobMonth);
  System.out.println("Year of Birth :"+dobYear);
  System.out.println("User Email:"+userEmail);
  System.out.println("Password :"+password);
  System.out.println("Confirm Password :"+confirmPass);
	}
}