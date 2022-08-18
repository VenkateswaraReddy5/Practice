package java8;

@FunctionalInterface
public interface FunctionalInterfaceee {
	public void Perform(int j);
	public default void Operation() {
		System.out.println(" default method in interface ");
	};
   public static void Acting(int i) {
	   System.out.println(" static method in interface "+i);
   }
  
}
