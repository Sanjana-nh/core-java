class GitAccount{
	public static void main(String[] gitHub){
	createGitAccount("sanjananh3210@gmail.com","dhebdgywdb","sanjana_nh","India",false);
	}
	
	static void createGitAccount(String email,String password,String userName,String country,boolean emailPreferences)
	{

	System.out.println("Email:"+email);
	System.out.println("Password :"+password);
	System.out.println("User name :"+userName);
	System.out.println("Country:"+country);
	System.out.println("Email Preferences :"+emailPreferences);
	}
}