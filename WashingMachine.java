class WashingMachine{
static boolean isConnected;
static boolean onOrOff(){
	if(isConnected == false){
	isConnected=true;
	System.out.println("The WashingMachine is turned on");
	}
	else if(isConnected == true){
	isConnected=false;
	System.out.println("The WashingMachine is turned off");
	}
	return isConnected;
	}
}