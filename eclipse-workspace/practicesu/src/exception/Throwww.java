package exception;

public class Throwww extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public Throwww(String msg) {
		this.msg=msg;
	}
	
	public String toString() {
		return msg;
	}

}
