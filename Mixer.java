class Mixer{
static boolean isGrinding;
static boolean onOrOff(){
if(isGrinding==false){
isGrinding=true;
System.out.println("the mixer is turned on");
}
else{
isGrinding=false;
System.out.println("the mixer is turned off");
}
return isGrinding;
}
}