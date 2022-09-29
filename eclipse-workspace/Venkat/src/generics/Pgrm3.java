package generics;

public class Pgrm3 {
	
	
	public	static<T> void test(T element){
			System.out.println(element);
			
		}
	

	public static void main(String[] args) {
	 test(11);
	 test("String");
	 test(54.98);

	

	
		
	}

}
