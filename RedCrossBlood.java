class RedCrossBlood{
	static void createDonorAccount(String emailId,int donerId, String name, 
	String userName,int zipCode,String password, String repeatPassword)
	{
	System.out.println("The email :"+emailId);
	System.out.println("The doner ID :"+donerId);
	System.out.println("The doner name:"+name);
	System.out.println("The doner username :"+userName);
	System.out.println("The Zip-Code :"+zipCode);
	System.out.println("The Password :"+password);
	System.out.println("The Repeat Password :"+repeatPassword);
	}
	public static void main(String[]args)
	{
	createDonorAccount("babaji911@gmail.com",1919,"Baba Ramdas","baba_ji",
	550010, "ggfyugyjh", "ggfyugyjh");
	}
}