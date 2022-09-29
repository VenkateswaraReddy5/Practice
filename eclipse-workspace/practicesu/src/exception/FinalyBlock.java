package exception;

public class FinalyBlock {

	public static void main(String[] args) {

		try {
			
			int i=19/9;
			System.out.println(i);
			try {
				System.out.println("nested try");
				int j=9/0;
				System.out.println(j);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}finally {
			System.out.println("finalyy block will execute irresepective exception");
		}

	}

}
