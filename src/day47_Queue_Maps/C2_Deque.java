package day47_Queue_Maps;

import java.util.Deque;
import java.util.LinkedList;

public class C2_Deque {

	public static void main(String[] args) {
		
		Deque<String> dk1= new LinkedList<>();
		
		//double ended = cift tarafli
		
		dk1.add("A");
		dk1.add("B");
		dk1.add("D");	 // ekleme sirasina gore siraladi
		dk1.add("C");
		dk1.add("K");
		dk1.addFirst("A1"); // basa ekler dk1.push da basa ekleme yapar
		System.out.println(dk1);
		
		
		
		

	}

}
