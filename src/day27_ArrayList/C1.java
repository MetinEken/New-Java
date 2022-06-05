package day27_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C1 {

	public static void main(String[] args) {

	List<Integer> list1 = new ArrayList<>();
	list1.add(10);
	list1.add(20);
	
	List<Integer> list2 = new ArrayList<>();
	list2.add(10);
	list2.add(20);
	
	System.out.println(list1.equals(list2)); // true verir
												// hem elemana hem de elemaan yerlerine bakar.
	}

}
