package generics;

class Pgrm1<T>{
	T obj;
	Pgrm1(T obj){
		this.obj=obj;
	}
	public T getObject() {
		return this.obj;
	}
}

 public class Pgrm{
	public static void main(String[] args) {
        
		Pgrm1<Integer> obj1=new Pgrm1<>(12);
		System.out.println(obj1.getObject());
		
		Pgrm1<String> obj2=new Pgrm1<>("HELLO");
		System.out.println(obj2.getObject());
		
		Pgrm1<Double> obj3=new Pgrm1<>(22.22);
		System.out.println(obj3.getObject());
	
    }
}