package operators;

public class Calcultor {

	public int add(int a, int b) {
		return a + b;
}
	public int minus(int a, int b) {
		return a - b;
	}		
	public int times(int a, int b) {
		return a * b;
		}		
	public Double divide(int a, int b) {
		double x = a;
		double y = b;
		
		if (x < y)
			return x / y;
	}   else {
			System.out.println("This division cannot be performed");
			}
}


