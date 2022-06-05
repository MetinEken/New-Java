package day47_Queue_Maps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		// Queue bir interface dir, obje uretemeyiz
		// Chil class olan Priorityqueue veya LinkedList secebiliriz

		Queue<String> x = new PriorityQueue<>();
		
		x.add("A");
		x.add("D");
		x.add("C");
		x.add("B");
		x.add("K");
		x.add("2"); 
		x.add("G");
		x.add("1"); 
		System.out.println(x);  //[1, 2, A, B, K, C, G, D]  genellikle alfabetik ekler
		
		x.offer("K");
		System.out.println(x);  // sona ekler
		x.offer("L");			// sona eklemeyebilir, 
		System.out.println(x); 
		x.remove();
		System.out.println(x); //
		x.remove();
		System.out.println(x); // bastan silmeye basladi, siralama her defasinda degisiyor
Queue<String> y = new LinkedList<>();
		
		y.add("A");
		y.add("c");
		y.add("b");
		y.add("d");
		y.add("e");
		y.add("1"); 
		System.out.println(y);  //[A, c, b, d, e, 1] ekleme sirasina gore siralar
		
		y.offer("k"); // sona ekliyor
		System.out.println(y);
		y.peek(); // ilk elemani getirir. 
		y.remove();
		System.out.println(y);
		y.remove();
		System.out.println(y); // siarsiyla ilk ekledigini silmeye baslar
		
	}

}
