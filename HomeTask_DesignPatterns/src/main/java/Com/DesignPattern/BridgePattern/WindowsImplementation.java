package Com.DesignPattern.BridgePattern;

class WindowsImplementation implements PlatformBridge {
	public void forwardMessage(String msg) {
		System.out.printf("Sending message \n%s \nFrom the windows machine", msg);
	}
}
