package exception;

public class ThrowingEx {
	
	public static void main(String[] args) throws Throwww {
		msgreturn();
		
	}
	
	public static void msgreturn() throws Throwww {
		Throwww	e= new Throwww("five grater than three");
		System.out.println(e.getMessage());
		e.printStackTrace();
		throw e;
		//System.out.println(e.getMessage());
		
	}

}
