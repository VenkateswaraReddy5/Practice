package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Listpgrm {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		
		l.add(21);
		l.add(32);
		l.add("String");
		l.add(34.32);
		l.add(123456765434567L);
	 System.out.println(l);
	 List<Integer> l1=new LinkedList<>();
	 
	 l1.add(23);
	// l1.add("String"); //because here we r specifying the argument type i.e.,Integer values only stored
	 // l1.add(23.43);
	 System.out.println(l1);
	 List<String> l2=new Vector<>();//here we are storing only string values
	
	 //l2.add(23);
	 l2.add("String");
	 //l2.add(43.43);
	 System.out.println(l2);
	 
	 Set<Integer> s=new HashSet<>();
	  //s.add("@#$");
	  s.add(32);
	  s.add(833);
	  //s.add("String");
	  System.out.println(s);
	 
	  Set s1=new LinkedHashSet();
	  s1.add(32.566);
	  s1.add("Object");
	  s1.add(s);
	  System.out.println(s1);
	  
	  Set s2=new TreeSet();
	  s2.add(2133);
	  s2.add(321);
	  s2.add(12);
	 // s2.add();
	  //s2.add("LInk");
	  //s2.add(43.32);
	  
	  System.out.println(s2);
	  
	  Map m=new HashMap();
	  m.put(1, 12);
	  m.put("key", "value");
	  m.put(3, "String");
	  System.out.println(m);
	  

	}

}
