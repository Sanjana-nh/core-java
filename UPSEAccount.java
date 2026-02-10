class UPSEAccount{
	public static void main(String[] args)
	{
	createUPSEAccount( "English","sanjananh","Finesse2929","Finesse2929","Chikkamagaluru","Yuki","Mrs","Sanjana","NH","sanjananh3210@gmail.com",8867580696L);
	}
	
	static void createUPSEAccount(String language,String userName,String password,String repeatPass,String bornCity,
	String petName,String title,String firstName,String lastName,String email,long phoneNumber)
	{	
		System.out.println("Language:"+language);
        System.out.println("User Name :"+userName);
        System.out.println("Password:"+password);
        System.out.println("Repeat Password :"+repeatPass);
        System.out.println("Born City :"+bornCity);
        System.out.println("Pet Name:"+petName);
        System.out.println("Title :"+title);
  		System.out.println("First Name:"+firstName);
        System.out.println("Last Name:"+lastName);
        System.out.println("Email:"+email);
        System.out.println("Phone Number:"+phoneNumber);
        System.out.println("Title :"+title);
	}
}