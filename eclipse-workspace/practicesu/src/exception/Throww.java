package exception;

public class Throww {
	
	public Void ckeckAge(int age) {
		
		if(age<18) {
			ArithmeticException e=new ArithmeticException("Age not Supoorted");
			System.out.println(e.getMessage());
			throw e;
		}else {
			ArithmeticException e1=new ArithmeticException("Age Supoorted");
			//throw e1;
			System.out.println("age supoorted");
			throw e1;
		}
	}
//	public static void main(String[] args) {
//		ckeckAge(12);
//	
//	}

}
