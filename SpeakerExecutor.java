class SpeakerExecutor{
public static void main(String[]args)
{
	boolean mic = Speaker.onOrOff();
	System.out.println("The Speaker is connected:"+mic);
}
}