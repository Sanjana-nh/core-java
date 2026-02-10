class XAccount{
	public static void main(String[] facebook){
	createXAccount("Sanjana","NH",30,"November",2003,"Female","sanjananh3210@gmail.com","jjbybdxgfegfn");
	}
	
	static void createXAccount(String firstName,String lastName,int dobDay,String dobMonth,int dobYear,
	String gender,String mobileNumberOrEmail,String passwordNew)
	{	
  System.out.println("First Name:"+firstName);
  System.out.println("Last Name:"+lastName);
  System.out.println("Date of Birth:"+dobDay);
  System.out.println("Month of Birth :"+dobMonth);
  System.out.println("Year of Birth :"+dobYear);
  System.out.println("Gender :"+gender);
  System.out.println("Mobile Number / Email :"+mobileNumberOrEmail);
  System.out.println("Password :"+passwordNew);
	}
}