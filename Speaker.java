class Speaker{
static boolean isConnected;
static boolean onOrOff(){
if(isConnected == false)
{
	isConnected=true;
	System.out.println("The Bulb is turn ON");
}
else if (isConnected == true)
{
	isConnected=false;
	System.out.println("The Bulb is turn OFF");
}
return isConnected;
}
}