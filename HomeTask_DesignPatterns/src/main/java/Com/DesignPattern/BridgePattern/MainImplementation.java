package Com.DesignPattern.BridgePattern;

public class MainImplementation 
{
	public static void main (String[] args)
	{
		new MyMessageClient(new WindowsImplementation()).sendMessageToAll("abc@gmail.com", "Test");
	}
}
