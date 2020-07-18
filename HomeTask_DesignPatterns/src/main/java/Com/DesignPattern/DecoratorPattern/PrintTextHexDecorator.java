package Com.DesignPattern.DecoratorPattern;

import java.util.stream.Collectors;

public class PrintTextHexDecorator implements PrintText {
	
	private PrintText inner;

	public PrintTextHexDecorator(PrintText inner) {
		this.inner = inner;
	}
	
	public void print(String text) {
		String hex = text.chars()
				.boxed()
	        	.map(x -> "0x" + Integer.toHexString(x))
	 			.collect(Collectors.joining(" "));
		inner.print(text + " -> HEX: " + hex);
	}
}
