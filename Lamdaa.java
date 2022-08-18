package java8;

  interface Demo{
	public void pgrm1();
}

public class Lamdaa {

	public static void main(String[] args) {
		Demo d=()->{
			System.out.println("Lambda Excepressions");
		};
			d.pgrm1();

			Demo d1=new Demo() {

				@Override
				public void pgrm1() {
					System.out.println("with out using lambda Expressions");
			
				}
		
			};
				d1.pgrm1();
				
		
	}
	
}