  package day25_Arrays;

import java.util.Arrays;

public class asfs {
	public static void main(String[] args) {
		
		//int x[][][]= {{{1,1},{1,2}},{{2,2},{2,2},{2,2}},{{3,2},{3,2},{3,2},{3,2}}};
		 int x[][]= {{1,2,3},{5,8},{9,6,5,1}}; 
		//System.out.println(x.length+" "+x[0].length+" "+x[0][0].length);
		System.out.println(Arrays.deepToString(x));
		// Arraydeki sayilain toplamini bulalim
		
		//{{{1},{1}}, {{2},{2},{2}}, {{3},{3},{3},{3}}}
		
		int toplam=0;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				toplam+=x[i][j];
			}
		}
		
		
		
//		for (int i = 0; i < x.length; i++) {
//			for (int j = 0; j < x[i].length; j++) {
//				for (int j2 = 0; j2 < x[j].length; j2++) {
//					toplam+=x[i][j][j2];
//				}
//			}
//		}
		System.out.println("Array x in elemanlarinin toplami : " +toplam);
	}

}
