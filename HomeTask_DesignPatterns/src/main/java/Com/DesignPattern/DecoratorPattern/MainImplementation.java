package Com.DesignPattern.DecoratorPattern;

public class MainImplementation {
	public static void main (String[] args) throws java.lang.Exception
	{	
		final String text = "text";
		final PrintText object = new PrintAsciiText();
		final PrintText printer = new PrintTextHexDecorator(object);
		
		object.print(text);
		printer.print(text);
	}

}
