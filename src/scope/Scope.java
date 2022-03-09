package scope;

public class Scope {
	//This is class level scope (instance scope)
	public String message = "hello";
	
	public void methodOne() {
		// This is local scope (Method Scope)
		String snotherMessage = "Goodbye";
		System.out.println(message);
		
	}
	
		public void methodTwo(String message) {
			System.out.println(message);
		}
}
