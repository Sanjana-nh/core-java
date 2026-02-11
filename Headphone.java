class Headphone{
	static boolean isWorking;
	static boolean onOrOff(){
	if(isWorking == false){
	isWorking=true;
	System.out.println("The Headphone is turned on");
	}
	else if(isWorking == true){
	isWorking=false;
	System.out.println("The Headphone is turned off");
	}
	return isWorking;
	}
	}