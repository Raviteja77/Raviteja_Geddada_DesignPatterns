package Com.DesignPattern.BridgePattern;

public class LinuxImplementation implements PlatformBridge {
	public void forwardMessage(String msg) {
		System.out.printf("Sending message \n%s \nFrom the linux machine", msg);
	}
}
