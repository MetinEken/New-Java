package day27_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C3_ListtoArray {

	public static void main(String[] args) {
		
		
		List<String> list1= new ArrayList<>();
		list1.add("ali");
		list1.add("veli");
		
		String arr[]= list1.toArray(new String[0]);
		
System.out.println(Arrays.toString(arr));
	}

}
