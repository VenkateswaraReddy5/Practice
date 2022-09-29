package generics;


class Demo<T> {
	T t;
	Demo(T t){
		this.t=t;
	}
	public T getObject() {
		return this.t;
	}
	
}

public class Pgrm2{

	public static void main(String[] args) {
		
		Demo<String> d=new Demo<String>("hi");
		Demo<String> d1=new Demo<String>("H r r");
		System.out.println(d.getObject());
		System.out.println(d.getObject());
		

	}

}
