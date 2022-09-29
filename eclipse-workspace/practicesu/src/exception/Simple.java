package exception;

public class Simple {

	public static void main(String[] args) {
		
		try {
		int i=128/8;
		
		System.out.println(i);
		}catch(ArithmeticException e) {
		     System.err.println(e.getMessage() + " Not Possiable");
		}
		
		

	}

}
