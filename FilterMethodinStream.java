package java8;

import java.util.List;

public class FilterMethodinStream {

	public static void main(String[] args) {
		
		List<String> l=List.of("Virat","Rohith","Rcb","Venkat","Rahul","Jany","Ganesh","Sharuk khan","King");
		l.stream().filter(k->k.charAt(0)=='V').forEach(System.out::println);
             
	}

}
