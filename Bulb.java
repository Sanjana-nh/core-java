class Bulb{
static boolean isWorking;
static boolean onOrOff(){
if(isWorking == false)
{
	isWorking=true;
	System.out.println("The Bulb is turn ON");
}
else if (isWorking == true)
{
	isWorking=false;
	System.out.println("The Bulb is turn OFF");
}
return isWorking;
}
}