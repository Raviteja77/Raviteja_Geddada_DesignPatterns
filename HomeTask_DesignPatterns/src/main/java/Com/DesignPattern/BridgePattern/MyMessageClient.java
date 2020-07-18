package Com.DesignPattern.BridgePattern;

public class MyMessageClient extends MessageSender {
	private String to = "developmentall@abc.com";
	public MyMessageClient(PlatformBridge implementation) {
		super(implementation);
	}

	public void sendMessageToAll(String from, String body) {
		sendMessage(from, to, body);
	}
}
