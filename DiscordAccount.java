class DiscordAccount{
	public static void main(String[] facebook){
	createDiscordAccount("Sanjana","NH","sanjana_nh",30,"November",2003,"Female","sanjananh3210@gmail.com","jjbybdxgfegfn");
	}
	
	static void createDiscordAccount(String firstName,String lastName,String username,int dobDay,String dobMonth,int dobYear,
	String gender,String mobileNumberOrEmail,String passwordNew)
	{	
  System.out.println("First Name:"+firstName);
  System.out.println("Last Name:"+lastName);
  System.out.println("Username:"+username);
  System.out.println("Date of Birth:"+dobDay);
  System.out.println("Month of Birth :"+dobMonth);
  System.out.println("Year of Birth :"+dobYear);
  System.out.println("Gender :"+gender);
  System.out.println("Mobile Number / Email :"+mobileNumberOrEmail);
  System.out.println("Password :"+passwordNew);
	}
}