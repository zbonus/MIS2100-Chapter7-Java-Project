package Project7;

public class SimpleMath {
	
	public double divide(double num, double deno) {
		if(deno == 0) {
			throw new ArithmeticException("Cannot divide by 0");
		}
		
		return num/deno;
	}
	
	public double multiply(double n1, double n2) {
		return n1 * n2;
	}
}
