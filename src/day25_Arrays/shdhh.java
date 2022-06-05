package day25_Arrays;

import java.util.Arrays;

public class shdhh {

	public static void main(String[] args) {
		int x[][][]= {{{1,1},{1,2}},{{2,2},{2,2},{2,2}},{{3,2},{3,2},{3,2},{3,2}}};
		 
		System.out.println(x.length+" "+x[0].length+" "+x[0][0].length);
		System.out.println(Arrays.deepToString(x));

	}

}
