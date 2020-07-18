package Com.DesignPattern.IteratorPattern;

public class MainImplementation {
	public static void main(String s[]){
		String arr[]= {"a", "b", "c", "d"};
		StringArray strarr = new StringArray(arr);
		for (Iterator it = strarr.createIterator(); it.hasNext(); ) 
			   System.out.println(it.next());
	}
}
