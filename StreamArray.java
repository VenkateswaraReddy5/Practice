package java8;
import java.util.*;

public class StreamArray {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(12);
		l.add(21);
		l.add(23);
		l.add(24);
		l.add(654);
		l.stream().forEach(System.out::println);

	}

	

}
